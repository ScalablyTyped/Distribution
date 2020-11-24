package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interconnects extends js.Object {
  
  /**
    * The interconnects.
    */
  var interconnects: js.UndefOr[InterconnectList] = js.native
}
object Interconnects {
  
  @scala.inline
  def apply(): Interconnects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interconnects]
  }
  
  @scala.inline
  implicit class InterconnectsOps[Self <: Interconnects] (val x: Self) extends AnyVal {
    
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
    def setInterconnectsVarargs(value: Interconnect*): Self = this.set("interconnects", js.Array(value :_*))
    
    @scala.inline
    def setInterconnects(value: InterconnectList): Self = this.set("interconnects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterconnects: Self = this.set("interconnects", js.undefined)
  }
}
