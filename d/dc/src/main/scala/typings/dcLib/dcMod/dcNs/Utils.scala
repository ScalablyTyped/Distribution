package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Utils extends js.Object {
  def add(l: js.Any, r: js.Any): js.Any
  def appendOrSelect(
    parent: d3DashSelectionLib.d3DashSelectionMod.Selection[_, js.Object, js.Object, js.Object],
    selector: java.lang.String,
    tag: js.Any
  ): d3DashSelectionLib.d3DashSelectionMod.Selection[_, js.Object, js.Object, js.Object]
  def clamp(n: scala.Double, min: scala.Double, max: scala.Double): scala.Double
  def isFloat(n: js.Any): scala.Boolean
  def isInteger(n: js.Any): scala.Boolean
  def isNegligible(n: js.Any): scala.Boolean
  def isNumber(n: js.Any): scala.Boolean
  def nameToId(name: java.lang.String): java.lang.String
  def printSingleValue(filter: js.Any): java.lang.String
  def safeNumber(n: js.Any): scala.Double
  def subtract(l: js.Any, r: js.Any): js.Any
  def uniqueId(): scala.Double
}

