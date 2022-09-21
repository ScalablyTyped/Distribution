package typings.vegaLite8ozrbXDH.transformDTsMod

import typings.vegaLite8ozrbXDH.binDTsMod.BinParams
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinTransform
  extends StObject
     with Transform {
  
  /**
    * The output fields at which to write the start and end bin values.
    * This can be either a string or an array of strings with two elements denoting the name for the fields for bin start and bin end respectively.
    * If a single string (e.g., `"val"`) is provided, the end field will be `"val_end"`.
    */
  var as: FieldName | js.Array[FieldName]
  
  /**
    * An object indicating bin properties, or simply `true` for using default bin parameters.
    */
  var bin: `true` | BinParams
  
  /**
    * The data field to bin.
    */
  var field: FieldName
}
object BinTransform {
  
  inline def apply(as: FieldName | js.Array[FieldName], bin: `true` | BinParams, field: FieldName): BinTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinTransform]
  }
  
  extension [Self <: BinTransform](x: Self) {
    
    inline def setAs(value: FieldName | js.Array[FieldName]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsVarargs(value: FieldName*): Self = StObject.set(x, "as", js.Array(value*))
    
    inline def setBin(value: `true` | BinParams): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
