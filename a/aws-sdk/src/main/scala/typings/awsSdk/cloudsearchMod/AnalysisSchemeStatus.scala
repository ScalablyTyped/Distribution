package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSchemeStatus extends StObject {
  
  var Options: AnalysisScheme
  
  var Status: OptionStatus
}
object AnalysisSchemeStatus {
  
  @scala.inline
  def apply(Options: AnalysisScheme, Status: OptionStatus): AnalysisSchemeStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisSchemeStatus]
  }
  
  @scala.inline
  implicit class AnalysisSchemeStatusMutableBuilder[Self <: AnalysisSchemeStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: AnalysisScheme): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
