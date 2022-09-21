package typings.barnard59Core

import typings.readableStream.mod.Readable
import typings.readableStream.mod.Writable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepMod {
  
  @JSImport("barnard59-core/lib/Step", JSImport.Default)
  @js.native
  open class default () extends Step
  
  @js.native
  trait Step
    extends typings.barnard59Core.streamObjectMod.default {
    
    var args: js.Array[Any] | (Record[String, Any]) = js.native
    
    var operation: Any = js.native
    
    @JSName("stream")
    var stream_Step: Readable | Writable = js.native
  }
}
