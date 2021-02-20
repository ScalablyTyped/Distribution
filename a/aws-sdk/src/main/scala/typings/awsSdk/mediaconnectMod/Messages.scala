package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Messages extends StObject {
  
  /**
    * A list of errors that might have been generated from processes on this flow.
    */
  var Errors: listOfString = js.native
}
object Messages {
  
  @scala.inline
  def apply(Errors: listOfString): Messages = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  
  @scala.inline
  implicit class MessagesMutableBuilder[Self <: Messages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: listOfString): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: string*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
