package typings.awsSdkClientS3Node.typesLifecycleConfigurationMod

import typings.awsSdkClientS3Node.typesRuleMod.UnmarshalledRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledLifecycleConfiguration extends LifecycleConfiguration {
  /**
    * _Rules shape
    */
  @JSName("Rules")
  var Rules_UnmarshalledLifecycleConfiguration: js.Array[UnmarshalledRule]
}

object UnmarshalledLifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[UnmarshalledRule]): UnmarshalledLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnmarshalledLifecycleConfiguration]
  }
}

