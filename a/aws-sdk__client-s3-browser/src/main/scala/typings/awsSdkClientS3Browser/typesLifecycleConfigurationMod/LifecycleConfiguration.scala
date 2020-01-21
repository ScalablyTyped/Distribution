package typings.awsSdkClientS3Browser.typesLifecycleConfigurationMod

import typings.awsSdkClientS3Browser.typesRuleMod.Rule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleConfiguration extends js.Object {
  /**
    * _Rules shape
    */
  var Rules: js.Array[Rule] | Iterable[Rule]
}

object LifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[Rule] | Iterable[Rule]): LifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LifecycleConfiguration]
  }
}

