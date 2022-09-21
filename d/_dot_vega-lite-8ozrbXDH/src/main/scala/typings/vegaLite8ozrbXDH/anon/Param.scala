package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.parameterDTsMod.ParameterName
import typings.vegaLite8ozrbXDH.selectionDTsMod.ParameterExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Param
  extends StObject
     with ParameterExtent {
  
  /**
    * If a selection parameter is specified, the field name to extract selected values for
    * when the selection is [projected](https://vega.github.io/vega-lite/docs/selection.html#project) over multiple fields or encodings.
    */
  var field: js.UndefOr[FieldName] = js.undefined
  
  /**
    * The name of a parameter.
    */
  var param: ParameterName
}
object Param {
  
  inline def apply(param: ParameterName): Param = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
  
  extension [Self <: Param](x: Self) {
    
    inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setParam(value: ParameterName): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
  }
}
