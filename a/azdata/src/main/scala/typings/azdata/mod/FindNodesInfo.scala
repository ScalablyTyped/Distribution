package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindNodesInfo extends js.Object {
  var database: String
  var name: String
  var parentObjectNames: js.Array[String]
  var schema: String
  var sessionId: String
  var `type`: String
}

object FindNodesInfo {
  @scala.inline
  def apply(
    database: String,
    name: String,
    parentObjectNames: js.Array[String],
    schema: String,
    sessionId: String,
    `type`: String
  ): FindNodesInfo = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentObjectNames = parentObjectNames.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindNodesInfo]
  }
}

