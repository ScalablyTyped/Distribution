package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartAssociationsOnceRequest extends StObject {
  
  /**
    * The association IDs that you want to run immediately and only one time.
    */
  var AssociationIds: AssociationIdList = js.native
}
object StartAssociationsOnceRequest {
  
  @scala.inline
  def apply(AssociationIds: AssociationIdList): StartAssociationsOnceRequest = {
    val __obj = js.Dynamic.literal(AssociationIds = AssociationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAssociationsOnceRequest]
  }
  
  @scala.inline
  implicit class StartAssociationsOnceRequestMutableBuilder[Self <: StartAssociationsOnceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationIds(value: AssociationIdList): Self = StObject.set(x, "AssociationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdsVarargs(value: AssociationId*): Self = StObject.set(x, "AssociationIds", js.Array(value :_*))
  }
}
