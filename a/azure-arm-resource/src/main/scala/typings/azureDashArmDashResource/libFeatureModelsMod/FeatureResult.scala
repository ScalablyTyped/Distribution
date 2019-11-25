package typings.azureDashArmDashResource.libFeatureModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureResult extends js.Object {
  /**
    * The resource ID of the feature.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The name of the feature.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Properties of the previewed feature.
    */
  var properties: js.UndefOr[FeatureProperties] = js.undefined
  /**
    * The resource type of the feature.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object FeatureResult {
  @scala.inline
  def apply(
    id: String = null,
    name: String = null,
    properties: FeatureProperties = null,
    `type`: String = null
  ): FeatureResult = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureResult]
  }
}

