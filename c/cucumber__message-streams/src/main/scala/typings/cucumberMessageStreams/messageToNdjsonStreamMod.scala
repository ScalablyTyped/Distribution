package typings.cucumberMessageStreams

import typings.cucumberMessages.mod.Envelope
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageToNdjsonStreamMod {
  
  @JSImport("@cucumber/message-streams/dist/cjs/src/MessageToNdjsonStream", JSImport.Default)
  @js.native
  open class default () extends MessageToNdjsonStream
  
  @js.native
  trait MessageToNdjsonStream extends Transform {
    
    def _transform(envelope: Envelope, encoding: String, callback: TransformCallback): Unit = js.native
  }
}
