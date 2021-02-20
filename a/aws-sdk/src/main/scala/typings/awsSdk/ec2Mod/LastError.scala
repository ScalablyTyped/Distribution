package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastError extends StObject {
  
  /**
    * The error code for the VPC endpoint error.
    */
  var Code: js.UndefOr[String] = js.native
  
  /**
    * The error message for the VPC endpoint error.
    */
  var Message: js.UndefOr[String] = js.native
}
object LastError {
  
  @scala.inline
  def apply(): LastError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastError]
  }
  
  @scala.inline
  implicit class LastErrorMutableBuilder[Self <: LastError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
