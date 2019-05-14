package typings
package chanceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var gender: chanceLib.chanceLibStrings.male | chanceLib.chanceLibStrings.female | chanceLib.chanceLibStrings.all
}

object Anon_All {
  @scala.inline
  def apply(
    gender: chanceLib.chanceLibStrings.male | chanceLib.chanceLibStrings.female | chanceLib.chanceLibStrings.all
  ): Anon_All = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_All]
  }
}

