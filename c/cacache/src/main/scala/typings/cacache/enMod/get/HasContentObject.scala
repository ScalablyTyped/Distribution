package typings.cacache.enMod.get

import typings.cacache.anon.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasContentObject extends js.Object {
  
  var size: Double = js.native
  
  var sri: Algorithm = js.native
}
object HasContentObject {
  
  @scala.inline
  def apply(size: Double, sri: Algorithm): HasContentObject = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], sri = sri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasContentObject]
  }
  
  @scala.inline
  implicit class HasContentObjectOps[Self <: HasContentObject] (val x: Self) extends AnyVal {
    
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSri(value: Algorithm): Self = this.set("sri", value.asInstanceOf[js.Any])
  }
}
