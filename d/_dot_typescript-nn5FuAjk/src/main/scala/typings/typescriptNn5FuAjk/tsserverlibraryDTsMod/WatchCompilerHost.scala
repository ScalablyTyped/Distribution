package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchCompilerHost[T /* <: BuilderProgram */]
  extends StObject
     with ProgramHost[T]
     with WatchHost {
  
  /** If provided, callback to invoke after every new program creation */
  var afterProgramCreate: js.UndefOr[js.Function1[/* program */ T, Unit]] = js.native
  
  /** If provided, use this method to get parsed command lines for referenced projects */
  var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ java.lang.String, js.UndefOr[ParsedCommandLine]]] = js.native
  
  /** Instead of using output d.ts file from project reference, use its source file */
  var useSourceOfProjectReferenceRedirect: js.UndefOr[js.Function0[Boolean]] = js.native
}
