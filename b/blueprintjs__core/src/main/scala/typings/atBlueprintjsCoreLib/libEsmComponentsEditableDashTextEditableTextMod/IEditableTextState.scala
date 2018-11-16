package typings
package atBlueprintjsCoreLib.libEsmComponentsEditableDashTextEditableTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IEditableTextState extends js.Object {
  /** Pixel height of the input, measured from span size */
  var inputHeight: js.UndefOr[scala.Double] = js.undefined
  /** Pixel width of the input, measured from span size */
  var inputWidth: js.UndefOr[scala.Double] = js.undefined
  /** Whether the value is currently being edited */
  var isEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** The last confirmed value */
  var lastValue: js.UndefOr[java.lang.String] = js.undefined
  /** The controlled input value, may be different from prop during editing */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

