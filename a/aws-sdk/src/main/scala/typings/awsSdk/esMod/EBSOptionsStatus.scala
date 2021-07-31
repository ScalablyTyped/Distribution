package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EBSOptionsStatus extends StObject {
  
  /**
    *  Specifies the EBS options for the specified Elasticsearch domain.
    */
  var Options: EBSOptions
  
  /**
    *  Specifies the status of the EBS options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus
}
object EBSOptionsStatus {
  
  @scala.inline
  def apply(Options: EBSOptions, Status: OptionStatus): EBSOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBSOptionsStatus]
  }
  
  @scala.inline
  implicit class EBSOptionsStatusMutableBuilder[Self <: EBSOptionsStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: EBSOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
