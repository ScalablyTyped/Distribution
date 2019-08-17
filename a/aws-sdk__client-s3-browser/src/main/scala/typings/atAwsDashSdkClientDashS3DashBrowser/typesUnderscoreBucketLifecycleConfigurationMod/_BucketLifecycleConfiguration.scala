package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreBucketLifecycleConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleRuleMod._LifecycleRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BucketLifecycleConfiguration extends js.Object {
  /**
    * _LifecycleRules shape
    */
  var Rules: js.Array[_LifecycleRule] | Iterable[_LifecycleRule]
}

object _BucketLifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[_LifecycleRule] | Iterable[_LifecycleRule]): _BucketLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_BucketLifecycleConfiguration]
  }
}

