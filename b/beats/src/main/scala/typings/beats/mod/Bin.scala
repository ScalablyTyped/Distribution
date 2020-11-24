package typings.beats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bin extends js.Object {
  
  var decay: Double = js.native
  
  var hi: Double = js.native
  
  var lo: Double = js.native
  
  var threshold: Double = js.native
}
object Bin {
  
  @scala.inline
  def apply(decay: Double, hi: Double, lo: Double, threshold: Double): Bin = {
    val __obj = js.Dynamic.literal(decay = decay.asInstanceOf[js.Any], hi = hi.asInstanceOf[js.Any], lo = lo.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
  
  @scala.inline
  implicit class BinOps[Self <: Bin] (val x: Self) extends AnyVal {
    
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
    def setDecay(value: Double): Self = this.set("decay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHi(value: Double): Self = this.set("hi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLo(value: Double): Self = this.set("lo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
  }
}
