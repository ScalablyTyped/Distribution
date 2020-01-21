package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSchemaRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the schema to delete.
    */
  var schemaArn: Arn = js.native
}

object DeleteSchemaRequest {
  @scala.inline
  def apply(schemaArn: Arn): DeleteSchemaRequest = {
    val __obj = js.Dynamic.literal(schemaArn = schemaArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSchemaRequest]
  }
}

