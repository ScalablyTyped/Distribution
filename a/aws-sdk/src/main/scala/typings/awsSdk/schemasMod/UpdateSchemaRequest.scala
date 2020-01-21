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
  var RegistryName: string = js.native
  var SchemaName: string = js.native
  /**
    * The schema type for the events schema.
    */
  var Type: js.UndefOr[typings.awsSdk.schemasMod.Type] = js.native
}

object UpdateSchemaRequest {
  @scala.inline
  def apply(
    RegistryName: string,
    SchemaName: string,
    ClientTokenId: stringMin0Max36 = null,
    Content: stringMin1Max100000 = null,
    Description: stringMin0Max256 = null,
    Type: Type = null
  ): UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    if (ClientTokenId != null) __obj.updateDynamic("ClientTokenId")(ClientTokenId.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchemaRequest]
  }
}

