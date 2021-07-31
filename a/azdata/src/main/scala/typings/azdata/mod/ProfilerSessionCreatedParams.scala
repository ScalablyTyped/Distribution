package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerSessionCreatedParams extends StObject {
  
  var ownerUri: String
  
  var sessionName: String
  
  var templateName: String
}
object ProfilerSessionCreatedParams {
  
  @scala.inline
  def apply(ownerUri: String, sessionName: String, templateName: String): ProfilerSessionCreatedParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], sessionName = sessionName.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionCreatedParams]
  }
  
  @scala.inline
  implicit class ProfilerSessionCreatedParamsMutableBuilder[Self <: ProfilerSessionCreatedParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionName(value: String): Self = StObject.set(x, "sessionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
