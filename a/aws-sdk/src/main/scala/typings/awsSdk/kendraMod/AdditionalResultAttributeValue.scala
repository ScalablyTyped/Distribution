package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalResultAttributeValue extends StObject {
  
  /**
    * The text associated with the attribute and information about the highlight to apply to the text.
    */
  var TextWithHighlightsValue: js.UndefOr[TextWithHighlights] = js.native
}
object AdditionalResultAttributeValue {
  
  @scala.inline
  def apply(): AdditionalResultAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalResultAttributeValue]
  }
  
  @scala.inline
  implicit class AdditionalResultAttributeValueMutableBuilder[Self <: AdditionalResultAttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextWithHighlightsValue(value: TextWithHighlights): Self = StObject.set(x, "TextWithHighlightsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextWithHighlightsValueUndefined: Self = StObject.set(x, "TextWithHighlightsValue", js.undefined)
  }
}
