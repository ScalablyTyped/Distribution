package typings
package atBlueprintjsCoreLib.libEsmComponentsProgressDashBarProgressBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IProgressBarProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps {
  /**
       * Whether the background should animate.
       * @default true
       */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the background should be striped.
       * @default true
       */
  var stripes: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A value between 0 and 1 (inclusive) representing how far along the operation is.
       * Values below 0 or above 1 will be interpreted as 0 or 1, respectively.
       * Omitting this prop will result in an "indeterminate" progress meter that fills the entire bar.
       */
  var value: js.UndefOr[scala.Double] = js.undefined
}

