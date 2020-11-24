package typings.bip174.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PsbtGlobalUpdate extends js.Object {
  
  var globalXpub: js.UndefOr[js.Array[GlobalXpub]] = js.native
}
object PsbtGlobalUpdate {
  
  @scala.inline
  def apply(): PsbtGlobalUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtGlobalUpdate]
  }
  
  @scala.inline
  implicit class PsbtGlobalUpdateOps[Self <: PsbtGlobalUpdate] (val x: Self) extends AnyVal {
    
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
    def setGlobalXpubVarargs(value: GlobalXpub*): Self = this.set("globalXpub", js.Array(value :_*))
    
    @scala.inline
    def setGlobalXpub(value: js.Array[GlobalXpub]): Self = this.set("globalXpub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalXpub: Self = this.set("globalXpub", js.undefined)
  }
}
