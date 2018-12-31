package typings
package atBlueprintjsCoreLib.libEsmComponentsHtmlDashSelectHtmlSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLSelectProps
  extends reactLib.reactMod.ReactNs.SelectHTMLAttributes[reactLib.HTMLSelectElement]
     with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLSelectElement] {
  /** Whether this element should fill its container. */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /** Props to spread to the `<Icon>` element. */
  var iconProps: js.UndefOr[stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsIconIconMod.IIconProps]] = js.undefined
  /** Whether to use large styles. */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to use minimal styles. */
  var minimal: js.UndefOr[scala.Boolean] = js.undefined
  /** Multiple select is not supported. */
  @JSName("multiple")
  var multiple_IHTMLSelectProps: js.UndefOr[scala.Nothing] = js.undefined
  /** Change event handler. Use `event.currentTarget.value` to access the new value. */
  @JSName("onChange")
  var onChange_IHTMLSelectProps: js.UndefOr[reactLib.reactMod.ReactNs.ChangeEventHandler[reactLib.HTMLSelectElement]] = js.undefined
  /**
    * Shorthand for supplying options: an array of basic types or
    * `{ label?, value }` objects. If no `label` is supplied, `value`
    * will be used as the label.
    */
  var options: js.UndefOr[
    js.Array[
      java.lang.String | scala.Double | atBlueprintjsCoreLib.libEsmCommonPropsMod.IOptionProps
    ]
  ] = js.undefined
  /** Controlled value of this component. */
  @JSName("value")
  var value_IHTMLSelectProps: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

