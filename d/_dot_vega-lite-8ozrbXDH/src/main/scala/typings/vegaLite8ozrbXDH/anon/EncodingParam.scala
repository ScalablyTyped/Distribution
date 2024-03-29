package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channelDTsMod.SingleDefUnitChannel
import typings.vegaLite8ozrbXDH.parameterDTsMod.ParameterName
import typings.vegaLite8ozrbXDH.selectionDTsMod.ParameterExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingParam
  extends StObject
     with ParameterExtent {
  
  /**
    * If a selection parameter is specified, the encoding channel to extract selected values for
    * when a selection is [projected](https://vega.github.io/vega-lite/docs/selection.html#project) over multiple fields or encodings.
    */
  var encoding: js.UndefOr[SingleDefUnitChannel] = js.undefined
  
  /**
    * The name of a parameter.
    */
  var param: ParameterName
}
object EncodingParam {
  
  inline def apply(param: ParameterName): EncodingParam = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingParam]
  }
  
  extension [Self <: EncodingParam](x: Self) {
    
    inline def setEncoding(value: SingleDefUnitChannel): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setParam(value: ParameterName): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
  }
}
