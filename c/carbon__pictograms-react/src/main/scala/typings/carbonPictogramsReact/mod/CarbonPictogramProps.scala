package typings.carbonPictogramsReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.SVGProps<std.SVGElement>, 'tabIndex'> ]: react.react.SVGProps<std.SVGElement>[P]} */ trait CarbonPictogramProps extends js.Object {
  var tabIndex: js.UndefOr[String] = js.undefined
}

object CarbonPictogramProps {
  @scala.inline
  def apply(tabIndex: String = null): CarbonPictogramProps = {
    val __obj = js.Dynamic.literal()
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarbonPictogramProps]
  }
}

