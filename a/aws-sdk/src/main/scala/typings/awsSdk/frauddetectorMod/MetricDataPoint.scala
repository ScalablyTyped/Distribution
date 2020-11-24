package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricDataPoint extends js.Object {
  
  /**
    * The false positive rate. This is the percentage of total legitimate events that are incorrectly predicted as fraud.
    */
  var fpr: js.UndefOr[float] = js.native
  
  /**
    * The percentage of fraud events correctly predicted as fraudulent as compared to all events predicted as fraudulent.
    */
  var precision: js.UndefOr[float] = js.native
  
  /**
    * The model threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any model score 500 or above is labeled as fraud.
    */
  var threshold: js.UndefOr[float] = js.native
  
  /**
    * The true positive rate. This is the percentage of total fraud the model detects. Also known as capture rate.
    */
  var tpr: js.UndefOr[float] = js.native
}
object MetricDataPoint {
  
  @scala.inline
  def apply(): MetricDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDataPoint]
  }
  
  @scala.inline
  implicit class MetricDataPointOps[Self <: MetricDataPoint] (val x: Self) extends AnyVal {
    
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
    def setFpr(value: float): Self = this.set("fpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFpr: Self = this.set("fpr", js.undefined)
    
    @scala.inline
    def setPrecision(value: float): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setThreshold(value: float): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setTpr(value: float): Self = this.set("tpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTpr: Self = this.set("tpr", js.undefined)
  }
}
