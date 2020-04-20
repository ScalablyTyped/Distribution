package typings.awsSdkClientS3Node.typesBucketLifecycleConfigurationMod

import typings.awsSdkClientS3Node.typesLifecycleRuleMod.UnmarshalledLifecycleRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledBucketLifecycleConfiguration extends BucketLifecycleConfiguration {
  /**
    * _LifecycleRules shape
    */
  @JSName("Rules")
  var Rules_UnmarshalledBucketLifecycleConfiguration: js.Array[UnmarshalledLifecycleRule]
}

object UnmarshalledBucketLifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[UnmarshalledLifecycleRule]): UnmarshalledBucketLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledBucketLifecycleConfiguration]
  }
}

