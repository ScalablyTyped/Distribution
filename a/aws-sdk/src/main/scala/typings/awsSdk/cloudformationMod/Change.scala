package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change extends js.Object {
  
  /**
    * A ResourceChange structure that describes the resource and action that AWS CloudFormation will perform.
    */
  var ResourceChange: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceChange] = js.native
  
  /**
    * The type of entity that AWS CloudFormation changes. Currently, the only entity type is Resource.
    */
  var Type: js.UndefOr[ChangeType] = js.native
}
object Change {
  
  @scala.inline
  def apply(): Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
    
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
    def setResourceChange(value: ResourceChange): Self = this.set("ResourceChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceChange: Self = this.set("ResourceChange", js.undefined)
    
    @scala.inline
    def setType(value: ChangeType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
