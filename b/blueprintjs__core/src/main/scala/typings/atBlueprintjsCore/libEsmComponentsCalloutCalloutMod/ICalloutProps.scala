package typings.atBlueprintjsCore.libEsmComponentsCalloutCalloutMod

import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.atBlueprintjsIcons.libEsmIconNameMod.IconName
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait ICalloutProps
  extends HTMLAttributes[HTMLDivElement]
     with IIntentProps {
  /**
    * Name of a Blueprint UI icon (or an icon element) to render on the left side.
    *
    * If this prop is omitted or `undefined`, the `intent` prop will determine a default icon.
    * If this prop is explicitly `null`, no icon will be displayed (regardless of `intent`).
    */
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
}

object ICalloutProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    IIntentProps: IIntentProps = null,
    IProps: IProps = null,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    title: String = null
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

