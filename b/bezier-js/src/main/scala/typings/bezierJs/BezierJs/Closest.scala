package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Closest extends js.Object {
  
  var mdist: Double = js.native
  
  var mpos: Double = js.native
}
object Closest {
  
  @scala.inline
  def apply(mdist: Double, mpos: Double): Closest = {
    val __obj = js.Dynamic.literal(mdist = mdist.asInstanceOf[js.Any], mpos = mpos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closest]
  }
  
  @scala.inline
  implicit class ClosestOps[Self <: Closest] (val x: Self) extends AnyVal {
    
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
    def setMdist(value: Double): Self = this.set("mdist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpos(value: Double): Self = this.set("mpos", value.asInstanceOf[js.Any])
  }
}
