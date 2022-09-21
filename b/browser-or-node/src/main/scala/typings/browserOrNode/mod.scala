package typings.browserOrNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browser-or-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("browser-or-node", "isBrowser")
  @js.native
  val isBrowser: Boolean = js.native
  
  inline def isJsDom(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsDom")().asInstanceOf[Boolean]
  
  @JSImport("browser-or-node", "isNode")
  @js.native
  val isNode: Boolean = js.native
  
  @JSImport("browser-or-node", "isWebWorker")
  @js.native
  val isWebWorker: Boolean = js.native
}
