package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.block
import typings.blessed.blessedStrings.line
import typings.blessed.blessedStrings.underline
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalOptions
  extends StObject
     with BoxOptions {
  
  /**
    * args for shell.
    */
  var args: js.UndefOr[Any] = js.undefined
  
  /**
    * can be line, underline, and block.
    */
  var cursor: js.UndefOr[line | underline | block] = js.undefined
  
  /**
    * Object for process env.
    */
  var env: js.UndefOr[Any] = js.undefined
  
  /**
    * handler for input data.
    */
  var handler: js.UndefOr[js.Function1[/* userInput */ Buffer, Unit]] = js.undefined
  
  /**
    * name of shell. $SHELL by default.
    */
  var shell: js.UndefOr[String] = js.undefined
  
  var terminal: js.UndefOr[String] = js.undefined
}
object TerminalOptions {
  
  inline def apply(): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalOptions]
  }
  
  extension [Self <: TerminalOptions](x: Self) {
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setCursor(value: line | underline | block): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setHandler(value: /* userInput */ Buffer => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    inline def setTerminal(value: String): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
    
    inline def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
  }
}
