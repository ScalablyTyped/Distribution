package typings.vegaLite8ozrbXDH.transformDTsMod

import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.imputeDotDTsMod.ImputeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImputeTransform
  extends StObject
     with ImputeParams
     with Transform {
  
  /**
    * An optional array of fields by which to group the values.
    * Imputation will then be performed on a per-group basis.
    */
  var groupby: js.UndefOr[js.Array[FieldName]] = js.undefined
  
  /**
    * The data field for which the missing values should be imputed.
    */
  var impute: FieldName
  
  /**
    * A key field that uniquely identifies data objects within a group.
    * Missing key values (those occurring in the data but not in the current group) will be imputed.
    */
  var key: FieldName
}
object ImputeTransform {
  
  inline def apply(impute: FieldName, key: FieldName): ImputeTransform = {
    val __obj = js.Dynamic.literal(impute = impute.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImputeTransform]
  }
  
  extension [Self <: ImputeTransform](x: Self) {
    
    inline def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setImpute(value: FieldName): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
    
    inline def setKey(value: FieldName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
