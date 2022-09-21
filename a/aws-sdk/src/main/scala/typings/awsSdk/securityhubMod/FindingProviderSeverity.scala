package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingProviderSeverity extends StObject {
  
  /**
    * The severity label assigned to the finding by the finding provider.
    */
  var Label: js.UndefOr[SeverityLabel] = js.undefined
  
  /**
    * The finding provider's original value for the severity.
    */
  var Original: js.UndefOr[NonEmptyString] = js.undefined
}
object FindingProviderSeverity {
  
  inline def apply(): FindingProviderSeverity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingProviderSeverity]
  }
  
  extension [Self <: FindingProviderSeverity](x: Self) {
    
    inline def setLabel(value: SeverityLabel): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setOriginal(value: NonEmptyString): Self = StObject.set(x, "Original", value.asInstanceOf[js.Any])
    
    inline def setOriginalUndefined: Self = StObject.set(x, "Original", js.undefined)
  }
}
