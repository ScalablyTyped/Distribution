package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProperty extends js.Object {
  var displayName: String
  var isDataProperty: Boolean
  var isNavigationProperty: Boolean
  var name: String
  var nameOnServer: String
  var parentType: IStructuralType
  var validators: js.Array[Validator]
}

object IProperty {
  @scala.inline
  def apply(
    displayName: String,
    isDataProperty: Boolean,
    isNavigationProperty: Boolean,
    name: String,
    nameOnServer: String,
    parentType: IStructuralType,
    validators: js.Array[Validator]
  ): IProperty = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isDataProperty = isDataProperty.asInstanceOf[js.Any], isNavigationProperty = isNavigationProperty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameOnServer = nameOnServer.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IProperty]
  }
}

