package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineObject extends js.Object {
  /**
    * Key-value pairs that define the properties of the object.
    */
  var fields: fieldList = js.native
  /**
    * The ID of the object.
    */
  var id: typings.awsSdk.datapipelineMod.id = js.native
  /**
    * The name of the object.
    */
  var name: id = js.native
}

object PipelineObject {
  @scala.inline
  def apply(fields: fieldList, id: id, name: id): PipelineObject = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineObject]
  }
  @scala.inline
  implicit class PipelineObjectOps[Self <: PipelineObject] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: fieldList): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: id): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: id): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

