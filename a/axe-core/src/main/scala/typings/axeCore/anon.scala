package typings.axeCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callback extends StObject {
    
    def callback(args: Any*): Unit
    
    var id: String
  }
  object Callback {
    
    inline def apply(callback: /* repeated */ Any => Unit, id: String): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setCallback(value: /* repeated */ Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: String
    
    var help: String
  }
  object Description {
    
    inline def apply(description: String, help: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: Boolean
  }
  object Enabled {
    
    inline def apply(enabled: Boolean): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fail extends StObject {
    
    var fail: String | StringDictionary[String]
    
    var incomplete: String | StringDictionary[String]
    
    var pass: String | StringDictionary[String]
  }
  object Fail {
    
    inline def apply(
      fail: String | StringDictionary[String],
      incomplete: String | StringDictionary[String],
      pass: String | StringDictionary[String]
    ): Fail = {
      val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fail]
    }
    
    extension [Self <: Fail](x: Self) {
      
      inline def setFail(value: String | StringDictionary[String]): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
      
      inline def setIncomplete(value: String | StringDictionary[String]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
      
      inline def setPass(value: String | StringDictionary[String]): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
}
