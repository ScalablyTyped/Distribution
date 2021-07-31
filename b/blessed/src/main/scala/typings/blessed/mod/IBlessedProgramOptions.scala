package typings.blessed.mod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBlessedProgramOptions extends StObject {
  
  var buffer: js.UndefOr[Boolean] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var dump: js.UndefOr[Boolean] = js.undefined
  
  var input: js.UndefOr[Readable] = js.undefined
  
  var log: js.UndefOr[String] = js.undefined
  
  var output: js.UndefOr[Writable] = js.undefined
  
  var resizeTimeout: js.UndefOr[Boolean] = js.undefined
  
  var term: js.UndefOr[String] = js.undefined
  
  var terminal: js.UndefOr[String] = js.undefined
  
  var tput: js.UndefOr[String] = js.undefined
  
  var zero: js.UndefOr[Boolean] = js.undefined
}
object IBlessedProgramOptions {
  
  @scala.inline
  def apply(): IBlessedProgramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBlessedProgramOptions]
  }
  
  @scala.inline
  implicit class IBlessedProgramOptionsMutableBuilder[Self <: IBlessedProgramOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDump(value: Boolean): Self = StObject.set(x, "dump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDumpUndefined: Self = StObject.set(x, "dump", js.undefined)
    
    @scala.inline
    def setInput(value: Readable): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setOutput(value: Writable): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setResizeTimeout(value: Boolean): Self = StObject.set(x, "resizeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeTimeoutUndefined: Self = StObject.set(x, "resizeTimeout", js.undefined)
    
    @scala.inline
    def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    @scala.inline
    def setTerminal(value: String): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
    
    @scala.inline
    def setTput(value: String): Self = StObject.set(x, "tput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTputUndefined: Self = StObject.set(x, "tput", js.undefined)
    
    @scala.inline
    def setZero(value: Boolean): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
