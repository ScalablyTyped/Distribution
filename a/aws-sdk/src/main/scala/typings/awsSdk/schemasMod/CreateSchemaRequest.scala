package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSchemaRequest extends js.Object {
  /**
    * The source of the schema definition.
    */
  var Content: stringMin1Max100000 = js.native
  /**
    * A description of the schema.
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
    * Tags associated with the schema.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.native
  /**
    * The type of schema.
    */
  var Type: typings.awsSdk.schemasMod.Type = js.native
}

object CreateSchemaRequest {
  @scala.inline
  def apply(
    Content: stringMin1Max100000,
    RegistryName: string,
    SchemaName: string,
    Type: Type,
    Description: stringMin0Max256 = null,
    Tags: Tags = null
  ): CreateSchemaRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaRequest]
  }
}

