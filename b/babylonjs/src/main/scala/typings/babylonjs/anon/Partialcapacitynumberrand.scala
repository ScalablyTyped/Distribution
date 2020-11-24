package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  capacity :number,   randomTextureSize :number}> */
@js.native
trait Partialcapacitynumberrand extends js.Object {
  
  var capacity: js.UndefOr[Double] = js.native
  
  var randomTextureSize: js.UndefOr[Double] = js.native
}
object Partialcapacitynumberrand {
  
  @scala.inline
  def apply(): Partialcapacitynumberrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialcapacitynumberrand]
  }
  
  @scala.inline
  implicit class PartialcapacitynumberrandOps[Self <: Partialcapacitynumberrand] (val x: Self) extends AnyVal {
    
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
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    
    @scala.inline
    def setRandomTextureSize(value: Double): Self = this.set("randomTextureSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomTextureSize: Self = this.set("randomTextureSize", js.undefined)
  }
}
