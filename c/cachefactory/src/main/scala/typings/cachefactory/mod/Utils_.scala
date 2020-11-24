package typings.cachefactory.mod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils_ extends js.Object {
  
  var Promise: js.UndefOr[PromiseConstructor] = js.native
  
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  
  def fromJson(value: String): js.Any = js.native
  
  def isFunction(value: js.Any): Boolean = js.native
  
  def isNumber(value: js.Any): Boolean = js.native
  
  def isObject(value: js.Any): Boolean = js.native
  
  def isString(value: js.Any): Boolean = js.native
}
object Utils_ {
  
  @scala.inline
  def apply(
    equals: (js.Any, js.Any) => Boolean,
    fromJson: String => js.Any,
    isFunction: js.Any => Boolean,
    isNumber: js.Any => Boolean,
    isObject: js.Any => Boolean,
    isString: js.Any => Boolean
  ): Utils_ = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction2(equals), fromJson = js.Any.fromFunction1(fromJson), isFunction = js.Any.fromFunction1(isFunction), isNumber = js.Any.fromFunction1(isNumber), isObject = js.Any.fromFunction1(isObject), isString = js.Any.fromFunction1(isString))
    __obj.asInstanceOf[Utils_]
  }
  
  @scala.inline
  implicit class Utils_Ops[Self <: Utils_] (val x: Self) extends AnyVal {
    
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
    def setEquals(value: (js.Any, js.Any) => Boolean): Self = this.set("equals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFromJson(value: String => js.Any): Self = this.set("fromJson", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFunction(value: js.Any => Boolean): Self = this.set("isFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNumber(value: js.Any => Boolean): Self = this.set("isNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsObject(value: js.Any => Boolean): Self = this.set("isObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsString(value: js.Any => Boolean): Self = this.set("isString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPromise(value: PromiseConstructor): Self = this.set("Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
  }
}
