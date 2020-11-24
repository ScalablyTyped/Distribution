package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListKeyGroupsResult extends js.Object {
  
  /**
    * A list of key groups.
    */
  var KeyGroupList: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyGroupList] = js.native
}
object ListKeyGroupsResult {
  
  @scala.inline
  def apply(): ListKeyGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyGroupsResult]
  }
  
  @scala.inline
  implicit class ListKeyGroupsResultOps[Self <: ListKeyGroupsResult] (val x: Self) extends AnyVal {
    
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
    def setKeyGroupList(value: KeyGroupList): Self = this.set("KeyGroupList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyGroupList: Self = this.set("KeyGroupList", js.undefined)
  }
}
