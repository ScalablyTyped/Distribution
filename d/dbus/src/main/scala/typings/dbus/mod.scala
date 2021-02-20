package typings.dbus

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dbus.anon.Bus
import typings.dbus.anon.Getter
import typings.dbus.anon.In
import typings.dbus.anon.Types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @deprecated
    */
  @JSImport("dbus", JSImport.Namespace)
  @js.native
  class ^ () extends DBus
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("dbus", "Error")
  @js.native
  class Error protected () extends StObject {
    def this(name: String, message: String) = this()
    
    val dbusName: String = js.native
  }
  
  @JSImport("dbus", "Signature")
  @js.native
  def Signature(`type`: js.Any): String = js.native
  
  @JSImport("dbus", "getBus")
  @js.native
  def getBus(`type`: busType): DBusConnection = js.native
  
  @JSImport("dbus", "registerService")
  @js.native
  def registerService(busName: busType): DBusService = js.native
  @JSImport("dbus", "registerService")
  @js.native
  def registerService(busName: busType, serviceName: String): DBusService = js.native
  
  type AnyInterfaceMethod = StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]
  
  /**
    * @deprecated
    */
  @js.native
  trait DBus extends StObject
  
  @js.native
  trait DBusConnection extends StObject {
    
    def disconnect(): Unit = js.native
    
    /* tslint:disable-next-line:no-unnecessary-generics */
    def getInterface[T](
      serviceName: String,
      objectPath: String,
      interfaceName: String,
      callback: js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[T], Unit]
    ): Unit = js.native
    
    def getUniqueServiceName(serviceName: String, callback: js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]): Unit = js.native
    
    def reconnect(callback: js.Function0[Unit]): Unit = js.native
  }
  object DBusConnection {
    
    @scala.inline
    def apply(
      disconnect: () => Unit,
      getInterface: (String, String, String, js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[js.Any], Unit]) => Unit,
      getUniqueServiceName: (String, js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]) => Unit,
      reconnect: js.Function0[Unit] => Unit
    ): DBusConnection = {
      val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), getInterface = js.Any.fromFunction4(getInterface), getUniqueServiceName = js.Any.fromFunction2(getUniqueServiceName), reconnect = js.Any.fromFunction1(reconnect))
      __obj.asInstanceOf[DBusConnection]
    }
    
    @scala.inline
    implicit class DBusConnectionMutableBuilder[Self <: DBusConnection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInterface(
        value: (String, String, String, js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[js.Any], Unit]) => Unit
      ): Self = StObject.set(x, "getInterface", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGetUniqueServiceName(value: (String, js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]) => Unit): Self = StObject.set(x, "getUniqueServiceName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReconnect(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "reconnect", js.Any.fromFunction1(value))
    }
  }
  
  type DBusInterface[T] = Bus with (PickMatching[T, js.Function1[/* repeated */ _, Unit]])
  
  @js.native
  trait DBusService extends StObject {
    
    var bus: DBusConnection = js.native
    
    def createObject(path: String): DBusServiceObject = js.native
    
    def disconnect(): Unit = js.native
    
    def removeObject(service: DBusServiceObject): Unit = js.native
    
    var serviceName: String = js.native
  }
  object DBusService {
    
    @scala.inline
    def apply(
      bus: DBusConnection,
      createObject: String => DBusServiceObject,
      disconnect: () => Unit,
      removeObject: DBusServiceObject => Unit,
      serviceName: String
    ): DBusService = {
      val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], createObject = js.Any.fromFunction1(createObject), disconnect = js.Any.fromFunction0(disconnect), removeObject = js.Any.fromFunction1(removeObject), serviceName = serviceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DBusService]
    }
    
    @scala.inline
    implicit class DBusServiceMutableBuilder[Self <: DBusService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBus(value: DBusConnection): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateObject(value: String => DBusServiceObject): Self = StObject.set(x, "createObject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveObject(value: DBusServiceObject => Unit): Self = StObject.set(x, "removeObject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DBusServiceInterface extends StObject {
    
    def addMethod(
      method: String,
      opts: In,
      handler: js.Function3[
          /* name */ String, 
          /* quality */ js.Any, 
          /* callback */ js.Function1[/* res */ js.Any, Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def addProperty(name: String, opts: Getter): Unit = js.native
    
    def addSignal(name: String, opts: Types): Unit = js.native
    
    def emitSignal(name: String, values: js.Any*): Unit = js.native
    
    var name: String = js.native
    
    var `object`: DBusServiceObject = js.native
    
    def update(): Unit = js.native
  }
  object DBusServiceInterface {
    
    @scala.inline
    def apply(
      addMethod: (String, In, js.Function3[
          /* name */ String, 
          /* quality */ js.Any, 
          /* callback */ js.Function1[/* res */ js.Any, Unit], 
          Unit
        ]) => Unit,
      addProperty: (String, Getter) => Unit,
      addSignal: (String, Types) => Unit,
      emitSignal: (String, /* repeated */ js.Any) => Unit,
      name: String,
      `object`: DBusServiceObject,
      update: () => Unit
    ): DBusServiceInterface = {
      val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction3(addMethod), addProperty = js.Any.fromFunction2(addProperty), addSignal = js.Any.fromFunction2(addSignal), emitSignal = js.Any.fromFunction2(emitSignal), name = name.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DBusServiceInterface]
    }
    
    @scala.inline
    implicit class DBusServiceInterfaceMutableBuilder[Self <: DBusServiceInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddMethod(
        value: (String, In, js.Function3[
              /* name */ String, 
              /* quality */ js.Any, 
              /* callback */ js.Function1[/* res */ js.Any, Unit], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "addMethod", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddProperty(value: (String, Getter) => Unit): Self = StObject.set(x, "addProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddSignal(value: (String, Types) => Unit): Self = StObject.set(x, "addSignal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmitSignal(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "emitSignal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: DBusServiceObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DBusServiceObject extends StObject {
    
    def createInterface(name: String): DBusServiceInterface = js.native
    
    var path: String = js.native
    
    var service: DBusService = js.native
  }
  object DBusServiceObject {
    
    @scala.inline
    def apply(createInterface: String => DBusServiceInterface, path: String, service: DBusService): DBusServiceObject = {
      val __obj = js.Dynamic.literal(createInterface = js.Any.fromFunction1(createInterface), path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[DBusServiceObject]
    }
    
    @scala.inline
    implicit class DBusServiceObjectMutableBuilder[Self <: DBusServiceObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateInterface(value: String => DBusServiceInterface): Self = StObject.set(x, "createInterface", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: DBusService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  type PickMatching[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] extends U? T[P] : never}
    */ typings.dbus.dbusStrings.PickMatching with TopLevel[js.Any]
  
  type PropsCB = js.Function2[/* err */ js.UndefOr[Error], /* value */ js.Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.dbus.dbusStrings.session
    - typings.dbus.dbusStrings.system
  */
  trait busType extends StObject
  object busType {
    
    @scala.inline
    def session: typings.dbus.dbusStrings.session = "session".asInstanceOf[typings.dbus.dbusStrings.session]
    
    @scala.inline
    def system: typings.dbus.dbusStrings.system = "system".asInstanceOf[typings.dbus.dbusStrings.system]
  }
}
