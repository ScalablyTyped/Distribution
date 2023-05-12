package typings.cucumberCucumber

import typings.cucumberCucumber.anon.FeaturePaths
import typings.cucumberCucumber.anon.PickISourcesCoordinatespa
import typings.cucumberCucumber.libApiTypesMod.ISupportCodeCoordinates
import typings.cucumberCucumber.libLoggerMod.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiPathsMod {
  
  @JSImport("@cucumber/cucumber/lib/api/paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolvePaths(logger: ILogger, cwd: String, sources: PickISourcesCoordinatespa): js.Promise[FeaturePaths] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePaths")(logger.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FeaturePaths]]
  inline def resolvePaths(logger: ILogger, cwd: String, sources: PickISourcesCoordinatespa, support: ISupportCodeCoordinates): js.Promise[FeaturePaths] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePaths")(logger.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], support.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FeaturePaths]]
}
