package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListManagedSchemaArnsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * The ARNs for all AWS managed schemas.
    */
  var SchemaArns: js.UndefOr[Arns] = js.native
}

object ListManagedSchemaArnsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SchemaArns: Arns = null): ListManagedSchemaArnsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SchemaArns != null) __obj.updateDynamic("SchemaArns")(SchemaArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListManagedSchemaArnsResponse]
  }
}

