package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRelationalDatabaseParametersRequest extends js.Object {
  
  /**
    * The database parameters to update.
    */
  var parameters: RelationalDatabaseParameterList = js.native
  
  /**
    * The name of your database for which to update parameters.
    */
  var relationalDatabaseName: ResourceName = js.native
}
object UpdateRelationalDatabaseParametersRequest {
  
  @scala.inline
  def apply(parameters: RelationalDatabaseParameterList, relationalDatabaseName: ResourceName): UpdateRelationalDatabaseParametersRequest = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRelationalDatabaseParametersRequest]
  }
  
  @scala.inline
  implicit class UpdateRelationalDatabaseParametersRequestOps[Self <: UpdateRelationalDatabaseParametersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParametersVarargs(value: RelationalDatabaseParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: RelationalDatabaseParameterList): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseName(value: ResourceName): Self = this.set("relationalDatabaseName", value.asInstanceOf[js.Any])
  }
}
