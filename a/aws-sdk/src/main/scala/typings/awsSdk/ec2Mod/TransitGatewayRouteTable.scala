package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayRouteTable extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * Indicates whether this is the default association route table for the transit gateway.
    */
  var DefaultAssociationRouteTable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether this is the default propagation route table for the transit gateway.
    */
  var DefaultPropagationRouteTable: js.UndefOr[Boolean] = js.native
  
  /**
    * The state of the transit gateway route table.
    */
  var State: js.UndefOr[TransitGatewayRouteTableState] = js.native
  
  /**
    * Any tags assigned to the route table.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.native
}
object TransitGatewayRouteTable {
  
  @scala.inline
  def apply(): TransitGatewayRouteTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRouteTable]
  }
  
  @scala.inline
  implicit class TransitGatewayRouteTableMutableBuilder[Self <: TransitGatewayRouteTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDefaultAssociationRouteTable(value: Boolean): Self = StObject.set(x, "DefaultAssociationRouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAssociationRouteTableUndefined: Self = StObject.set(x, "DefaultAssociationRouteTable", js.undefined)
    
    @scala.inline
    def setDefaultPropagationRouteTable(value: Boolean): Self = StObject.set(x, "DefaultPropagationRouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropagationRouteTableUndefined: Self = StObject.set(x, "DefaultPropagationRouteTable", js.undefined)
    
    @scala.inline
    def setState(value: TransitGatewayRouteTableState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    @scala.inline
    def setTransitGatewayRouteTableId(value: String): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRouteTableIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableId", js.undefined)
  }
}
