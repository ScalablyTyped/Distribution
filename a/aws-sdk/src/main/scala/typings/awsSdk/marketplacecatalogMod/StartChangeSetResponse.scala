package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartChangeSetResponse extends StObject {
  
  /**
    * The ARN associated to the unique identifier generated for the request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  
  /**
    * Unique identifier generated for the request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
}
object StartChangeSetResponse {
  
  @scala.inline
  def apply(): StartChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartChangeSetResponse]
  }
  
  @scala.inline
  implicit class StartChangeSetResponseMutableBuilder[Self <: StartChangeSetResponse] (val x: Self) extends AnyVal {
    
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
