package typings.cassandraDriver.anon

import typings.cassandraDriver.typesMod.types.dataTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: dataTypes
  var info: js.Any
}

object Code {
  @scala.inline
  def apply(code: dataTypes, info: js.Any): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

