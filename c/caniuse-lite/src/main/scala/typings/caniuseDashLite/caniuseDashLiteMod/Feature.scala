package typings.caniuseDashLite.caniuseDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  /**
    * Agent support matrix for this feature.
    */
  var stats: StatsByAgentID
  /**
    * Specification status of the feature.
    */
  var status: FeatureStatus
  /**
    * Descriptive title of the feature.
    */
  var title: String
}

object Feature {
  @scala.inline
  def apply(stats: StatsByAgentID, status: FeatureStatus, title: String): Feature = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Feature]
  }
}

@JSImport("caniuse-lite", "feature")
@js.native
object feature extends js.Object {
  def apply(packedFeature: PackedFeature): Feature = js.native
}

