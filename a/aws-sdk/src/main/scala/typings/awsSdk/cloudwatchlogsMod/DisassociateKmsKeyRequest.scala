package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateKmsKeyRequest extends StObject {
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
}
object DisassociateKmsKeyRequest {
  
  @scala.inline
  def apply(logGroupName: LogGroupName): DisassociateKmsKeyRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateKmsKeyRequest]
  }
  
  @scala.inline
  implicit class DisassociateKmsKeyRequestMutableBuilder[Self <: DisassociateKmsKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
  }
}
