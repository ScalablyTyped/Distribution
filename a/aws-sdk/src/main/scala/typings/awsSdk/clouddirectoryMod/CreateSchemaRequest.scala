package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSchemaRequest extends js.Object {
  /**
    * The name that is associated with the schema. This is unique to each account and in each region.
    */
  var Name: SchemaName = js.native
}

object CreateSchemaRequest {
  @scala.inline
  def apply(Name: SchemaName): CreateSchemaRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaRequest]
  }
  @scala.inline
  implicit class CreateSchemaRequestOps[Self <: CreateSchemaRequest] (val x: Self) extends AnyVal {
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
    def setName(value: SchemaName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

