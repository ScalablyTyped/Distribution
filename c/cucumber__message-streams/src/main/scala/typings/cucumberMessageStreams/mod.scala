package typings.cucumberMessageStreams

import typings.cucumberMessageStreams.distCjsSrcMessageToNdjsonStreamMod.default
import typings.cucumberMessages.mod.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cucumber/message-streams", "MessageToNdjsonStream")
  @js.native
  open class MessageToNdjsonStream () extends default
  
  @JSImport("@cucumber/message-streams", "NdjsonToMessageStream")
  @js.native
  /**
    * Create a new stream
    *
    * @param parseLine a function that parses a line. This function may ignore a line by returning null.
    */
  open class NdjsonToMessageStream ()
    extends typings.cucumberMessageStreams.distCjsSrcNdjsonToMessageStreamMod.default {
    def this(parseLine: js.Function1[/* line */ String, Envelope | Null]) = this()
  }
}
