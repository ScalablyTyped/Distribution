package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindNodesInfo extends js.Object {
  var database: String = js.native
  var name: String = js.native
  var parentObjectNames: js.Array[String] = js.native
  var schema: String = js.native
  var sessionId: String = js.native
  var `type`: String = js.native
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
  @scala.inline
  implicit class FindNodesInfoOps[Self <: FindNodesInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentObjectNamesVarargs(value: String*): Self = this.set("parentObjectNames", js.Array(value :_*))
    @scala.inline
    def setParentObjectNames(value: js.Array[String]): Self = this.set("parentObjectNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

