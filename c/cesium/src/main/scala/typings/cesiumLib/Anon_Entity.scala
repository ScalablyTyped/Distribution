package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entity extends js.Object {
  var entity: cesiumLib.cesiumMod.Entity
  var geometryOptions: js.Any
  var geometryPropertyName: java.lang.String
  var observedPropertyNames: js.Array[java.lang.String]
  var scene: cesiumLib.cesiumMod.Scene
}

object Anon_Entity {
  @scala.inline
  def apply(
    entity: cesiumLib.cesiumMod.Entity,
    geometryOptions: js.Any,
    geometryPropertyName: java.lang.String,
    observedPropertyNames: js.Array[java.lang.String],
    scene: cesiumLib.cesiumMod.Scene
  ): Anon_Entity = {
    val __obj = js.Dynamic.literal(entity = entity, geometryOptions = geometryOptions, geometryPropertyName = geometryPropertyName, observedPropertyNames = observedPropertyNames, scene = scene)
  
    __obj.asInstanceOf[Anon_Entity]
  }
}

