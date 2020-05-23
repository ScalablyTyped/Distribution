package typings.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Se extends js.Object {
  var se: String
  var sig: String
  var sp: String
  var sr: String
  var sv: String
}

object Se {
  @scala.inline
  def apply(se: String, sig: String, sp: String, sr: String, sv: String): Se = {
    val __obj = js.Dynamic.literal(se = se.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], sr = sr.asInstanceOf[js.Any], sv = sv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Se]
  }
}

