package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateChangeSetRequest extends StObject {
  
  /**
    * The ID of the application associated with the change set.
    */
  var appId: js.UndefOr[AppId] = js.native
  
  /**
    * The format for the change set.
    */
  var changesetFormat: js.UndefOr[OutputFormat] = js.native
}
object GenerateChangeSetRequest {
  
  @scala.inline
  def apply(): GenerateChangeSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateChangeSetRequest]
  }
  
  @scala.inline
  implicit class GenerateChangeSetRequestMutableBuilder[Self <: GenerateChangeSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setChangesetFormat(value: OutputFormat): Self = StObject.set(x, "changesetFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesetFormatUndefined: Self = StObject.set(x, "changesetFormat", js.undefined)
  }
}
