package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyGroupSummary extends js.Object {
  
  /**
    * A key group.
    */
  var KeyGroup: typings.awsSdk.cloudfrontMod.KeyGroup = js.native
}
object KeyGroupSummary {
  
  @scala.inline
  def apply(KeyGroup: KeyGroup): KeyGroupSummary = {
    val __obj = js.Dynamic.literal(KeyGroup = KeyGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGroupSummary]
  }
  
  @scala.inline
  implicit class KeyGroupSummaryOps[Self <: KeyGroupSummary] (val x: Self) extends AnyVal {
    
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
    def setKeyGroup(value: KeyGroup): Self = this.set("KeyGroup", value.asInstanceOf[js.Any])
  }
}
