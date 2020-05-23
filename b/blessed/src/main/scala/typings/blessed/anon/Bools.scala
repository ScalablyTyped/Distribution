package typings.blessed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bools extends js.Object {
  var bools: js.Any
  var desc: String
  var header: DataSize
  var name: String
  var names: js.Array[String]
  var numbers: js.Any
  var strings: js.Any
}

object Bools {
  @scala.inline
  def apply(
    bools: js.Any,
    desc: String,
    header: DataSize,
    name: String,
    names: js.Array[String],
    numbers: js.Any,
    strings: js.Any
  ): Bools = {
    val __obj = js.Dynamic.literal(bools = bools.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bools]
  }
}

