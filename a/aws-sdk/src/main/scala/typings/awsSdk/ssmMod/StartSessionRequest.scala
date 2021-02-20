package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSessionRequest extends StObject {
  
  /**
    * The name of the SSM document to define the parameters and plugin settings for the session. For example, SSM-SessionManagerRunShell. You can call the GetDocument API to verify the document exists before attempting to start a session. If no document name is provided, a shell to the instance is launched by default.
    */
  var DocumentName: js.UndefOr[DocumentARN] = js.native
  
  /**
    * Reserved for future use.
    */
  var Parameters: js.UndefOr[SessionManagerParameters] = js.native
  
  /**
    * The instance to connect to for the session.
    */
  var Target: SessionTarget = js.native
}
object StartSessionRequest {
  
  @scala.inline
  def apply(Target: SessionTarget): StartSessionRequest = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSessionRequest]
  }
  
  @scala.inline
  implicit class StartSessionRequestMutableBuilder[Self <: StartSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentName(value: DocumentARN): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNameUndefined: Self = StObject.set(x, "DocumentName", js.undefined)
    
    @scala.inline
    def setParameters(value: SessionManagerParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setTarget(value: SessionTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
