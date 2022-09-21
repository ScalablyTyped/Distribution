package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Severity extends StObject {
  
  /**
    * The severity value of the finding. The allowed values are the following.    INFORMATIONAL - No issue was found.    LOW - The issue does not require action on its own.    MEDIUM - The issue must be addressed but not urgently.    HIGH - The issue must be addressed as a priority.    CRITICAL - The issue must be remediated immediately to avoid it escalating.   If you provide Normalized and do not provide Label, then Label is set automatically as follows.    0 - INFORMATIONAL    1–39 - LOW    40–69 - MEDIUM    70–89 - HIGH    90–100 - CRITICAL   
    */
  var Label: js.UndefOr[SeverityLabel] = js.undefined
  
  /**
    * Deprecated. The normalized severity of a finding. This attribute is being deprecated. Instead of providing Normalized, provide Label. If you provide Label and do not provide Normalized, then Normalized is set automatically as follows.    INFORMATIONAL - 0    LOW - 1    MEDIUM - 40    HIGH - 70    CRITICAL - 90  
    */
  var Normalized: js.UndefOr[Integer] = js.undefined
  
  /**
    * The native severity from the finding product that generated the finding.
    */
  var Original: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Deprecated. This attribute is being deprecated. Instead of providing Product, provide Original. The native severity as defined by the Amazon Web Services service or integrated partner product that generated the finding.
    */
  var Product: js.UndefOr[Double] = js.undefined
}
object Severity {
  
  inline def apply(): Severity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Severity]
  }
  
  extension [Self <: Severity](x: Self) {
    
    inline def setLabel(value: SeverityLabel): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setNormalized(value: Integer): Self = StObject.set(x, "Normalized", value.asInstanceOf[js.Any])
    
    inline def setNormalizedUndefined: Self = StObject.set(x, "Normalized", js.undefined)
    
    inline def setOriginal(value: NonEmptyString): Self = StObject.set(x, "Original", value.asInstanceOf[js.Any])
    
    inline def setOriginalUndefined: Self = StObject.set(x, "Original", js.undefined)
    
    inline def setProduct(value: Double): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "Product", js.undefined)
  }
}
