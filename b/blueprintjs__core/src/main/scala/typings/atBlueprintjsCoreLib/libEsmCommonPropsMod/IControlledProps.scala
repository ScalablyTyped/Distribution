package typings
package atBlueprintjsCoreLib.libEsmCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlledProps extends js.Object {
  /** Initial value of the input, for uncontrolled usage. */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /** Change event handler. Use `event.target.value` for new value. */
  var onChange: js.UndefOr[reactLib.reactMod.ReactNs.FormEventHandler[reactLib.HTMLElement]] = js.undefined
  /** Form value of the input, for controlled usage. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

