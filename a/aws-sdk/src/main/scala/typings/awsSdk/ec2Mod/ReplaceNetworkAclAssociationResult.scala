package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceNetworkAclAssociationResult extends StObject {
  
  /**
    * The ID of the new association.
    */
  var NewAssociationId: js.UndefOr[String] = js.native
}
object ReplaceNetworkAclAssociationResult {
  
  @scala.inline
  def apply(): ReplaceNetworkAclAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceNetworkAclAssociationResult]
  }
  
  @scala.inline
  implicit class ReplaceNetworkAclAssociationResultMutableBuilder[Self <: ReplaceNetworkAclAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewAssociationId(value: String): Self = StObject.set(x, "NewAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewAssociationIdUndefined: Self = StObject.set(x, "NewAssociationId", js.undefined)
  }
}
