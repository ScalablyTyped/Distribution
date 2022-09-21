package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.anon.Group
import typings.concurrently5oeeHgIv.commandDTsMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputWriterDTsMod {
  
  @JSImport(".concurrently-5oeeHgIv/dist/src/output-writer.d.ts", "OutputWriter")
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
