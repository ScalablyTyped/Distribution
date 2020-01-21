package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSe extends js.Object {
  var se: String
  var sig: String
  var sp: String
  var sr: String
  var sv: String
}

object AnonSe {
  @scala.inline
  def apply(se: String, sig: String, sp: String, sr: String, sv: String): AnonSe = {
    val __obj = js.Dynamic.literal(se = se.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], sr = sr.asInstanceOf[js.Any], sv = sv.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSe]
  }
}

