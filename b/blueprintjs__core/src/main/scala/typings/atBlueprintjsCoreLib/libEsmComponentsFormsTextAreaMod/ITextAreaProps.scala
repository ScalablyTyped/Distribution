package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait ITextAreaProps
  extends reactLib.reactMod.ReactNs.TextareaHTMLAttributes[reactLib.HTMLTextAreaElement]
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps {
  /**
    * Whether the text area should take up the full width of its container.
    */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ref handler that receives HTML `<textarea>` element backing this component.
    */
  var inputRef: js.UndefOr[js.Function1[/* ref */ reactLib.HTMLTextAreaElement | scala.Null, _]] = js.undefined
  /**
    * Whether the text area should appear with large styling.
    */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the text area should appear with small styling.
    */
  var small: js.UndefOr[scala.Boolean] = js.undefined
}

