package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftInstanceDetails extends js.Object {
  /**
    * Whether the recommendation is for a current-generation instance.
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.native
  /**
    * The type of node that AWS recommends.
    */
  var NodeType: js.UndefOr[GenericString] = js.native
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
}

object RedshiftInstanceDetails {
  @scala.inline
  def apply(): RedshiftInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftInstanceDetails]
  }
  @scala.inline
  implicit class RedshiftInstanceDetailsOps[Self <: RedshiftInstanceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentGeneration(value: GenericBoolean): Self = this.set("CurrentGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentGeneration: Self = this.set("CurrentGeneration", js.undefined)
    @scala.inline
    def setFamily(value: GenericString): Self = this.set("Family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("Family", js.undefined)
    @scala.inline
    def setNodeType(value: GenericString): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    @scala.inline
    def setRegion(value: GenericString): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    @scala.inline
    def setSizeFlexEligible(value: GenericBoolean): Self = this.set("SizeFlexEligible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeFlexEligible: Self = this.set("SizeFlexEligible", js.undefined)
  }
  
}

