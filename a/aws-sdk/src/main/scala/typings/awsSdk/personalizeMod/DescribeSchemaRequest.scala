package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSchemaRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the schema to retrieve.
    */
  var schemaArn: Arn = js.native
}

object DescribeSchemaRequest {
  @scala.inline
  def apply(schemaArn: Arn): DescribeSchemaRequest = {
    val __obj = js.Dynamic.literal(schemaArn = schemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSchemaRequest]
  }
}

