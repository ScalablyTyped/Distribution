package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelChangeSetResponse extends StObject {
  
  /**
    * The ARN associated with the change set referenced in this request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  
  /**
    * The unique identifier for the change set referenced in this request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
}
object CancelChangeSetResponse {
  
  @scala.inline
  def apply(): CancelChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelChangeSetResponse]
  }
  
  @scala.inline
  implicit class CancelChangeSetResponseMutableBuilder[Self <: CancelChangeSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeSetArn(value: ARN): Self = StObject.set(x, "ChangeSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetArnUndefined: Self = StObject.set(x, "ChangeSetArn", js.undefined)
    
    @scala.inline
    def setChangeSetId(value: ResourceId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
  }
}
