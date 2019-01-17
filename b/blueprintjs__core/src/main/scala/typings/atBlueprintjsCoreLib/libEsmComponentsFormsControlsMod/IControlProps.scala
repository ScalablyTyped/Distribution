package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsControlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IControlProps
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement] {
  /**
    * Alignment of the indicator within container.
    * @default Alignment.LEFT
    */
  var alignIndicator: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonAlignmentMod.Alignment] = js.undefined
  /** Whether the control should appear as an inline element. */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /** Ref handler that receives HTML `<input>` element backing this component. */
  var inputRef: js.UndefOr[js.Function1[/* ref */ reactLib.HTMLInputElement | scala.Null, _]] = js.undefined
  /**
    * Text label for the control.
    *
    * Use `children` or `labelElement` to supply JSX content. This prop actually supports JSX elements,
    * but TypeScript will throw an error because `HTMLAttributes` only allows strings.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * JSX Element label for the control.
    *
    * This prop is a workaround for TypeScript consumers as the type definition for `label` only
    * accepts strings. JavaScript consumers can provide a JSX element directly to `label`.
    */
  var labelElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Whether this control should use large styles. */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of the HTML tag that wraps the checkbox.
    *
    * By default a `<label>` is used, which effectively enlarges the click
    * target to include all of its children. Supply a different tag name if
    * this behavior is undesirable or you're listening to click events from a
    * parent element (as the label can register duplicate clicks).
    *
    * @default "label"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ java.lang.String
  ] = js.undefined
}

