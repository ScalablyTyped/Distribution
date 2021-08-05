package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSchemeStatus extends StObject {
  
  var Options: AnalysisScheme
  
  var Status: OptionStatus
}
object AnalysisSchemeStatus {
  
  inline def apply(Options: AnalysisScheme, Status: OptionStatus): AnalysisSchemeStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisSchemeStatus]
  }
  
  extension [Self <: AnalysisSchemeStatus](x: Self) {
    
    inline def setOptions(value: AnalysisScheme): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
