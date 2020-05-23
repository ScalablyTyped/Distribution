package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnMetadata extends js.Object {
  /**
    * The type of the column.
    */
  var arrayBaseColumnType: js.UndefOr[Integer] = js.native
  /**
    * A value that indicates whether the column increments automatically.
    */
  var isAutoIncrement: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether the column is case-sensitive.
    */
  var isCaseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether the column contains currency values.
    */
  var isCurrency: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether an integer column is signed.
    */
  var isSigned: js.UndefOr[Boolean] = js.native
  /**
    * The label for the column.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The name of the column.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the column is nullable.
    */
  var nullable: js.UndefOr[Integer] = js.native
  /**
    * The precision value of a decimal number column.
    */
  var precision: js.UndefOr[Integer] = js.native
  /**
    * The scale value of a decimal number column.
    */
  var scale: js.UndefOr[Integer] = js.native
  /**
    * The name of the schema that owns the table that includes the column.
    */
  var schemaName: js.UndefOr[String] = js.native
  /**
    * The name of the table that includes the column.
    */
  var tableName: js.UndefOr[String] = js.native
  /**
    * The type of the column.
    */
  var `type`: js.UndefOr[Integer] = js.native
  /**
    * The database-specific data type of the column.
    */
  var typeName: js.UndefOr[String] = js.native
}

object ColumnMetadata {
  @scala.inline
  def apply(
    arrayBaseColumnType: js.UndefOr[Integer] = js.undefined,
    isAutoIncrement: js.UndefOr[Boolean] = js.undefined,
    isCaseSensitive: js.UndefOr[Boolean] = js.undefined,
    isCurrency: js.UndefOr[Boolean] = js.undefined,
    isSigned: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    name: String = null,
    nullable: js.UndefOr[Integer] = js.undefined,
    precision: js.UndefOr[Integer] = js.undefined,
    scale: js.UndefOr[Integer] = js.undefined,
    schemaName: String = null,
    tableName: String = null,
    `type`: js.UndefOr[Integer] = js.undefined,
    typeName: String = null
  ): ColumnMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrayBaseColumnType)) __obj.updateDynamic("arrayBaseColumnType")(arrayBaseColumnType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isAutoIncrement)) __obj.updateDynamic("isAutoIncrement")(isAutoIncrement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCurrency)) __obj.updateDynamic("isCurrency")(isCurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSigned)) __obj.updateDynamic("isSigned")(isSigned.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    if (typeName != null) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetadata]
  }
}

