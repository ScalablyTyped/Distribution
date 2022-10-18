package typings.concurrently

import typings.concurrently.anon.Group
import typings.concurrently.distSrcCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOutputWriterMod {
  
  @JSImport("concurrently/dist/src/output-writer", "OutputWriter")
  @js.native
  open class OutputWriter protected () extends StObject {
    def this(hasOutputStreamGroupCommands: Group) = this()
    
    var activeCommandIndex: Double = js.native
    
    val buffers: js.Array[js.Array[String]] = js.native
    
    /* private */ var flushBuffer: Any = js.native
    
    /* private */ val group: Any = js.native
    
    /* private */ val outputStream: Any = js.native
    
    def write(command: Unit, text: String): Unit = js.native
    def write(command: Command, text: String): Unit = js.native
  }
}
