package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringOptions extends js.Object {
  var length: scala.Double
  var pool: java.lang.String
}

object StringOptions {
  @scala.inline
  def apply(length: scala.Double, pool: java.lang.String): StringOptions = {
    val __obj = js.Dynamic.literal(length = length, pool = pool)
  
    __obj.asInstanceOf[StringOptions]
  }
}

