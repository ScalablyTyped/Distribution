package typings.awsSdkClientXrayNode.typesSamplingStatisticsDocumentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingStatisticsDocument extends js.Object {
  
  /**
    * <p>The number of requests recorded with borrowed reservoir quota.</p>
    */
  var BorrowCount: js.UndefOr[Double] = js.native
  
  /**
    * <p>A unique identifier for the service in hexadecimal.</p>
    */
  var ClientID: String = js.native
  
  /**
    * <p>The number of requests that matched the rule.</p>
    */
  var RequestCount: Double = js.native
  
  /**
    * <p>The name of the sampling rule.</p>
    */
  var RuleName: String = js.native
  
  /**
    * <p>The number of requests recorded.</p>
    */
  var SampledCount: Double = js.native
  
  /**
    * <p>The current time.</p>
    */
  var Timestamp: Date | String | Double = js.native
}
object SamplingStatisticsDocument {
  
  @scala.inline
  def apply(
    ClientID: String,
    RequestCount: Double,
    RuleName: String,
    SampledCount: Double,
    Timestamp: Date | String | Double
  ): SamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingStatisticsDocument]
  }
  
  @scala.inline
  implicit class SamplingStatisticsDocumentOps[Self <: SamplingStatisticsDocument] (val x: Self) extends AnyVal {
    
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
    def setClientID(value: String): Self = this.set("ClientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCount(value: Double): Self = this.set("RequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleName(value: String): Self = this.set("RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampledCount(value: Double): Self = this.set("SampledCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date | String | Double): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorrowCount(value: Double): Self = this.set("BorrowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorrowCount: Self = this.set("BorrowCount", js.undefined)
  }
}
