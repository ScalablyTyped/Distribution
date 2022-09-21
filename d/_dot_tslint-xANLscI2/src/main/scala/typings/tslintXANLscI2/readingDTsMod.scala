package typings.tslintXANLscI2

import typings.tslintXANLscI2.runnerDTsMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readingDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/files/reading.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tryReadFile(filename: String, logger: Logger): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryReadFile")(filename.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
}
