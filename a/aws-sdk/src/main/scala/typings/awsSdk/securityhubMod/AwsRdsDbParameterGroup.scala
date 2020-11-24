package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbParameterGroup extends js.Object {
  
  /**
    * 
    */
  var DbParameterGroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var ParameterApplyStatus: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbParameterGroup {
  
  @scala.inline
  def apply(): AwsRdsDbParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbParameterGroup]
  }
  
  @scala.inline
  implicit class AwsRdsDbParameterGroupOps[Self <: AwsRdsDbParameterGroup] (val x: Self) extends AnyVal {
    
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
    def setDbParameterGroupName(value: NonEmptyString): Self = this.set("DbParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbParameterGroupName: Self = this.set("DbParameterGroupName", js.undefined)
    
    @scala.inline
    def setParameterApplyStatus(value: NonEmptyString): Self = this.set("ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterApplyStatus: Self = this.set("ParameterApplyStatus", js.undefined)
  }
}
