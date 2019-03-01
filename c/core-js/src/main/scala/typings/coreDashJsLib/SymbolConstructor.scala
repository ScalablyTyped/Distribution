package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolConstructor extends js.Object {
  /**
    * Non-standard. Use simple mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def useSimple(): scala.Unit
  /**
    * Non-standard. Use setter mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def userSetter(): scala.Unit
}

object SymbolConstructor {
  @scala.inline
  def apply(useSimple: js.Function0[scala.Unit], userSetter: js.Function0[scala.Unit]): SymbolConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("useSimple")(useSimple)
    __obj.updateDynamic("userSetter")(userSetter)
    __obj.asInstanceOf[SymbolConstructor]
  }
}

