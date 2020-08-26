package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayRouteTable extends js.Object {
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
  implicit class TransitGatewayRouteTableOps[Self <: TransitGatewayRouteTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationTime(value: DateTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDefaultAssociationRouteTable(value: Boolean): Self = this.set("DefaultAssociationRouteTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAssociationRouteTable: Self = this.set("DefaultAssociationRouteTable", js.undefined)
    @scala.inline
    def setDefaultPropagationRouteTable(value: Boolean): Self = this.set("DefaultPropagationRouteTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPropagationRouteTable: Self = this.set("DefaultPropagationRouteTable", js.undefined)
    @scala.inline
    def setState(value: TransitGatewayRouteTableState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("TransitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("TransitGatewayId", js.undefined)
    @scala.inline
    def setTransitGatewayRouteTableId(value: String): Self = this.set("TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayRouteTableId: Self = this.set("TransitGatewayRouteTableId", js.undefined)
  }
  
}

