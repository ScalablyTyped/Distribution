package typings.blessed.mod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlessedProgramOptions extends js.Object {
  
  var buffer: js.UndefOr[Boolean] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var dump: js.UndefOr[Boolean] = js.native
  
  var input: js.UndefOr[Readable] = js.native
  
  var log: js.UndefOr[String] = js.native
  
  var output: js.UndefOr[Writable] = js.native
  
  var resizeTimeout: js.UndefOr[Boolean] = js.native
  
  var term: js.UndefOr[String] = js.native
  
  var terminal: js.UndefOr[String] = js.native
  
  var tput: js.UndefOr[String] = js.native
  
  var zero: js.UndefOr[Boolean] = js.native
}
object IBlessedProgramOptions {
  
  @scala.inline
  def apply(): IBlessedProgramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBlessedProgramOptions]
  }
  
  @scala.inline
  implicit class IBlessedProgramOptionsOps[Self <: IBlessedProgramOptions] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDump(value: Boolean): Self = this.set("dump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDump: Self = this.set("dump", js.undefined)
    
    @scala.inline
    def setInput(value: Readable): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLog(value: String): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setOutput(value: Writable): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setResizeTimeout(value: Boolean): Self = this.set("resizeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeTimeout: Self = this.set("resizeTimeout", js.undefined)
    
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
    
    @scala.inline
    def setTerminal(value: String): Self = this.set("terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminal: Self = this.set("terminal", js.undefined)
    
    @scala.inline
    def setTput(value: String): Self = this.set("tput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTput: Self = this.set("tput", js.undefined)
    
    @scala.inline
    def setZero(value: Boolean): Self = this.set("zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
}
