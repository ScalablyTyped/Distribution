package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ESInstanceDetails extends js.Object {
  /**
    * Whether the recommendation is for a current-generation instance.
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  /**
    * The class of instance that AWS recommends.
    */
  var InstanceClass: js.UndefOr[GenericString] = js.native
  /**
    * The size of instance that AWS recommends.
    */
  var InstanceSize: js.UndefOr[GenericString] = js.native
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
}

object ESInstanceDetails {
  @scala.inline
  def apply(
    CurrentGeneration: js.UndefOr[Boolean] = js.undefined,
    InstanceClass: GenericString = null,
    InstanceSize: GenericString = null,
    Region: GenericString = null,
    SizeFlexEligible: js.UndefOr[Boolean] = js.undefined
  ): ESInstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentGeneration)) __obj.updateDynamic("CurrentGeneration")(CurrentGeneration.asInstanceOf[js.Any])
    if (InstanceClass != null) __obj.updateDynamic("InstanceClass")(InstanceClass.asInstanceOf[js.Any])
    if (InstanceSize != null) __obj.updateDynamic("InstanceSize")(InstanceSize.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (!js.isUndefined(SizeFlexEligible)) __obj.updateDynamic("SizeFlexEligible")(SizeFlexEligible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESInstanceDetails]
  }
}

