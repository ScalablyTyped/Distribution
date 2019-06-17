package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabsMod {
  type StateReducer = js.Function3[
    baseuiLib.baseuiLibStrings.change, 
    /* nextState */ State, 
    /* currentState */ State, 
    State
  ]
  type StatefulTabsProps = TabsProps with baseuiLib.Anon_ActiveKeyInitialState
}
