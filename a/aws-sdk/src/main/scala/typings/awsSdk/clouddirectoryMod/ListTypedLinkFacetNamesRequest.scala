package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypedLinkFacetNamesRequest extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object ListTypedLinkFacetNamesRequest {
  @scala.inline
  def apply(SchemaArn: Arn): ListTypedLinkFacetNamesRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypedLinkFacetNamesRequest]
  }
  @scala.inline
  implicit class ListTypedLinkFacetNamesRequestOps[Self <: ListTypedLinkFacetNamesRequest] (val x: Self) extends AnyVal {
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
    def setSchemaArn(value: Arn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: NumberResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

