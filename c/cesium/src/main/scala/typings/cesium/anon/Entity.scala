package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  var entity: typings.cesium.mod.Entity
  var geometryOptions: js.Any
  var geometryPropertyName: String
  var observedPropertyNames: js.Array[String]
  var scene: typings.cesium.mod.Scene
}

object Entity {
  @scala.inline
  def apply(
    entity: typings.cesium.mod.Entity,
    geometryOptions: js.Any,
    geometryPropertyName: String,
    observedPropertyNames: js.Array[String],
    scene: typings.cesium.mod.Scene
  ): Entity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], geometryOptions = geometryOptions.asInstanceOf[js.Any], geometryPropertyName = geometryPropertyName.asInstanceOf[js.Any], observedPropertyNames = observedPropertyNames.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

