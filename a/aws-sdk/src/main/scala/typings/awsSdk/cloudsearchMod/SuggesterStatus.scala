package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggesterStatus extends StObject {
  
  var Options: Suggester
  
  var Status: OptionStatus
}
object SuggesterStatus {
  
  @scala.inline
  def apply(Options: Suggester, Status: OptionStatus): SuggesterStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggesterStatus]
  }
  
  @scala.inline
  implicit class SuggesterStatusMutableBuilder[Self <: SuggesterStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Suggester): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
