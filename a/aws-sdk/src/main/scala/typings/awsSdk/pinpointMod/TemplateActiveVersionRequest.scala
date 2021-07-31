package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateActiveVersionRequest extends StObject {
  
  /**
    * The version of the message template to use as the active version of the template. Valid values are: latest, for the most recent version of the template; or, the unique identifier for any existing version of the template. If you specify an identifier, the value must match the identifier for an existing template version. To retrieve a list of versions and version identifiers for a template, use the Template Versions resource.
    */
  var Version: js.UndefOr[string] = js.undefined
}
object TemplateActiveVersionRequest {
  
  @scala.inline
  def apply(): TemplateActiveVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateActiveVersionRequest]
  }
  
  @scala.inline
  implicit class TemplateActiveVersionRequestMutableBuilder[Self <: TemplateActiveVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
