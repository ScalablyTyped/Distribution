package typings.atCarbonIconsDashReact.atCarbonIconsDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.SVGProps<any>, 'tabIndex'> ]: react.react.SVGProps<any>[P]} */ trait CarbonIconProps extends js.Object {
  var tabIndex: js.UndefOr[String] = js.undefined
}

object CarbonIconProps {
  @scala.inline
  def apply(tabIndex: String = null): CarbonIconProps = {
    val __obj = js.Dynamic.literal()
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarbonIconProps]
  }
}

