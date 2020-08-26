package typings.awsSdkClientS3Node.typesBucketLifecycleConfigurationMod

import typings.awsSdkClientS3Node.typesLifecycleRuleMod.LifecycleRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleConfiguration extends js.Object {
  /**
    * _LifecycleRules shape
    */
  var Rules: js.Array[LifecycleRule] | Iterable[LifecycleRule] = js.native
}

object BucketLifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[LifecycleRule] | Iterable[LifecycleRule]): BucketLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleConfiguration]
  }
  @scala.inline
  implicit class BucketLifecycleConfigurationOps[Self <: BucketLifecycleConfiguration] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: LifecycleRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[LifecycleRule] | Iterable[LifecycleRule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
  
}

