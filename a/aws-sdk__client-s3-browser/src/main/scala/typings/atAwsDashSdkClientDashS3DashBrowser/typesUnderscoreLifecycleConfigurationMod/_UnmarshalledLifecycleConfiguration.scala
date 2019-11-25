package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRuleMod._UnmarshalledRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledLifecycleConfiguration extends _LifecycleConfiguration {
  /**
    * _Rules shape
    */
  @JSName("Rules")
  var Rules__UnmarshalledLifecycleConfiguration: js.Array[_UnmarshalledRule]
}

object _UnmarshalledLifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[_UnmarshalledRule]): _UnmarshalledLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledLifecycleConfiguration]
  }
}

