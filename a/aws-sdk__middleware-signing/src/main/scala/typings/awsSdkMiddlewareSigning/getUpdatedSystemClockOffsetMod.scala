package typings.awsSdkMiddlewareSigning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getUpdatedSystemClockOffsetMod {
  
  @JSImport("@aws-sdk/middleware-signing/dist-types/utils/getUpdatedSystemClockOffset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUpdatedSystemClockOffset(clockTime: String, currentSystemClockOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatedSystemClockOffset")(clockTime.asInstanceOf[js.Any], currentSystemClockOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
}
