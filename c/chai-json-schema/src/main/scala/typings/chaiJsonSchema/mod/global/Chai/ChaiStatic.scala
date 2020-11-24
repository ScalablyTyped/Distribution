package typings.chaiJsonSchema.mod.global.Chai

import typings.tv4.mod.TV4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChaiStatic extends js.Object {
  
  var tv4: TV4 = js.native
}
object ChaiStatic {
  
  @scala.inline
  def apply(tv4: TV4): ChaiStatic = {
    val __obj = js.Dynamic.literal(tv4 = tv4.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChaiStatic]
  }
  
  @scala.inline
  implicit class ChaiStaticOps[Self <: ChaiStatic] (val x: Self) extends AnyVal {
    
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
    def setTv4(value: TV4): Self = this.set("tv4", value.asInstanceOf[js.Any])
  }
}
