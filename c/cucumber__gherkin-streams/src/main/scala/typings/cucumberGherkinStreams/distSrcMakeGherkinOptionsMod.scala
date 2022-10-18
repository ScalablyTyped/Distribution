package typings.cucumberGherkinStreams

import typings.cucumberGherkin.distSrcIgherkinoptionsMod.IGherkinOptions
import typings.cucumberGherkinStreams.anon.DefaultDialect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMakeGherkinOptionsMod {
  
  @JSImport("@cucumber/gherkin-streams/dist/src/makeGherkinOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: IGherkinOptions): DefaultDialect = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[DefaultDialect]
}
