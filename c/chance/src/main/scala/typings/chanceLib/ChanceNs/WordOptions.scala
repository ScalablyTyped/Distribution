package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordOptions extends js.Object {
  var capitalize: scala.Boolean
  var length: scala.Double
  var syllables: scala.Double
}

object WordOptions {
  @scala.inline
  def apply(capitalize: scala.Boolean, length: scala.Double, syllables: scala.Double): WordOptions = {
    val __obj = js.Dynamic.literal(capitalize = capitalize, length = length, syllables = syllables)
  
    __obj.asInstanceOf[WordOptions]
  }
}

