package typings.vegaLite8ozrbXDH.transformDTsMod

import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupTransform
  extends StObject
     with Transform {
  
  /**
    * The default value to use if lookup fails.
    *
    * __Default value:__ `null`
    */
  var default: js.UndefOr[Any] = js.undefined
  
  /**
    * The output fields on which to store the looked up data values.
    *
    * For data lookups, this property may be left blank if `from.fields`
    * has been specified (those field names will be used); if `from.fields`
    * has not been specified, `as` must be a string.
    *
    * For selection lookups, this property is optional: if unspecified,
    * looked up values will be stored under a property named for the selection;
    * and if specified, it must correspond to `from.fields`.
    */
  var as: js.UndefOr[FieldName | js.Array[FieldName]] = js.undefined
  
  /**
    * Data source or selection for secondary data reference.
    */
  var from: LookupData | LookupSelection
  
  /**
    * Key in primary data source.
    */
  var lookup: String
}
object LookupTransform {
  
  inline def apply(from: LookupData | LookupSelection, lookup: String): LookupTransform = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupTransform]
  }
  
  extension [Self <: LookupTransform](x: Self) {
    
    inline def setAs(value: FieldName | js.Array[FieldName]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAsVarargs(value: FieldName*): Self = StObject.set(x, "as", js.Array(value*))
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setFrom(value: LookupData | LookupSelection): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setLookup(value: String): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
  }
}
