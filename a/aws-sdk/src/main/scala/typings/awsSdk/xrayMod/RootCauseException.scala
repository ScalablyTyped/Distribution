package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootCauseException extends StObject {
  
  /**
    * The message of the exception.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the exception.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object RootCauseException {
  
  @scala.inline
  def apply(): RootCauseException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootCauseException]
  }
  
  @scala.inline
  implicit class RootCauseExceptionMutableBuilder[Self <: RootCauseException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
