package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSsmPatch extends StObject {
  
  /**
    * The compliance status details for the patch.
    */
  var ComplianceSummary: js.UndefOr[AwsSsmComplianceSummary] = js.undefined
}
object AwsSsmPatch {
  
  inline def apply(): AwsSsmPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSsmPatch]
  }
  
  extension [Self <: AwsSsmPatch](x: Self) {
    
    inline def setComplianceSummary(value: AwsSsmComplianceSummary): Self = StObject.set(x, "ComplianceSummary", value.asInstanceOf[js.Any])
    
    inline def setComplianceSummaryUndefined: Self = StObject.set(x, "ComplianceSummary", js.undefined)
  }
}
