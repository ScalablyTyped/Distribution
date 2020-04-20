package typings.cassandraDriver

import typings.cassandraDriver.typesMod.types.dataTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: dataTypes
  var info: js.Any
}

object AnonCode {
  @scala.inline
  def apply(code: dataTypes, info: js.Any): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

