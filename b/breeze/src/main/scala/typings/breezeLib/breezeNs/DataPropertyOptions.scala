package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPropertyOptions extends js.Object {
  var complexTypeName: js.UndefOr[java.lang.String] = js.undefined
  var concurrencyMode: js.UndefOr[java.lang.String] = js.undefined
  var custom: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[DataTypeSymbol] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var isNullable: js.UndefOr[scala.Boolean] = js.undefined
  var isPartOfKey: js.UndefOr[scala.Boolean] = js.undefined
  var isScalar: js.UndefOr[scala.Boolean] = js.undefined
  var isUnmapped: js.UndefOr[scala.Boolean] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var nameOnServer: js.UndefOr[java.lang.String] = js.undefined
  var validators: js.UndefOr[js.Array[Validator]] = js.undefined
}

object DataPropertyOptions {
  @scala.inline
  def apply(
    complexTypeName: java.lang.String = null,
    concurrencyMode: java.lang.String = null,
    custom: js.Any = null,
    dataType: DataTypeSymbol = null,
    defaultValue: js.Any = null,
    displayName: java.lang.String = null,
    isNullable: js.UndefOr[scala.Boolean] = js.undefined,
    isPartOfKey: js.UndefOr[scala.Boolean] = js.undefined,
    isScalar: js.UndefOr[scala.Boolean] = js.undefined,
    isUnmapped: js.UndefOr[scala.Boolean] = js.undefined,
    maxLength: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    nameOnServer: java.lang.String = null,
    validators: js.Array[Validator] = null
  ): DataPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (complexTypeName != null) __obj.updateDynamic("complexTypeName")(complexTypeName)
    if (concurrencyMode != null) __obj.updateDynamic("concurrencyMode")(concurrencyMode)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(isNullable)) __obj.updateDynamic("isNullable")(isNullable)
    if (!js.isUndefined(isPartOfKey)) __obj.updateDynamic("isPartOfKey")(isPartOfKey)
    if (!js.isUndefined(isScalar)) __obj.updateDynamic("isScalar")(isScalar)
    if (!js.isUndefined(isUnmapped)) __obj.updateDynamic("isUnmapped")(isUnmapped)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (nameOnServer != null) __obj.updateDynamic("nameOnServer")(nameOnServer)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[DataPropertyOptions]
  }
}

