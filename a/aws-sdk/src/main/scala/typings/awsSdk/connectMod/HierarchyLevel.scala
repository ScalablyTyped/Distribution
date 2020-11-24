package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyLevel extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the hierarchy level.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the hierarchy level.
    */
  var Id: js.UndefOr[HierarchyLevelId] = js.native
  
  /**
    * The name of the hierarchy level.
    */
  var Name: js.UndefOr[HierarchyLevelName] = js.native
}
object HierarchyLevel {
  
  @scala.inline
  def apply(): HierarchyLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyLevel]
  }
  
  @scala.inline
  implicit class HierarchyLevelOps[Self <: HierarchyLevel] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ARN): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setId(value: HierarchyLevelId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: HierarchyLevelName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
