package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entity extends js.Object {
  var entity: typings.cesium.mod.Entity = js.native
  var geometryOptions: js.Any = js.native
  var geometryPropertyName: String = js.native
  var observedPropertyNames: js.Array[String] = js.native
  var scene: typings.cesium.mod.Scene = js.native
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
  @scala.inline
  implicit class EntityOps[Self <: Entity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntity(value: typings.cesium.mod.Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometryOptions(value: js.Any): Self = this.set("geometryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometryPropertyName(value: String): Self = this.set("geometryPropertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setObservedPropertyNamesVarargs(value: String*): Self = this.set("observedPropertyNames", js.Array(value :_*))
    @scala.inline
    def setObservedPropertyNames(value: js.Array[String]): Self = this.set("observedPropertyNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setScene(value: typings.cesium.mod.Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
  }
  
}

