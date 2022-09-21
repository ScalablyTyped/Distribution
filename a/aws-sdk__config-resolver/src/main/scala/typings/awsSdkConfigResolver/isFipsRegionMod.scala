package typings.awsSdkConfigResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isFipsRegionMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionConfig/isFipsRegion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFipsRegion(region: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFipsRegion")(region.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
