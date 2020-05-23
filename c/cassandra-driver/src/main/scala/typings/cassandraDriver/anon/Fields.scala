package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var fields: js.UndefOr[js.Array[String]] = js.undefined
}

object Fields {
  @scala.inline
  def apply(fields: js.Array[String] = null): Fields = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

