package typings.bigi.bigiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends js.Object {
  val DB: Double
  val DM: Double
  val DV: Double
  val F1: Double
  val F2: Double
  val FV: Double
  val s: Double
  val t: Double
}

object Constants {
  @scala.inline
  def apply(DB: Double, DM: Double, DV: Double, F1: Double, F2: Double, FV: Double, s: Double, t: Double): Constants = {
    val __obj = js.Dynamic.literal(DB = DB, DM = DM, DV = DV, F1 = F1, F2 = F2, FV = FV, s = s, t = t)
  
    __obj.asInstanceOf[Constants]
  }
}

