package typings.cucumberCucumber

import typings.cucumberCucumber.anon.PartialIConfiguration
import typings.cucumberCucumber.libLoggerMod.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigurationFromFileMod {
  
  @JSImport("@cucumber/cucumber/lib/configuration/from_file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromFile(logger: ILogger, cwd: String, file: String): js.Promise[PartialIConfiguration] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(logger.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PartialIConfiguration]]
  inline def fromFile(logger: ILogger, cwd: String, file: String, profiles: js.Array[String]): js.Promise[PartialIConfiguration] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(logger.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], file.asInstanceOf[js.Any], profiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PartialIConfiguration]]
}
