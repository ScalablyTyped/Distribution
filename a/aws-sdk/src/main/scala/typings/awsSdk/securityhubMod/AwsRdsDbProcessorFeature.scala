package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbProcessorFeature extends js.Object {
  
  /**
    * 
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbProcessorFeature {
  
  @scala.inline
  def apply(): AwsRdsDbProcessorFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbProcessorFeature]
  }
  
  @scala.inline
  implicit class AwsRdsDbProcessorFeatureOps[Self <: AwsRdsDbProcessorFeature] (val x: Self) extends AnyVal {
    
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
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setValue(value: NonEmptyString): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
