package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedSecurityOptionsStatus extends StObject {
  
  /**
    *  Specifies advanced security options for the specified Elasticsearch domain.
    */
  var Options: AdvancedSecurityOptions = js.native
  
  /**
    *  Status of the advanced security options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}
object AdvancedSecurityOptionsStatus {
  
  @scala.inline
  def apply(Options: AdvancedSecurityOptions, Status: OptionStatus): AdvancedSecurityOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSecurityOptionsStatus]
  }
  
  @scala.inline
  implicit class AdvancedSecurityOptionsStatusMutableBuilder[Self <: AdvancedSecurityOptionsStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: AdvancedSecurityOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
