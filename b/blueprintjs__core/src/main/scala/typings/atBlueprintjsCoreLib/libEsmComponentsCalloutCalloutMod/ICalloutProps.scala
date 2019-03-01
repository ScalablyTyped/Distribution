package typings
package atBlueprintjsCoreLib.libEsmComponentsCalloutCalloutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait ICalloutProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps {
  /**
    * Name of a Blueprint UI icon (or an icon element) to render on the left side.
    *
    * If this prop is omitted or `undefined`, the `intent` prop will determine a default icon.
    * If this prop is explicitly `null`, no icon will be displayed (regardless of `intent`).
    */
  var icon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement
  ] = js.undefined
}

object ICalloutProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    IIntentProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps = null,
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null,
    icon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    title: java.lang.String = null
  ): ICalloutProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IIntentProps)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ICalloutProps]
  }
}

