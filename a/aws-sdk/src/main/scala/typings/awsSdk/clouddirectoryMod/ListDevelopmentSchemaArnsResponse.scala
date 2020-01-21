package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDevelopmentSchemaArnsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * The ARNs of retrieved development schemas.
    */
  var SchemaArns: js.UndefOr[Arns] = js.native
}

object ListDevelopmentSchemaArnsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SchemaArns: Arns = null): ListDevelopmentSchemaArnsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SchemaArns != null) __obj.updateDynamic("SchemaArns")(SchemaArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevelopmentSchemaArnsResponse]
  }
}

