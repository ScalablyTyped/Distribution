package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyLevelUpdate extends js.Object {
  
  /**
    * The name of the user hierarchy level. Must not be more than 50 characters.
    */
  var Name: HierarchyLevelName = js.native
}
object HierarchyLevelUpdate {
  
  @scala.inline
  def apply(Name: HierarchyLevelName): HierarchyLevelUpdate = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyLevelUpdate]
  }
  
  @scala.inline
  implicit class HierarchyLevelUpdateOps[Self <: HierarchyLevelUpdate] (val x: Self) extends AnyVal {
    
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
    def setName(value: HierarchyLevelName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
