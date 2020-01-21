package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentProperties extends js.Object {
  /**
    * Describes the execution property groups.
    */
  var PropertyGroups: typings.awsSdk.kinesisanalyticsv2Mod.PropertyGroups = js.native
}

object EnvironmentProperties {
  @scala.inline
  def apply(PropertyGroups: PropertyGroups): EnvironmentProperties = {
    val __obj = js.Dynamic.literal(PropertyGroups = PropertyGroups.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnvironmentProperties]
  }
}

