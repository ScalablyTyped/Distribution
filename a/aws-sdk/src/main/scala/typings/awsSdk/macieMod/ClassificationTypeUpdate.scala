package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassificationTypeUpdate extends js.Object {
  
  /**
    * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie Classic begins performing continuous classification after a bucket is successfully associated with Amazon Macie Classic. 
    */
  var continuous: js.UndefOr[S3ContinuousClassificationType] = js.native
  
  /**
    * A one-time classification of all of the existing objects in a specified S3 bucket. 
    */
  var oneTime: js.UndefOr[S3OneTimeClassificationType] = js.native
}
object ClassificationTypeUpdate {
  
  @scala.inline
  def apply(): ClassificationTypeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationTypeUpdate]
  }
  
  @scala.inline
  implicit class ClassificationTypeUpdateOps[Self <: ClassificationTypeUpdate] (val x: Self) extends AnyVal {
    
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
    def setContinuous(value: S3ContinuousClassificationType): Self = this.set("continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    
    @scala.inline
    def setOneTime(value: S3OneTimeClassificationType): Self = this.set("oneTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneTime: Self = this.set("oneTime", js.undefined)
  }
}
