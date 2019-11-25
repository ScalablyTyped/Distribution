package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPropertyOptions extends js.Object {
  var associationName: js.UndefOr[String] = js.undefined
  var entityTypeName: String
  var foreignKeyNames: js.UndefOr[js.Array[String]] = js.undefined
  var foreignKeyNamesOnServer: js.UndefOr[js.Array[String]] = js.undefined
  var isScalar: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nameOnServer: js.UndefOr[String] = js.undefined
  var validators: js.UndefOr[js.Array[Validator]] = js.undefined
}

object NavigationPropertyOptions {
  @scala.inline
  def apply(
    entityTypeName: String,
    associationName: String = null,
    foreignKeyNames: js.Array[String] = null,
    foreignKeyNamesOnServer: js.Array[String] = null,
    isScalar: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    nameOnServer: String = null,
    validators: js.Array[Validator] = null
  ): NavigationPropertyOptions = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any])
    if (associationName != null) __obj.updateDynamic("associationName")(associationName.asInstanceOf[js.Any])
    if (foreignKeyNames != null) __obj.updateDynamic("foreignKeyNames")(foreignKeyNames.asInstanceOf[js.Any])
    if (foreignKeyNamesOnServer != null) __obj.updateDynamic("foreignKeyNamesOnServer")(foreignKeyNamesOnServer.asInstanceOf[js.Any])
    if (!js.isUndefined(isScalar)) __obj.updateDynamic("isScalar")(isScalar.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameOnServer != null) __obj.updateDynamic("nameOnServer")(nameOnServer.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPropertyOptions]
  }
}

