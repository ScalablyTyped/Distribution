package typings.awsSdkClientS3Node.typesBucketLifecycleConfigurationMod

import typings.awsSdkClientS3Node.typesLifecycleRuleMod.LifecycleRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketLifecycleConfiguration extends js.Object {
  /**
    * _LifecycleRules shape
    */
  var Rules: js.Array[LifecycleRule] | Iterable[LifecycleRule]
}

object BucketLifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[LifecycleRule] | Iterable[LifecycleRule]): BucketLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketLifecycleConfiguration]
  }
}

