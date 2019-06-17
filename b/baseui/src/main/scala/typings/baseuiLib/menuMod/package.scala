package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object menuMod {
  type GetRequiredItemProps = js.Function2[/* item */ js.Any, /* index */ scala.Double, RenderItemProps]
  type OnItemSelect = js.Function1[/* args */ baseuiLib.Anon_Event, js.Any]
  type RenderProps = StatefulContainerState with baseuiLib.Anon_GetRequiredItemProps
  type StateReducer = js.Function3[
    /* changeType */ baseuiLib.baseuiLibStrings.moveUp | baseuiLib.baseuiLibStrings.mouseEnter | baseuiLib.baseuiLibStrings.focus | baseuiLib.baseuiLibStrings.click | baseuiLib.baseuiLibStrings.reset | baseuiLib.baseuiLibStrings.moveDown, 
    /* changes */ StatefulContainerState, 
    /* currentState */ StatefulContainerState, 
    StatefulContainerState
  ]
  type StatefulMenuProps = StatefulContainerProps with MenuProps
  type StatelessMenuProps = SharedStatelessProps with MenuProps
}
