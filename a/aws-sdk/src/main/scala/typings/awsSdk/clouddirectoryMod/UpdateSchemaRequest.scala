package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSchemaRequest extends js.Object {
  /**
    * The name of the schema.
    */
  var Name: SchemaName = js.native
  /**
    * The Amazon Resource Name (ARN) of the development schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object UpdateSchemaRequest {
  @scala.inline
  def apply(Name: SchemaName, SchemaArn: Arn): UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateSchemaRequest]
  }
}

