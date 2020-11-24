package typings.cryptoHash.mod

import typings.cryptoHash.cryptoHashStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionBufferOutput extends js.Object {
  
  var outputFormat: buffer = js.native
}
object OptionBufferOutput {
  
  @scala.inline
  def apply(outputFormat: buffer): OptionBufferOutput = {
    val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionBufferOutput]
  }
  
  @scala.inline
  implicit class OptionBufferOutputOps[Self <: OptionBufferOutput] (val x: Self) extends AnyVal {
    
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
    def setOutputFormat(value: buffer): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
  }
}
