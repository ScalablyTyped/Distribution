package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPropertyOptions extends js.Object {
  var complexTypeName: js.UndefOr[String] = js.undefined
  var concurrencyMode: js.UndefOr[String] = js.undefined
  var custom: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[DataTypeSymbol] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var isNullable: js.UndefOr[Boolean] = js.undefined
  var isPartOfKey: js.UndefOr[Boolean] = js.undefined
  var isScalar: js.UndefOr[Boolean] = js.undefined
  var isUnmapped: js.UndefOr[Boolean] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nameOnServer: js.UndefOr[String] = js.undefined
  var validators: js.UndefOr[js.Array[Validator]] = js.undefined
}

object DataPropertyOptions {
  @scala.inline
  def apply(
    complexTypeName: String = null,
    concurrencyMode: String = null,
    custom: js.Any = null,
    dataType: DataTypeSymbol = null,
    defaultValue: js.Any = null,
    displayName: String = null,
    isNullable: js.UndefOr[Boolean] = js.undefined,
    isPartOfKey: js.UndefOr[Boolean] = js.undefined,
    isScalar: js.UndefOr[Boolean] = js.undefined,
    isUnmapped: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    name: String = null,
    nameOnServer: String = null,
    validators: js.Array[Validator] = null
  ): DataPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (complexTypeName != null) __obj.updateDynamic("complexTypeName")(complexTypeName.asInstanceOf[js.Any])
    if (concurrencyMode != null) __obj.updateDynamic("concurrencyMode")(concurrencyMode.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(isNullable)) __obj.updateDynamic("isNullable")(isNullable.asInstanceOf[js.Any])
    if (!js.isUndefined(isPartOfKey)) __obj.updateDynamic("isPartOfKey")(isPartOfKey.asInstanceOf[js.Any])
    if (!js.isUndefined(isScalar)) __obj.updateDynamic("isScalar")(isScalar.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnmapped)) __obj.updateDynamic("isUnmapped")(isUnmapped.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameOnServer != null) __obj.updateDynamic("nameOnServer")(nameOnServer.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPropertyOptions]
  }
}

