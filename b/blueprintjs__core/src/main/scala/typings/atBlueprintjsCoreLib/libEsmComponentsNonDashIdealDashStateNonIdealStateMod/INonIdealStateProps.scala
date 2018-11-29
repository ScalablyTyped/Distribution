package typings
package atBlueprintjsCoreLib.libEsmComponentsNonDashIdealDashStateNonIdealStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait INonIdealStateProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /** An action to resolve the non-ideal state which appears after `description`. */
  var action: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
       * Advanced usage: React `children` will appear last (after `action`).
       * Avoid passing raw strings as they will not receive margins and disrupt the layout flow.
       */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
       * A longer description of the non-ideal state.
       * A string or number value will be wrapped in a `<div>` to preserve margins.
       */
  var description: js.UndefOr[reactLib.reactMod.ReactNs.ReactChild] = js.undefined
  /** The name of a Blueprint icon or a JSX Element (such as `<Spinner/>`) to render above the title. */
  var icon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement
  ] = js.undefined
  /** The title of the non-ideal state. */
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

