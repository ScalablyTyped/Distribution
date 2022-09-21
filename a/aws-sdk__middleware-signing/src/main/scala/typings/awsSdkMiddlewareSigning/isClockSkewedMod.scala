package typings.awsSdkMiddlewareSigning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isClockSkewedMod {
  
  @JSImport("@aws-sdk/middleware-signing/dist-types/utils/isClockSkewed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isClockSkewed(clockTime: Double, systemClockOffset: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClockSkewed")(clockTime.asInstanceOf[js.Any], systemClockOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
