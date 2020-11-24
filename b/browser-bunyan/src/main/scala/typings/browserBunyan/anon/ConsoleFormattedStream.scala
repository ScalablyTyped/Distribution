package typings.browserBunyan.anon

import typings.browserBunyan.mod.BrowserBunyan.ConsoleRawStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleFormattedStream extends js.Object {
  
  var ConsoleFormattedStream: typings.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream = js.native
  
  var ConsoleRawStream: typings.browserBunyan.mod.BrowserBunyan.ConsoleRawStream = js.native
}
object ConsoleFormattedStream {
  
  @scala.inline
  def apply(
    ConsoleFormattedStream: typings.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream,
    ConsoleRawStream: ConsoleRawStream
  ): ConsoleFormattedStream = {
    val __obj = js.Dynamic.literal(ConsoleFormattedStream = ConsoleFormattedStream.asInstanceOf[js.Any], ConsoleRawStream = ConsoleRawStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleFormattedStream]
  }
  
  @scala.inline
  implicit class ConsoleFormattedStreamOps[Self <: ConsoleFormattedStream] (val x: Self) extends AnyVal {
    
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
    def setConsoleFormattedStream(value: typings.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream): Self = this.set("ConsoleFormattedStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleRawStream(value: ConsoleRawStream): Self = this.set("ConsoleRawStream", value.asInstanceOf[js.Any])
  }
}
