package typings.bigi.mod

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
    val __obj = js.Dynamic.literal(DB = DB.asInstanceOf[js.Any], DM = DM.asInstanceOf[js.Any], DV = DV.asInstanceOf[js.Any], F1 = F1.asInstanceOf[js.Any], F2 = F2.asInstanceOf[js.Any], FV = FV.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Constants]
  }
}

