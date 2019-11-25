package typings.cesium

import typings.cesium.cesiumMod.Entity
import typings.cesium.cesiumMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entity extends js.Object {
  var entity: Entity
  var geometryOptions: js.Any
  var geometryPropertyName: String
  var observedPropertyNames: js.Array[String]
  var scene: Scene
}

object Anon_Entity {
  @scala.inline
  def apply(
    entity: Entity,
    geometryOptions: js.Any,
    geometryPropertyName: String,
    observedPropertyNames: js.Array[String],
    scene: Scene
  ): Anon_Entity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], geometryOptions = geometryOptions.asInstanceOf[js.Any], geometryPropertyName = geometryPropertyName.asInstanceOf[js.Any], observedPropertyNames = observedPropertyNames.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Entity]
  }
}

