package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCapacityProvidersResponse extends js.Object {
  /**
    * The list of capacity providers.
    */
  var capacityProviders: js.UndefOr[CapacityProviders] = js.native
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
  /**
    * The nextToken value to include in a future DescribeCapacityProviders request. When the results of a DescribeCapacityProviders request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeCapacityProvidersResponse {
  @scala.inline
  def apply(): DescribeCapacityProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCapacityProvidersResponse]
  }
  @scala.inline
  implicit class DescribeCapacityProvidersResponseOps[Self <: DescribeCapacityProvidersResponse] (val x: Self) extends AnyVal {
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
    def setCapacityProvidersVarargs(value: CapacityProvider*): Self = this.set("capacityProviders", js.Array(value :_*))
    @scala.inline
    def setCapacityProviders(value: CapacityProviders): Self = this.set("capacityProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityProviders: Self = this.set("capacityProviders", js.undefined)
    @scala.inline
    def setFailuresVarargs(value: Failure*): Self = this.set("failures", js.Array(value :_*))
    @scala.inline
    def setFailures(value: Failures): Self = this.set("failures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailures: Self = this.set("failures", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

