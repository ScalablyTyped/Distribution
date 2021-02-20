package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNodeAssociationStatusResponse extends StObject {
  
  /**
    * Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). 
    */
  var EngineAttributes: js.UndefOr[typings.awsSdk.opsworkscmMod.EngineAttributes] = js.native
  
  /**
    * The status of the association or disassociation request.   Possible values:     SUCCESS: The association or disassociation succeeded.     FAILED: The association or disassociation failed.     IN_PROGRESS: The association or disassociation is still in progress.   
    */
  var NodeAssociationStatus: js.UndefOr[typings.awsSdk.opsworkscmMod.NodeAssociationStatus] = js.native
}
object DescribeNodeAssociationStatusResponse {
  
  @scala.inline
  def apply(): DescribeNodeAssociationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNodeAssociationStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeNodeAssociationStatusResponseMutableBuilder[Self <: DescribeNodeAssociationStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineAttributes(value: EngineAttributes): Self = StObject.set(x, "EngineAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineAttributesUndefined: Self = StObject.set(x, "EngineAttributes", js.undefined)
    
    @scala.inline
    def setEngineAttributesVarargs(value: EngineAttribute*): Self = StObject.set(x, "EngineAttributes", js.Array(value :_*))
    
    @scala.inline
    def setNodeAssociationStatus(value: NodeAssociationStatus): Self = StObject.set(x, "NodeAssociationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAssociationStatusUndefined: Self = StObject.set(x, "NodeAssociationStatus", js.undefined)
  }
}
