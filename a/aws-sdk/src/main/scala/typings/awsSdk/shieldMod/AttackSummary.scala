package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttackSummary extends js.Object {
  /**
    * The unique identifier (ID) of the attack.
    */
  var AttackId: js.UndefOr[String] = js.native
  /**
    * The list of attacks for a specified time period.
    */
  var AttackVectors: js.UndefOr[AttackVectorDescriptionList] = js.native
  /**
    * The end time of the attack, in Unix time in seconds. For more information see timestamp.
    */
  var EndTime: js.UndefOr[AttackTimestamp] = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  /**
    * The start time of the attack, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[AttackTimestamp] = js.native
}

object AttackSummary {
  @scala.inline
  def apply(
    AttackId: String = null,
    AttackVectors: AttackVectorDescriptionList = null,
    EndTime: AttackTimestamp = null,
    ResourceArn: String = null,
    StartTime: AttackTimestamp = null
  ): AttackSummary = {
    val __obj = js.Dynamic.literal()
    if (AttackId != null) __obj.updateDynamic("AttackId")(AttackId.asInstanceOf[js.Any])
    if (AttackVectors != null) __obj.updateDynamic("AttackVectors")(AttackVectors.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackSummary]
  }
}

