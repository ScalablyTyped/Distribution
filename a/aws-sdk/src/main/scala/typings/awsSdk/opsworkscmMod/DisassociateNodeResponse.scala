package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateNodeResponse extends StObject {
  
  /**
    * Contains a token which can be passed to the DescribeNodeAssociationStatus API call to get the status of the disassociation request. 
    */
  var NodeAssociationStatusToken: js.UndefOr[typings.awsSdk.opsworkscmMod.NodeAssociationStatusToken] = js.undefined
}
object DisassociateNodeResponse {
  
  @scala.inline
  def apply(): DisassociateNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateNodeResponse]
  }
  
  @scala.inline
  implicit class DisassociateNodeResponseMutableBuilder[Self <: DisassociateNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeAssociationStatusToken(value: NodeAssociationStatusToken): Self = StObject.set(x, "NodeAssociationStatusToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAssociationStatusTokenUndefined: Self = StObject.set(x, "NodeAssociationStatusToken", js.undefined)
  }
}
