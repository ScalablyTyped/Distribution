package typings.cucumberCucumber

import typings.cucumberCucumber.libApiTypesMod.ILoadSourcesResult
import typings.cucumberCucumber.libApiTypesMod.IRunEnvironment
import typings.cucumberCucumber.libApiTypesMod.ISourcesCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiLoadSourcesMod {
  
  @JSImport("@cucumber/cucumber/lib/api/load_sources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadSources(coordinates: ISourcesCoordinates): js.Promise[ILoadSourcesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSources")(coordinates.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ILoadSourcesResult]]
  inline def loadSources(coordinates: ISourcesCoordinates, environment: IRunEnvironment): js.Promise[ILoadSourcesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSources")(coordinates.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ILoadSourcesResult]]
}
