package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyChangedEventArgs extends js.Object {
  var entity: Entity = js.native
  var newValue: js.Any = js.native
  var oldValue: js.Any = js.native
  var parent: js.Any = js.native
  var property: IProperty = js.native
  var propertyName: String = js.native
}

object PropertyChangedEventArgs {
  @scala.inline
  def apply(
    entity: Entity,
    newValue: js.Any,
    oldValue: js.Any,
    parent: js.Any,
    property: IProperty,
    propertyName: String
  ): PropertyChangedEventArgs = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangedEventArgs]
  }
  @scala.inline
  implicit class PropertyChangedEventArgsOps[Self <: PropertyChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setEntity(value: Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewValue(value: js.Any): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: IProperty): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
  }
  
}

