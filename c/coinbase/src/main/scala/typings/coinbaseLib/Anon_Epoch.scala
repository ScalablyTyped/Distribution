package typings
package coinbaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Epoch extends js.Object {
  var epoch: scala.Double
  var iso: java.lang.String
}

object Anon_Epoch {
  @scala.inline
  def apply(epoch: scala.Double, iso: java.lang.String): Anon_Epoch = {
    val __obj = js.Dynamic.literal(epoch = epoch, iso = iso)
  
    __obj.asInstanceOf[Anon_Epoch]
  }
}

