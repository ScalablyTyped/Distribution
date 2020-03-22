package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnMetadata extends js.Object {
  var defaultValue: String
  /// <summary>
  /// Escaped identifier for the name of the column
  /// </summary>
  var escapedName: String
  var hasExtendedProperties: Boolean
  /// <summary>
  /// Whether or not the column is calculated on the server side. This could be a computed
  /// column or a identity column.
  /// </summary>
  var isCalculated: Boolean
  /// <summary>
  /// Whether or not the column is computed
  /// </summary>
  var isComputed: Boolean
  /// <summary>
  /// Whether or not the column is deterministically computed
  /// </summary>
  var isDeterministic: Boolean
  /// <summary>
  /// Whether or not the column is an identity column
  /// </summary>
  var isIdentity: Boolean
  /// <summary>
  /// Whether or not the column is used in a key to uniquely identify a row
  /// </summary>
  var isKey: Boolean
  /// <summary>
  /// Whether or not the column can be trusted for uniqueness
  /// </summary>
  var isTrustworthyForUniqueness: Boolean
  /// <summary>
  /// The ordinal ID of the column
  /// </summary>
  var ordinal: Double
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
}

