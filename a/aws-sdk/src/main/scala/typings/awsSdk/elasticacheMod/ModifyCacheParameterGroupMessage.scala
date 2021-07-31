package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCacheParameterGroupMessage extends StObject {
  
  /**
    * The name of the cache parameter group to modify.
    */
  var CacheParameterGroupName: String
  
  /**
    * An array of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
    */
  var ParameterNameValues: ParameterNameValueList
}
object ModifyCacheParameterGroupMessage {
  
  @scala.inline
  def apply(CacheParameterGroupName: String, ParameterNameValues: ParameterNameValueList): ModifyCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any], ParameterNameValues = ParameterNameValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCacheParameterGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyCacheParameterGroupMessageMutableBuilder[Self <: ModifyCacheParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNameValues(value: ParameterNameValueList): Self = StObject.set(x, "ParameterNameValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNameValuesVarargs(value: ParameterNameValue*): Self = StObject.set(x, "ParameterNameValues", js.Array(value :_*))
  }
}
