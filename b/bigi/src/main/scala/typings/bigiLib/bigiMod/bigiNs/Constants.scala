package typings
package bigiLib.bigiMod.bigiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends js.Object {
  val DB: scala.Double
  val DM: scala.Double
  val DV: scala.Double
  val F1: scala.Double
  val F2: scala.Double
  val FV: scala.Double
  val s: scala.Double
  val t: scala.Double
}

object Constants {
  @scala.inline
  def apply(
    DB: scala.Double,
    DM: scala.Double,
    DV: scala.Double,
    F1: scala.Double,
    F2: scala.Double,
    FV: scala.Double,
    s: scala.Double,
    t: scala.Double
  ): Constants = {
    val __obj = js.Dynamic.literal(DB = DB, DM = DM, DV = DV, F1 = F1, F2 = F2, FV = FV, s = s, t = t)
  
    __obj.asInstanceOf[Constants]
  }
}

