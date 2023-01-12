package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnMetadata extends StObject {
  
  var defaultValue: String
  
  /**
    * Escaped identifier for the name of the column
    */
  var escapedName: String
  
  var hasExtendedProperties: Boolean
  
  /**
    * Whether or not the column is calculated on the server side. This could be a computed
    * column or a identity column.
    */
  var isCalculated: Boolean
  
  /**
    * Whether or not the column is computed
    */
  var isComputed: Boolean
  
  /**
    * Whether or not the column is deterministically computed
    */
  var isDeterministic: Boolean
  
  /**
    * Whether or not the column is an identity column
    */
  var isIdentity: Boolean
  
  /**
    * Whether or not the column is used in a key to uniquely identify a row
    */
  var isKey: Boolean
  
  /**
    * Whether or not the column can be trusted for uniqueness
    */
  var isTrustworthyForUniqueness: Boolean
  
  /**
    * The ordinal ID of the column
    */
  var ordinal: Double
}
object ColumnMetadata {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ColumnMetadata] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setEscapedName(value: String): Self = StObject.set(x, "escapedName", value.asInstanceOf[js.Any])
    
    inline def setHasExtendedProperties(value: Boolean): Self = StObject.set(x, "hasExtendedProperties", value.asInstanceOf[js.Any])
    
    inline def setIsCalculated(value: Boolean): Self = StObject.set(x, "isCalculated", value.asInstanceOf[js.Any])
    
    inline def setIsComputed(value: Boolean): Self = StObject.set(x, "isComputed", value.asInstanceOf[js.Any])
    
    inline def setIsDeterministic(value: Boolean): Self = StObject.set(x, "isDeterministic", value.asInstanceOf[js.Any])
    
    inline def setIsIdentity(value: Boolean): Self = StObject.set(x, "isIdentity", value.asInstanceOf[js.Any])
    
    inline def setIsKey(value: Boolean): Self = StObject.set(x, "isKey", value.asInstanceOf[js.Any])
    
    inline def setIsTrustworthyForUniqueness(value: Boolean): Self = StObject.set(x, "isTrustworthyForUniqueness", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
  }
}
