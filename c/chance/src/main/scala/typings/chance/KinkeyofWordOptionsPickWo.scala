package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof chance.Chance.WordOptions ]: std.Pick<chance.Chance.WordOptions, K>} */
trait KinkeyofWordOptionsPickWo extends js.Object {
  var capitalize: PickWordOptionscapitalize
  var length: PickWordOptionslength
  var syllables: PickWordOptionssyllables
}

object KinkeyofWordOptionsPickWo {
  @scala.inline
  def apply(
    capitalize: PickWordOptionscapitalize,
    length: PickWordOptionslength,
    syllables: PickWordOptionssyllables
  ): KinkeyofWordOptionsPickWo = {
    val __obj = js.Dynamic.literal(capitalize = capitalize.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], syllables = syllables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinkeyofWordOptionsPickWo]
  }
}

