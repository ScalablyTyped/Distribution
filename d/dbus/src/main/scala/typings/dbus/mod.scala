package typings.dbus

import org.scalablytyped.runtime.StringDictionary
import typings.dbus.anon.Bus
import typings.dbus.anon.Getter
import typings.dbus.anon.In
import typings.dbus.anon.Types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @deprecated
    */
  @JSImport("dbus", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DBus
  @JSImport("dbus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("dbus", "Error")
  @js.native
  open class Error protected () extends StObject {
    def this(name: String, message: String) = this()
    
    val dbusName: String = js.native
  }
  
  inline def Signature(`type`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Signature")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBus(`type`: busType): DBusConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("getBus")(`type`.asInstanceOf[js.Any]).asInstanceOf[DBusConnection]
  
  inline def registerService(busName: busType): DBusService = ^.asInstanceOf[js.Dynamic].applyDynamic("registerService")(busName.asInstanceOf[js.Any]).asInstanceOf[DBusService]
  inline def registerService(busName: busType, serviceName: String): DBusService = (^.asInstanceOf[js.Dynamic].applyDynamic("registerService")(busName.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[DBusService]
  
  type AnyInterfaceMethod = StringDictionary[js.Function1[/* repeated */ Any, Unit]]
  
  /**
    * @deprecated
    */
  trait DBus extends StObject
  
  trait DBusConnection extends StObject {
    
    def disconnect(): Unit
    
    /* tslint:disable-next-line:no-unnecessary-generics */
    def getInterface[T](
      serviceName: String,
      objectPath: String,
      interfaceName: String,
      callback: js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[T], Unit]
    ): Unit
    
    def getUniqueServiceName(serviceName: String, callback: js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]): Unit
    
    def reconnect(callback: js.Function0[Unit]): Unit
  }
  object DBusConnection {
    
    inline def apply(
      disconnect: () => Unit,
      getInterface: (String, String, String, js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[Any], Unit]) => Unit,
      getUniqueServiceName: (String, js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]) => Unit,
      reconnect: js.Function0[Unit] => Unit
    ): DBusConnection = {
      val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), getInterface = js.Any.fromFunction4(getInterface), getUniqueServiceName = js.Any.fromFunction2(getUniqueServiceName), reconnect = js.Any.fromFunction1(reconnect))
      __obj.asInstanceOf[DBusConnection]
    }
    
    extension [Self <: DBusConnection](x: Self) {
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setGetInterface(
        value: (String, String, String, js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[Any], Unit]) => Unit
      ): Self = StObject.set(x, "getInterface", js.Any.fromFunction4(value))
      
      inline def setGetUniqueServiceName(value: (String, js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]) => Unit): Self = StObject.set(x, "getUniqueServiceName", js.Any.fromFunction2(value))
      
      inline def setReconnect(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "reconnect", js.Any.fromFunction1(value))
    }
  }
  
  type DBusInterface[T] = Bus & (PickMatching[T, js.Function1[/* repeated */ Any, Unit]])
  
  trait DBusService extends StObject {
    
    var bus: DBusConnection
    
    def createObject(path: String): DBusServiceObject
    
    def disconnect(): Unit
    
    def removeObject(service: DBusServiceObject): Unit
    
    var serviceName: String
  }
  object DBusService {
    
    inline def apply(
      bus: DBusConnection,
      createObject: String => DBusServiceObject,
      disconnect: () => Unit,
      removeObject: DBusServiceObject => Unit,
      serviceName: String
    ): DBusService = {
      val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], createObject = js.Any.fromFunction1(createObject), disconnect = js.Any.fromFunction0(disconnect), removeObject = js.Any.fromFunction1(removeObject), serviceName = serviceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DBusService]
    }
    
    extension [Self <: DBusService](x: Self) {
      
      inline def setBus(value: DBusConnection): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
      
      inline def setCreateObject(value: String => DBusServiceObject): Self = StObject.set(x, "createObject", js.Any.fromFunction1(value))
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setRemoveObject(value: DBusServiceObject => Unit): Self = StObject.set(x, "removeObject", js.Any.fromFunction1(value))
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DBusServiceInterface extends StObject {
    
    def addMethod(
      method: String,
      opts: In,
      handler: js.Function3[
          /* name */ String, 
          /* quality */ Any, 
          /* callback */ js.Function1[/* res */ Any, Unit], 
          Unit
        ]
    ): Unit
    
    def addProperty(name: String, opts: Getter): Unit
    
    def addSignal(name: String, opts: Types): Unit
    
    def emitSignal(name: String, values: Any*): Unit
    
    var name: String
    
    var `object`: DBusServiceObject
    
    def update(): Unit
  }
  object DBusServiceInterface {
    
    inline def apply(
      addMethod: (String, In, js.Function3[
          /* name */ String, 
          /* quality */ Any, 
          /* callback */ js.Function1[/* res */ Any, Unit], 
          Unit
        ]) => Unit,
      addProperty: (String, Getter) => Unit,
      addSignal: (String, Types) => Unit,
      emitSignal: (String, /* repeated */ Any) => Unit,
      name: String,
      `object`: DBusServiceObject,
      update: () => Unit
    ): DBusServiceInterface = {
      val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction3(addMethod), addProperty = js.Any.fromFunction2(addProperty), addSignal = js.Any.fromFunction2(addSignal), emitSignal = js.Any.fromFunction2(emitSignal), name = name.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DBusServiceInterface]
    }
    
    extension [Self <: DBusServiceInterface](x: Self) {
      
      inline def setAddMethod(
        value: (String, In, js.Function3[
              /* name */ String, 
              /* quality */ Any, 
              /* callback */ js.Function1[/* res */ Any, Unit], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "addMethod", js.Any.fromFunction3(value))
      
      inline def setAddProperty(value: (String, Getter) => Unit): Self = StObject.set(x, "addProperty", js.Any.fromFunction2(value))
      
      inline def setAddSignal(value: (String, Types) => Unit): Self = StObject.set(x, "addSignal", js.Any.fromFunction2(value))
      
      inline def setEmitSignal(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "emitSignal", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObject(value: DBusServiceObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait DBusServiceObject extends StObject {
    
    def createInterface(name: String): DBusServiceInterface
    
    var path: String
    
    var service: DBusService
  }
  object DBusServiceObject {
    
    inline def apply(createInterface: String => DBusServiceInterface, path: String, service: DBusService): DBusServiceObject = {
      val __obj = js.Dynamic.literal(createInterface = js.Any.fromFunction1(createInterface), path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[DBusServiceObject]
    }
    
    extension [Self <: DBusServiceObject](x: Self) {
      
      inline def setCreateInterface(value: String => DBusServiceInterface): Self = StObject.set(x, "createInterface", js.Any.fromFunction1(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setService(value: DBusService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P] extends U? T[P] : never}
    }}}
    */
  @js.native
  trait PickMatching[T, U] extends StObject
  
  type PropsCB = js.Function2[/* err */ js.UndefOr[Error], /* value */ Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.dbus.dbusStrings.session
    - typings.dbus.dbusStrings.system
  */
  trait busType extends StObject
  object busType {
    
    inline def session: typings.dbus.dbusStrings.session = "session".asInstanceOf[typings.dbus.dbusStrings.session]
    
    inline def system: typings.dbus.dbusStrings.system = "system".asInstanceOf[typings.dbus.dbusStrings.system]
  }
}
