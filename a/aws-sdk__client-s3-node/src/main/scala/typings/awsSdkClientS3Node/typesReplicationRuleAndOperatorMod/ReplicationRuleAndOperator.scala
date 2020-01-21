package typings.awsSdkClientS3Node.typesReplicationRuleAndOperatorMod

import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationRuleAndOperator extends js.Object {
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * _TagSet shape
    */
  var Tags: js.UndefOr[js.Array[Tag] | Iterable[Tag]] = js.undefined
}

object ReplicationRuleAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[Tag] | Iterable[Tag] = null): ReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRuleAndOperator]
  }
}

