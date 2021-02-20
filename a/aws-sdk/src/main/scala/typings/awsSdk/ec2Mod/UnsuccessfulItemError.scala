package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsuccessfulItemError extends StObject {
  
  /**
    * The error code.
    */
  var Code: js.UndefOr[String] = js.native
  
  /**
    * The error message accompanying the error code.
    */
  var Message: js.UndefOr[String] = js.native
}
object UnsuccessfulItemError {
  
  @scala.inline
  def apply(): UnsuccessfulItemError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsuccessfulItemError]
  }
  
  @scala.inline
  implicit class UnsuccessfulItemErrorMutableBuilder[Self <: UnsuccessfulItemError] (val x: Self) extends AnyVal {
    
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
