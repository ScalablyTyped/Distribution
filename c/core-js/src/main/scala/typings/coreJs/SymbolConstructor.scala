package typings.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolConstructor extends js.Object {
  /**
    * Non-standard. Use simple mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def useSimple(): Unit
  /**
    * Non-standard. Use setter mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def userSetter(): Unit
}

object SymbolConstructor {
  @scala.inline
  def apply(useSimple: () => Unit, userSetter: () => Unit): SymbolConstructor = {
    val __obj = js.Dynamic.literal(useSimple = js.Any.fromFunction0(useSimple), userSetter = js.Any.fromFunction0(userSetter))
    __obj.asInstanceOf[SymbolConstructor]
  }
}

