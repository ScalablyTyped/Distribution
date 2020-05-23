package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyChangedEventArgs extends js.Object {
  var entity: Entity
  var newValue: js.Any
  var oldValue: js.Any
  var parent: js.Any
  var property: IProperty
  var propertyName: String
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
}

