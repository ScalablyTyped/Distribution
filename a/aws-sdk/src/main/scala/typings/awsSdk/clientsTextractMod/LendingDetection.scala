package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LendingDetection extends StObject {
  
  /**
    * The confidence level for the text of a detected value in a lending document.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  var Geometry: js.UndefOr[typings.awsSdk.clientsTextractMod.Geometry] = js.undefined
  
  /**
    * The selection status of a selection element, such as an option button or check box.
    */
  var SelectionStatus: js.UndefOr[typings.awsSdk.clientsTextractMod.SelectionStatus] = js.undefined
  
  /**
    * The text extracted for a detected value in a lending document.
    */
  var Text: js.UndefOr[String] = js.undefined
}
object LendingDetection {
  
  inline def apply(): LendingDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LendingDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LendingDetection] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setGeometry(value: Geometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "Geometry", js.undefined)
    
    inline def setSelectionStatus(value: SelectionStatus): Self = StObject.set(x, "SelectionStatus", value.asInstanceOf[js.Any])
    
    inline def setSelectionStatusUndefined: Self = StObject.set(x, "SelectionStatus", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
