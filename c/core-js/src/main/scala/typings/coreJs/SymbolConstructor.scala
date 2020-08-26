package typings.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolConstructor extends js.Object {
  /**
    * Non-standard. Use simple mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def useSimple(): Unit = js.native
  /**
    * Non-standard. Use setter mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def userSetter(): Unit = js.native
}

object SymbolConstructor {
  @scala.inline
  def apply(useSimple: () => Unit, userSetter: () => Unit): SymbolConstructor = {
    val __obj = js.Dynamic.literal(useSimple = js.Any.fromFunction0(useSimple), userSetter = js.Any.fromFunction0(userSetter))
    __obj.asInstanceOf[SymbolConstructor]
  }
  @scala.inline
  implicit class SymbolConstructorOps[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUseSimple(value: () => Unit): Self = this.set("useSimple", js.Any.fromFunction0(value))
    @scala.inline
    def setUserSetter(value: () => Unit): Self = this.set("userSetter", js.Any.fromFunction0(value))
  }
  
}

