package typings.blake2.mod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blake2Options extends TransformOptions {
  
  var digestLength: Double = js.native
}
object Blake2Options {
  
  @scala.inline
  def apply(digestLength: Double): Blake2Options = {
    val __obj = js.Dynamic.literal(digestLength = digestLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blake2Options]
  }
  
  @scala.inline
  implicit class Blake2OptionsOps[Self <: Blake2Options] (val x: Self) extends AnyVal {
    
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
    def setDigestLength(value: Double): Self = this.set("digestLength", value.asInstanceOf[js.Any])
  }
}
