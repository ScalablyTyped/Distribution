package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnMetadata extends js.Object {
  var defaultValue: String = js.native
  /// <summary>
  /// Escaped identifier for the name of the column
  /// </summary>
  var escapedName: String = js.native
  var hasExtendedProperties: Boolean = js.native
  /// <summary>
  /// Whether or not the column is calculated on the server side. This could be a computed
  /// column or a identity column.
  /// </summary>
  var isCalculated: Boolean = js.native
  /// <summary>
  /// Whether or not the column is computed
  /// </summary>
  var isComputed: Boolean = js.native
  /// <summary>
  /// Whether or not the column is deterministically computed
  /// </summary>
  var isDeterministic: Boolean = js.native
  /// <summary>
  /// Whether or not the column is an identity column
  /// </summary>
  var isIdentity: Boolean = js.native
  /// <summary>
  /// Whether or not the column is used in a key to uniquely identify a row
  /// </summary>
  var isKey: Boolean = js.native
  /// <summary>
  /// Whether or not the column can be trusted for uniqueness
  /// </summary>
  var isTrustworthyForUniqueness: Boolean = js.native
  /// <summary>
  /// The ordinal ID of the column
  /// </summary>
  var ordinal: Double = js.native
}

object ColumnMetadata {
  @scala.inline
  def apply(
    defaultValue: String,
    escapedName: String,
    hasExtendedProperties: Boolean,
    isCalculated: Boolean,
    isComputed: Boolean,
    isDeterministic: Boolean,
    isIdentity: Boolean,
    isKey: Boolean,
    isTrustworthyForUniqueness: Boolean,
    ordinal: Double
  ): ColumnMetadata = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], escapedName = escapedName.asInstanceOf[js.Any], hasExtendedProperties = hasExtendedProperties.asInstanceOf[js.Any], isCalculated = isCalculated.asInstanceOf[js.Any], isComputed = isComputed.asInstanceOf[js.Any], isDeterministic = isDeterministic.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], isKey = isKey.asInstanceOf[js.Any], isTrustworthyForUniqueness = isTrustworthyForUniqueness.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetadata]
  }
  @scala.inline
  implicit class ColumnMetadataOps[Self <: ColumnMetadata] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscapedName(value: String): Self = this.set("escapedName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasExtendedProperties(value: Boolean): Self = this.set("hasExtendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCalculated(value: Boolean): Self = this.set("isCalculated", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsComputed(value: Boolean): Self = this.set("isComputed", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDeterministic(value: Boolean): Self = this.set("isDeterministic", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIdentity(value: Boolean): Self = this.set("isIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsKey(value: Boolean): Self = this.set("isKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTrustworthyForUniqueness(value: Boolean): Self = this.set("isTrustworthyForUniqueness", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrdinal(value: Double): Self = this.set("ordinal", value.asInstanceOf[js.Any])
  }
  
}

