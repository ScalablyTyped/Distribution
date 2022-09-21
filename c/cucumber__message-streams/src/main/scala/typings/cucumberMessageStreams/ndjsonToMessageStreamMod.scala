package typings.cucumberMessageStreams

import typings.cucumberMessages.mod.Envelope
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ndjsonToMessageStreamMod {
  
  @JSImport("@cucumber/message-streams/dist/cjs/src/NdjsonToMessageStream", JSImport.Default)
  @js.native
  /**
    * Create a new stream
    *
    * @param parseLine a function that parses a line. This function may ignore a line by returning null.
    */
  open class default () extends NdjsonToMessageStream {
    def this(parseLine: js.Function1[/* line */ String, Envelope | Null]) = this()
  }
  
  @js.native
  trait NdjsonToMessageStream extends Transform {
    
    def _transform(chunk: String, encoding: String, callback: TransformCallback): Unit = js.native
    
    /* private */ var buffer: Any = js.native
    
    /* private */ val parseLine: Any = js.native
  }
}
