package typings.configurable.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configurable[T] extends js.Object {
  
  def disable(name: String): T with Configurable[T] = js.native
  
  def disabled(name: String): Boolean = js.native
  
  def enable(name: String): T with Configurable[T] = js.native
  
  def enabled(name: String): Boolean = js.native
  
  def get(name: String): js.Any = js.native
  
  def set(name: String, `val`: js.Any): T with Configurable[T] = js.native
  
  var settings: StringDictionary[js.Any] = js.native
}
object Configurable {
  
  @scala.inline
  def apply[T](
    disable: String => T with Configurable[T],
    disabled: String => Boolean,
    enable: String => T with Configurable[T],
    enabled: String => Boolean,
    get: String => js.Any,
    set: (String, js.Any) => T with Configurable[T],
    settings: StringDictionary[js.Any]
  ): Configurable[T] = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), disabled = js.Any.fromFunction1(disabled), enable = js.Any.fromFunction1(enable), enabled = js.Any.fromFunction1(enabled), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configurable[T]]
  }
  
  @scala.inline
  implicit class ConfigurableOps[Self <: Configurable[_], T] (val x: Self with Configurable[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisable(value: String => T with Configurable[T]): Self = this.set("disable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabled(value: String => Boolean): Self = this.set("disabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnable(value: String => T with Configurable[T]): Self = this.set("enable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnabled(value: String => Boolean): Self = this.set("enabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => T with Configurable[T]): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSettings(value: StringDictionary[js.Any]): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
}
