package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceNetworkAclAssociationResult extends StObject {
  
  /**
    * The ID of the new association.
    */
  var NewAssociationId: js.UndefOr[String] = js.undefined
}
object ReplaceNetworkAclAssociationResult {
  
  inline def apply(): ReplaceNetworkAclAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceNetworkAclAssociationResult]
  }
  
  extension [Self <: ReplaceNetworkAclAssociationResult](x: Self) {
    
    inline def setNewAssociationId(value: String): Self = StObject.set(x, "NewAssociationId", value.asInstanceOf[js.Any])
    
    inline def setNewAssociationIdUndefined: Self = StObject.set(x, "NewAssociationId", js.undefined)
  }
}
