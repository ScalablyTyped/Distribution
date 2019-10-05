package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordOptions extends js.Object {
  var capitalize: Boolean
  var length: Double
  var syllables: Double
}

object WordOptions {
  @scala.inline
  def apply(capitalize: Boolean, length: Double, syllables: Double): WordOptions = {
    val __obj = js.Dynamic.literal(capitalize = capitalize, length = length, syllables = syllables)
  
    __obj.asInstanceOf[WordOptions]
  }
}

