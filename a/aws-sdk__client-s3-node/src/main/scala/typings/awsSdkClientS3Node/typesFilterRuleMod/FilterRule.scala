package typings.awsSdkClientS3Node.typesFilterRuleMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.prefix
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.suffix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterRule extends js.Object {
  /**
    * <p>Object key name prefix or suffix identifying one or more objects to which the filtering rule applies. Maximum prefix length can be up to 1,024 characters. Overlapping prefixes and suffixes are not supported. For more information, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  var Name: js.UndefOr[prefix | suffix | String] = js.native
  /**
    * _FilterRuleValue shape
    */
  var Value: js.UndefOr[String] = js.native
}

object FilterRule {
  @scala.inline
  def apply(): FilterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterRule]
  }
  @scala.inline
  implicit class FilterRuleOps[Self <: FilterRule] (val x: Self) extends AnyVal {
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
    def setName(value: prefix | suffix | String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

