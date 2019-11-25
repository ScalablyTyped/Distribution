package typings.blessed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bools extends js.Object {
  var bools: js.Any
  var desc: String
  var header: Anon_BoolCountDataSize
  var name: String
  var names: js.Array[String]
  var numbers: js.Any
  var strings: js.Any
}

object Anon_Bools {
  @scala.inline
  def apply(
    bools: js.Any,
    desc: String,
    header: Anon_BoolCountDataSize,
    name: String,
    names: js.Array[String],
    numbers: js.Any,
    strings: js.Any
  ): Anon_Bools = {
    val __obj = js.Dynamic.literal(bools = bools.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bools]
  }
}

