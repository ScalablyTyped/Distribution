package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentServiceWarning extends StObject {
  
  /**
    * The description for a warning returned by the document service.
    */
  var message: js.UndefOr[String] = js.undefined
}
object DocumentServiceWarning {
  
  @scala.inline
  def apply(): DocumentServiceWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentServiceWarning]
  }
  
  @scala.inline
  implicit class DocumentServiceWarningMutableBuilder[Self <: DocumentServiceWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
