package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoOptionsStatus extends StObject {
  
  /**
    * Specifies the Cognito options for the specified Elasticsearch domain.
    */
  var Options: CognitoOptions = js.native
  
  /**
    * Specifies the status of the Cognito options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}
object CognitoOptionsStatus {
  
  @scala.inline
  def apply(Options: CognitoOptions, Status: OptionStatus): CognitoOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoOptionsStatus]
  }
  
  @scala.inline
  implicit class CognitoOptionsStatusMutableBuilder[Self <: CognitoOptionsStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: CognitoOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
