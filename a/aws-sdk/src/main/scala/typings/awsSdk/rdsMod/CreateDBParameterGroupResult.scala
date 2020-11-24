package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBParameterGroupResult extends js.Object {
  
  var DBParameterGroup: js.UndefOr[typings.awsSdk.rdsMod.DBParameterGroup] = js.native
}
object CreateDBParameterGroupResult {
  
  @scala.inline
  def apply(): CreateDBParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBParameterGroupResult]
  }
  
  @scala.inline
  implicit class CreateDBParameterGroupResultOps[Self <: CreateDBParameterGroupResult] (val x: Self) extends AnyVal {
    
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
    def setDBParameterGroup(value: DBParameterGroup): Self = this.set("DBParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBParameterGroup: Self = this.set("DBParameterGroup", js.undefined)
  }
}
