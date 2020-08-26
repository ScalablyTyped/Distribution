package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetsRequest extends js.Object {
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: typings.awsSdk.cognitosyncMod.IdentityId = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId = js.native
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[IntegerString] = js.native
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDatasetsRequest {
  @scala.inline
  def apply(IdentityId: IdentityId, IdentityPoolId: IdentityPoolId): ListDatasetsRequest = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetsRequest]
  }
  @scala.inline
  implicit class ListDatasetsRequestOps[Self <: ListDatasetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: IntegerString): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

