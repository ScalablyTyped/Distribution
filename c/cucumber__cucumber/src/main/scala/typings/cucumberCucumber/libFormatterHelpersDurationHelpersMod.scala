package typings.cucumberCucumber

import typings.cucumberMessages.mod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersDurationHelpersMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/duration_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def durationToNanoseconds(duration: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToNanoseconds")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
}
