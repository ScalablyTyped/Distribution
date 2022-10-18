package typings.cucumberGherkinStreams

import typings.cucumberGherkin.distSrcIgherkinoptionsMod.IGherkinOptions
import typings.cucumberMessages.mod.Envelope
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcParserMessageStreamMod {
  
  @JSImport("@cucumber/gherkin-streams/dist/src/ParserMessageStream", JSImport.Default)
  @js.native
  open class default protected () extends ParserMessageStream {
    def this(options: IGherkinOptions) = this()
  }
  
  @js.native
  trait ParserMessageStream extends Transform {
    
    def _transform(envelope: Envelope, encoding: String, callback: TransformCallback): Unit = js.native
    
    /* private */ val options: Any = js.native
  }
}
