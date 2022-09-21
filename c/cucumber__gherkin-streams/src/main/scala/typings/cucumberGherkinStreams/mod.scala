package typings.cucumberGherkinStreams

import typings.cucumberGherkin.igherkinoptionsMod.IGherkinOptions
import typings.cucumberGherkinStreams.gherkinStreamsMod.IGherkinStreamOptions
import typings.cucumberMessages.mod.Envelope
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object GherkinStreams {
    
    @JSImport("@cucumber/gherkin-streams", "GherkinStreams")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@cucumber/gherkin-streams", "GherkinStreams.fromPaths")
    @js.native
    def fromPaths: js.Function2[/* paths */ js.Array[String], /* options */ IGherkinStreamOptions, Readable] = js.native
    inline def fromPaths(paths: js.Array[String], options: IGherkinStreamOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPaths")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
    inline def fromPaths_=(x: js.Function2[/* paths */ js.Array[String], /* options */ IGherkinStreamOptions, Readable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromPaths")(x.asInstanceOf[js.Any])
    
    @JSImport("@cucumber/gherkin-streams", "GherkinStreams.fromSources")
    @js.native
    def fromSources: js.Function2[/* envelopes */ js.Array[Envelope], /* options */ IGherkinOptions, Readable] = js.native
    inline def fromSources(envelopes: js.Array[Envelope], options: IGherkinOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSources")(envelopes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
    inline def fromSources_=(x: js.Function2[/* envelopes */ js.Array[Envelope], /* options */ IGherkinOptions, Readable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromSources")(x.asInstanceOf[js.Any])
  }
}
