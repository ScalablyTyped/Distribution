package typings.axeCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Application extends StObject {
    
    var application: js.UndefOr[String] = js.native
    
    var brand: js.UndefOr[String] = js.native
  }
  object Application {
    
    @scala.inline
    def apply(): Application = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Application]
    }
    
    @scala.inline
    implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      @scala.inline
      def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    }
  }
  
  @js.native
  trait Callback extends StObject {
    
    def callback(args: js.Any*): Unit = js.native
    
    var id: String = js.native
  }
  object Callback {
    
    @scala.inline
    def apply(callback: /* repeated */ js.Any => Unit, id: String): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Description extends StObject {
    
    var description: String = js.native
    
    var help: String = js.native
  }
  object Description {
    
    @scala.inline
    def apply(description: String, help: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Enabled extends StObject {
    
    var enabled: Boolean = js.native
  }
  object Enabled {
    
    @scala.inline
    def apply(enabled: Boolean): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fail extends StObject {
    
    var fail: String | StringDictionary[String] = js.native
    
    var incomplete: String | StringDictionary[String] = js.native
    
    var pass: String | StringDictionary[String] = js.native
  }
  object Fail {
    
    @scala.inline
    def apply(
      fail: String | StringDictionary[String],
      incomplete: String | StringDictionary[String],
      pass: String | StringDictionary[String]
    ): Fail = {
      val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fail]
    }
    
    @scala.inline
    implicit class FailMutableBuilder[Self <: Fail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFail(value: String | StringDictionary[String]): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncomplete(value: String | StringDictionary[String]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPass(value: String | StringDictionary[String]): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
}
