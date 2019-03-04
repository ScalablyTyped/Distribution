package typings
package blessedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bools extends js.Object {
  var bools: js.Any
  var desc: java.lang.String
  var header: Anon_BoolCountDataSize
  var name: java.lang.String
  var names: js.Array[java.lang.String]
  var numbers: js.Any
  var strings: js.Any
}

object Anon_Bools {
  @scala.inline
  def apply(
    bools: js.Any,
    desc: java.lang.String,
    header: Anon_BoolCountDataSize,
    name: java.lang.String,
    names: js.Array[java.lang.String],
    numbers: js.Any,
    strings: js.Any
  ): Anon_Bools = {
    val __obj = js.Dynamic.literal(bools = bools, desc = desc, header = header, name = name, names = names, numbers = numbers, strings = strings)
  
    __obj.asInstanceOf[Anon_Bools]
  }
}

