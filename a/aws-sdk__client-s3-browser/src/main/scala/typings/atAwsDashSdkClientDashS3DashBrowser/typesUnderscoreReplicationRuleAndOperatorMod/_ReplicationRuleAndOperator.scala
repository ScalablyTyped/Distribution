package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreReplicationRuleAndOperatorMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTagMod._Tag
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ReplicationRuleAndOperator extends js.Object {
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * _TagSet shape
    */
  var Tags: js.UndefOr[js.Array[_Tag] | Iterable[_Tag]] = js.undefined
}

object _ReplicationRuleAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[_Tag] | Iterable[_Tag] = null): _ReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ReplicationRuleAndOperator]
  }
}

