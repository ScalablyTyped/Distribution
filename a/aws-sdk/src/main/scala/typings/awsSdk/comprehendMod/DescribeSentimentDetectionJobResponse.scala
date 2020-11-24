package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSentimentDetectionJobResponse extends js.Object {
  
  /**
    * An object that contains the properties associated with a sentiment detection job.
    */
  var SentimentDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.SentimentDetectionJobProperties] = js.native
}
object DescribeSentimentDetectionJobResponse {
  
  @scala.inline
  def apply(): DescribeSentimentDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSentimentDetectionJobResponse]
  }
  
  @scala.inline
  implicit class DescribeSentimentDetectionJobResponseOps[Self <: DescribeSentimentDetectionJobResponse] (val x: Self) extends AnyVal {
    
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
    def setSentimentDetectionJobProperties(value: SentimentDetectionJobProperties): Self = this.set("SentimentDetectionJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentimentDetectionJobProperties: Self = this.set("SentimentDetectionJobProperties", js.undefined)
  }
}
