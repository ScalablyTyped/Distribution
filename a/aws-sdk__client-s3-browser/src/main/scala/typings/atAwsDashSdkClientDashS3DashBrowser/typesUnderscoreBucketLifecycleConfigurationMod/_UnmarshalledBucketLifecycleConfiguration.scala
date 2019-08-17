package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreBucketLifecycleConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleRuleMod._UnmarshalledLifecycleRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledBucketLifecycleConfiguration extends _BucketLifecycleConfiguration {
  /**
    * _LifecycleRules shape
    */
  @JSName("Rules")
  var Rules__UnmarshalledBucketLifecycleConfiguration: js.Array[_UnmarshalledLifecycleRule]
}

object _UnmarshalledBucketLifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[_UnmarshalledLifecycleRule]): _UnmarshalledBucketLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules)
  
    __obj.asInstanceOf[_UnmarshalledBucketLifecycleConfiguration]
  }
}

