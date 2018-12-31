package typings
package atBlueprintjsCoreLib.libEsmComponentsCalloutCalloutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because Would inherit conflicting mutable fields List(className))*/
trait ICalloutProps
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

