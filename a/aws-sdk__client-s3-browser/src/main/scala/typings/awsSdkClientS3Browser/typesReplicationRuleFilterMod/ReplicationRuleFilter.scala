package typings.awsSdkClientS3Browser.typesReplicationRuleFilterMod

import typings.awsSdkClientS3Browser.typesReplicationRuleAndOperatorMod.ReplicationRuleAndOperator
import typings.awsSdkClientS3Browser.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationRuleFilter extends js.Object {
  /**
    * <p>Container for specifying rule filters. These filters determine the subset of objects to which the rule applies. The element is required only if you specify more than one filter. For example: </p> <ul> <li> <p>You specify both a <code>Prefix</code> and a <code>Tag</code> filters. Then you wrap these in an <code>And</code> tag.</p> </li> <li> <p>You specify filter based on multiple tags. Then you wrap the <code>Tag</code> elements in an <code>And</code> tag.</p> </li> </ul>
    */
  var And: js.UndefOr[ReplicationRuleAndOperator] = js.native
  /**
    * <p>Object keyname prefix that identifies subset of objects to which the rule applies.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>Container for specifying a tag key and value. </p> <p>The rule applies only to objects having the tag in its tagset.</p>
    */
  var Tag: js.UndefOr[typings.awsSdkClientS3Browser.typesTagMod.Tag] = js.native
}

object ReplicationRuleFilter {
  @scala.inline
  def apply(): ReplicationRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRuleFilter]
  }
  @scala.inline
  implicit class ReplicationRuleFilterOps[Self <: ReplicationRuleFilter] (val x: Self) extends AnyVal {
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
    def setAnd(value: ReplicationRuleAndOperator): Self = this.set("And", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnd: Self = this.set("And", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setTag(value: Tag): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

