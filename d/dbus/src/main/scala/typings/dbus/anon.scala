package typings.dbus

import org.scalablytyped.runtime.StringDictionary
import typings.dbus.mod.DBusConnection
import typings.dbus.mod.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bus extends StObject {
    
    var bus: DBusConnection
    
    def getProperties(callback: js.Function2[/* err */ Error | Null, /* properties */ StringDictionary[js.Any], Unit]): Unit
    
    def getProperty(name: String, callback: js.Function2[/* err */ Error | Null, /* name */ String, Unit]): Unit
    
    var interfaceName: String
    
    var objectPath: String
    
    var serviceName: String
    
    def setProperty(name: String, value: js.Any, callback: js.Function1[/* err */ Error | Null, Unit]): Unit
  }
  object Bus {
    
    @scala.inline
    def apply(
      bus: DBusConnection,
      getProperties: js.Function2[/* err */ Error | Null, /* properties */ StringDictionary[js.Any], Unit] => Unit,
      getProperty: (String, js.Function2[/* err */ Error | Null, /* name */ String, Unit]) => Unit,
      interfaceName: String,
      objectPath: String,
      serviceName: String,
      setProperty: (String, js.Any, js.Function1[/* err */ Error | Null, Unit]) => Unit
    ): Bus = {
      val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], getProperties = js.Any.fromFunction1(getProperties), getProperty = js.Any.fromFunction2(getProperty), interfaceName = interfaceName.asInstanceOf[js.Any], objectPath = objectPath.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], setProperty = js.Any.fromFunction3(setProperty))
      __obj.asInstanceOf[Bus]
    }
    
    @scala.inline
    implicit class BusMutableBuilder[Self <: Bus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBus(value: DBusConnection): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetProperties(
        value: js.Function2[/* err */ Error | Null, /* properties */ StringDictionary[js.Any], Unit] => Unit
      ): Self = StObject.set(x, "getProperties", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetProperty(value: (String, js.Function2[/* err */ Error | Null, /* name */ String, Unit]) => Unit): Self = StObject.set(x, "getProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInterfaceName(value: String): Self = StObject.set(x, "interfaceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectPath(value: String): Self = StObject.set(x, "objectPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetProperty(value: (String, js.Any, js.Function1[/* err */ Error | Null, Unit]) => Unit): Self = StObject.set(x, "setProperty", js.Any.fromFunction3(value))
    }
  }
  
  trait Getter extends StObject {
    
    def getter(cb: js.Function1[/* val */ String, Unit]): Unit
    
    var setter: js.UndefOr[js.Function2[/* value */ js.Any, /* done */ js.Function0[Unit], Unit]] = js.undefined
    
    var `type`: String
  }
  object Getter {
    
    @scala.inline
    def apply(getter: js.Function1[/* val */ String, Unit] => Unit, `type`: String): Getter = {
      val __obj = js.Dynamic.literal(getter = js.Any.fromFunction1(getter))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Getter]
    }
    
    @scala.inline
    implicit class GetterMutableBuilder[Self <: Getter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetter(value: js.Function1[/* val */ String, Unit] => Unit): Self = StObject.set(x, "getter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetter(value: (/* value */ js.Any, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "setter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait In extends StObject {
    
    var in: String
    
    var out: String
  }
  object In {
    
    @scala.inline
    def apply(in: String, out: String): In = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
      __obj.asInstanceOf[In]
    }
    
    @scala.inline
    implicit class InMutableBuilder[Self <: In] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    }
  }
  
  trait Types extends StObject {
    
    var types: js.Array[String]
  }
  object Types {
    
    @scala.inline
    def apply(types: js.Array[String]): Types = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types]
    }
    
    @scala.inline
    implicit class TypesMutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
}
