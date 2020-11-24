package typings.brorand.mod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandInstance extends js.Object {
  
  def generate(len: Double): Buffer | Uint8Array = js.native
  
  var rand: typings.brorand.mod.rand = js.native
}
object RandInstance {
  
  @scala.inline
  def apply(generate: Double => Buffer | Uint8Array, rand: rand): RandInstance = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), rand = rand.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandInstance]
  }
  
  @scala.inline
  implicit class RandInstanceOps[Self <: RandInstance] (val x: Self) extends AnyVal {
    
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
    def setGenerate(value: Double => Buffer | Uint8Array): Self = this.set("generate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRand(value: rand): Self = this.set("rand", value.asInstanceOf[js.Any])
  }
}
