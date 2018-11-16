package typings
package d3DashTransitionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashTransitionMod {
  type SelectionOrTransition[GElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum] = (d3DashSelectionLib.d3DashSelectionMod.Selection[GElement, Datum, PElement, PDatum]) | (Transition[GElement, Datum, PElement, PDatum])
}
