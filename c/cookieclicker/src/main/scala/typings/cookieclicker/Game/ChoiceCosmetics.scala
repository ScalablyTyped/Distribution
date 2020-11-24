package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChoiceCosmetics extends js.Object {
  
  /**
    * The picture to use
    */
  var pic: String = js.native
}
object ChoiceCosmetics {
  
  @scala.inline
  def apply(pic: String): ChoiceCosmetics = {
    val __obj = js.Dynamic.literal(pic = pic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceCosmetics]
  }
  
  @scala.inline
  implicit class ChoiceCosmeticsOps[Self <: ChoiceCosmetics] (val x: Self) extends AnyVal {
    
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
    def setPic(value: String): Self = this.set("pic", value.asInstanceOf[js.Any])
  }
}
