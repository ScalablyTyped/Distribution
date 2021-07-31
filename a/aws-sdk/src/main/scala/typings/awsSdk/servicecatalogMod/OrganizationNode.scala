package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationNode extends StObject {
  
  /**
    * The organization node type.
    */
  var Type: js.UndefOr[OrganizationNodeType] = js.undefined
  
  /**
    * The identifier of the organization node.
    */
  var Value: js.UndefOr[OrganizationNodeValue] = js.undefined
}
object OrganizationNode {
  
  @scala.inline
  def apply(): OrganizationNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationNode]
  }
  
  @scala.inline
  implicit class OrganizationNodeMutableBuilder[Self <: OrganizationNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: OrganizationNodeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: OrganizationNodeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
