package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputLossBehavior extends js.Object {
  
  /**
    * Documentation update needed
    */
  var BlackFrameMsec: js.UndefOr[integerMin0Max1000000] = js.native
  
  /**
    * When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters representing the values of RGB.
    */
  var InputLossImageColor: js.UndefOr[stringMin6Max6] = js.native
  
  /**
    * When input loss image type is "slate" these fields specify the parameters for accessing the slate.
    */
  var InputLossImageSlate: js.UndefOr[InputLocation] = js.native
  
  /**
    * Indicates whether to substitute a solid color or a slate into the output after input loss exceeds blackFrameMsec.
    */
  var InputLossImageType: js.UndefOr[typings.awsSdk.medialiveMod.InputLossImageType] = js.native
  
  /**
    * Documentation update needed
    */
  var RepeatFrameMsec: js.UndefOr[integerMin0Max1000000] = js.native
}
object InputLossBehavior {
  
  @scala.inline
  def apply(): InputLossBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLossBehavior]
  }
  
  @scala.inline
  implicit class InputLossBehaviorOps[Self <: InputLossBehavior] (val x: Self) extends AnyVal {
    
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
    def setBlackFrameMsec(value: integerMin0Max1000000): Self = this.set("BlackFrameMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlackFrameMsec: Self = this.set("BlackFrameMsec", js.undefined)
    
    @scala.inline
    def setInputLossImageColor(value: stringMin6Max6): Self = this.set("InputLossImageColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLossImageColor: Self = this.set("InputLossImageColor", js.undefined)
    
    @scala.inline
    def setInputLossImageSlate(value: InputLocation): Self = this.set("InputLossImageSlate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLossImageSlate: Self = this.set("InputLossImageSlate", js.undefined)
    
    @scala.inline
    def setInputLossImageType(value: InputLossImageType): Self = this.set("InputLossImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLossImageType: Self = this.set("InputLossImageType", js.undefined)
    
    @scala.inline
    def setRepeatFrameMsec(value: integerMin0Max1000000): Self = this.set("RepeatFrameMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatFrameMsec: Self = this.set("RepeatFrameMsec", js.undefined)
  }
}
