package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregationAuthorization extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the aggregation object.
    */
  var AggregationAuthorizationArn: js.UndefOr[String] = js.native
  
  /**
    * The 12-digit account ID of the account authorized to aggregate data.
    */
  var AuthorizedAccountId: js.UndefOr[AccountId] = js.native
  
  /**
    * The region authorized to collect aggregated data.
    */
  var AuthorizedAwsRegion: js.UndefOr[AwsRegion] = js.native
  
  /**
    * The time stamp when the aggregation authorization was created.
    */
  var CreationTime: js.UndefOr[Date] = js.native
}
object AggregationAuthorization {
  
  @scala.inline
  def apply(): AggregationAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationAuthorization]
  }
  
  @scala.inline
  implicit class AggregationAuthorizationOps[Self <: AggregationAuthorization] (val x: Self) extends AnyVal {
    
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
    def setAggregationAuthorizationArn(value: String): Self = this.set("AggregationAuthorizationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationAuthorizationArn: Self = this.set("AggregationAuthorizationArn", js.undefined)
    
    @scala.inline
    def setAuthorizedAccountId(value: AccountId): Self = this.set("AuthorizedAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedAccountId: Self = this.set("AuthorizedAccountId", js.undefined)
    
    @scala.inline
    def setAuthorizedAwsRegion(value: AwsRegion): Self = this.set("AuthorizedAwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedAwsRegion: Self = this.set("AuthorizedAwsRegion", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
  }
}
