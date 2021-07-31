package typings.configurable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: js.Object */](obj: T): T & Configurable[T] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[T & Configurable[T]]
  
  @JSImport("configurable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Configurable[T] extends StObject {
    
    def disable(name: String): T & Configurable[T]
    
    def disabled(name: String): Boolean
    
    def enable(name: String): T & Configurable[T]
    
    def enabled(name: String): Boolean
    
    def get(name: String): js.Any
    
    def set(name: String, `val`: js.Any): T & Configurable[T]
    
    var settings: StringDictionary[js.Any]
  }
  object Configurable {
    
    @scala.inline
    def apply[T](
      disable: String => T & Configurable[T],
      disabled: String => Boolean,
      enable: String => T & Configurable[T],
      enabled: String => Boolean,
      get: String => js.Any,
      set: (String, js.Any) => T & Configurable[T],
      settings: StringDictionary[js.Any]
    ): Configurable[T] = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), disabled = js.Any.fromFunction1(disabled), enable = js.Any.fromFunction1(enable), enabled = js.Any.fromFunction1(enabled), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configurable[T]]
    }
    
    @scala.inline
    implicit class ConfigurableMutableBuilder[Self <: Configurable[?], T] (val x: Self & Configurable[T]) extends AnyVal {
      
      @scala.inline
      def setDisable(value: String => T & Configurable[T]): Self = StObject.set(x, "disable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabled(value: String => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnable(value: String => T & Configurable[T]): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnabled(value: String => Boolean): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, js.Any) => T & Configurable[T]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSettings(value: StringDictionary[js.Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
}
