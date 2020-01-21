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
  def apply(
    CurrentGeneration: js.UndefOr[Boolean] = js.undefined,
    Family: GenericString = null,
    NodeType: GenericString = null,
    Region: GenericString = null,
    SizeFlexEligible: js.UndefOr[Boolean] = js.undefined
  ): RedshiftInstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentGeneration)) __obj.updateDynamic("CurrentGeneration")(CurrentGeneration.asInstanceOf[js.Any])
    if (Family != null) __obj.updateDynamic("Family")(Family.asInstanceOf[js.Any])
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (!js.isUndefined(SizeFlexEligible)) __obj.updateDynamic("SizeFlexEligible")(SizeFlexEligible.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftInstanceDetails]
  }
}

