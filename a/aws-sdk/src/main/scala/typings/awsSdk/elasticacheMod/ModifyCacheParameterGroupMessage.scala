package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCacheParameterGroupMessage extends js.Object {
  
  /**
    * The name of the cache parameter group to modify.
    */
  var CacheParameterGroupName: String = js.native
  
  /**
    * An array of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
    */
  var ParameterNameValues: ParameterNameValueList = js.native
}
object ModifyCacheParameterGroupMessage {
  
  @scala.inline
  def apply(CacheParameterGroupName: String, ParameterNameValues: ParameterNameValueList): ModifyCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any], ParameterNameValues = ParameterNameValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCacheParameterGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyCacheParameterGroupMessageOps[Self <: ModifyCacheParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = this.set("CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNameValuesVarargs(value: ParameterNameValue*): Self = this.set("ParameterNameValues", js.Array(value :_*))
    
    @scala.inline
    def setParameterNameValues(value: ParameterNameValueList): Self = this.set("ParameterNameValues", value.asInstanceOf[js.Any])
  }
}
