package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSchemaRequest extends js.Object {
  /**
    * The ID of the client token.
    */
  var ClientTokenId: js.UndefOr[stringMin0Max36] = js.native
  /**
    * The source of the schema definition.
    */
  var Content: js.UndefOr[stringMin1Max100000] = js.native
  /**
    * The description of the schema.
    */
  var Description: js.UndefOr[stringMin0Max256] = js.native
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: string = js.native
  /**
    * The schema type for the events schema.
    */
  var Type: js.UndefOr[typings.awsSdk.schemasMod.Type] = js.native
}

object UpdateSchemaRequest {
  @scala.inline
  def apply(RegistryName: string, SchemaName: string): UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchemaRequest]
  }
  @scala.inline
  implicit class UpdateSchemaRequestOps[Self <: UpdateSchemaRequest] (val x: Self) extends AnyVal {
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
    def setRegistryName(value: string): Self = this.set("RegistryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaName(value: string): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientTokenId(value: stringMin0Max36): Self = this.set("ClientTokenId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientTokenId: Self = this.set("ClientTokenId", js.undefined)
    @scala.inline
    def setContent(value: stringMin1Max100000): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    @scala.inline
    def setDescription(value: stringMin0Max256): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

