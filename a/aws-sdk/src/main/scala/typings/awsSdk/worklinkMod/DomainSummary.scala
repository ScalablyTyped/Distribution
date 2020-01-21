package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainSummary extends js.Object {
  /**
    * The time that the domain was created.
    */
  var CreatedTime: DateTime = js.native
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * The name of the domain.
    */
  var DomainName: typings.awsSdk.worklinkMod.DomainName = js.native
  /**
    * The status of the domain.
    */
  var DomainStatus: typings.awsSdk.worklinkMod.DomainStatus = js.native
}

object DomainSummary {
  @scala.inline
  def apply(
    CreatedTime: DateTime,
    DomainName: DomainName,
    DomainStatus: DomainStatus,
    DisplayName: DisplayName = null
  ): DomainSummary = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], DomainStatus = DomainStatus.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainSummary]
  }
}

