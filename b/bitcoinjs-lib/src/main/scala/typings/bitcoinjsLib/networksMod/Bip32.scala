package typings.bitcoinjsLib.networksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bip32 extends js.Object {
  
  var `private`: Double = js.native
  
  var public: Double = js.native
}
object Bip32 {
  
  @scala.inline
  def apply(`private`: Double, public: Double): Bip32 = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bip32]
  }
  
  @scala.inline
  implicit class Bip32Ops[Self <: Bip32] (val x: Self) extends AnyVal {
    
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
    def setPrivate(value: Double): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: Double): Self = this.set("public", value.asInstanceOf[js.Any])
  }
}
