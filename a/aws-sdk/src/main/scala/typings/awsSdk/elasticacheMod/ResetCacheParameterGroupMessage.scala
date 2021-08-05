package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetCacheParameterGroupMessage extends StObject {
  
  /**
    * The name of the cache parameter group to reset.
    */
  var CacheParameterGroupName: String
  
  /**
    * An array of parameter names to reset to their default values. If ResetAllParameters is true, do not use ParameterNameValues. If ResetAllParameters is false, you must specify the name of at least one parameter to reset.
    */
  var ParameterNameValues: js.UndefOr[ParameterNameValueList] = js.undefined
  
  /**
    * If true, all parameters in the cache parameter group are reset to their default values. If false, only the parameters listed by ParameterNameValues are reset to their default values. Valid values: true | false 
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.undefined
}
object ResetCacheParameterGroupMessage {
  
  inline def apply(CacheParameterGroupName: String): ResetCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetCacheParameterGroupMessage]
  }
  
  extension [Self <: ResetCacheParameterGroupMessage](x: Self) {
    
    inline def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameValues(value: ParameterNameValueList): Self = StObject.set(x, "ParameterNameValues", value.asInstanceOf[js.Any])
    
    inline def setParameterNameValuesUndefined: Self = StObject.set(x, "ParameterNameValues", js.undefined)
    
    inline def setParameterNameValuesVarargs(value: ParameterNameValue*): Self = StObject.set(x, "ParameterNameValues", js.Array(value :_*))
    
    inline def setResetAllParameters(value: Boolean): Self = StObject.set(x, "ResetAllParameters", value.asInstanceOf[js.Any])
    
    inline def setResetAllParametersUndefined: Self = StObject.set(x, "ResetAllParameters", js.undefined)
  }
}
