package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputLossBehavior extends StObject {
  
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
  implicit class InputLossBehaviorMutableBuilder[Self <: InputLossBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlackFrameMsec(value: integerMin0Max1000000): Self = StObject.set(x, "BlackFrameMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackFrameMsecUndefined: Self = StObject.set(x, "BlackFrameMsec", js.undefined)
    
    @scala.inline
    def setInputLossImageColor(value: stringMin6Max6): Self = StObject.set(x, "InputLossImageColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLossImageColorUndefined: Self = StObject.set(x, "InputLossImageColor", js.undefined)
    
    @scala.inline
    def setInputLossImageSlate(value: InputLocation): Self = StObject.set(x, "InputLossImageSlate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLossImageSlateUndefined: Self = StObject.set(x, "InputLossImageSlate", js.undefined)
    
    @scala.inline
    def setInputLossImageType(value: InputLossImageType): Self = StObject.set(x, "InputLossImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLossImageTypeUndefined: Self = StObject.set(x, "InputLossImageType", js.undefined)
    
    @scala.inline
    def setRepeatFrameMsec(value: integerMin0Max1000000): Self = StObject.set(x, "RepeatFrameMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatFrameMsecUndefined: Self = StObject.set(x, "RepeatFrameMsec", js.undefined)
  }
}
