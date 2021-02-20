package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectCustomLabelsResponse extends StObject {
  
  /**
    * An array of custom labels detected in the input image.
    */
  var CustomLabels: js.UndefOr[typings.awsSdk.rekognitionMod.CustomLabels] = js.native
}
object DetectCustomLabelsResponse {
  
  @scala.inline
  def apply(): DetectCustomLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectCustomLabelsResponse]
  }
  
  @scala.inline
  implicit class DetectCustomLabelsResponseMutableBuilder[Self <: DetectCustomLabelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomLabels(value: CustomLabels): Self = StObject.set(x, "CustomLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLabelsUndefined: Self = StObject.set(x, "CustomLabels", js.undefined)
    
    @scala.inline
    def setCustomLabelsVarargs(value: CustomLabel*): Self = StObject.set(x, "CustomLabels", js.Array(value :_*))
  }
}
