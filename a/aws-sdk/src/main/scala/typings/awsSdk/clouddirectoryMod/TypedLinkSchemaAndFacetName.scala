package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedLinkSchemaAndFacetName extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
  /**
    * The unique name of the typed link facet.
    */
  var TypedLinkName: typings.awsSdk.clouddirectoryMod.TypedLinkName = js.native
}

object TypedLinkSchemaAndFacetName {
  @scala.inline
  def apply(SchemaArn: Arn, TypedLinkName: TypedLinkName): TypedLinkSchemaAndFacetName = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn.asInstanceOf[js.Any], TypedLinkName = TypedLinkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkSchemaAndFacetName]
  }
}

