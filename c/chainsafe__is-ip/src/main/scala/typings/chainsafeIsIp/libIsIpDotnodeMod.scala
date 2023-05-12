package typings.chainsafeIsIp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsIpDotnodeMod {
  
  @JSImport("@chainsafe/is-ip/lib/is-ip.node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isIP(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
