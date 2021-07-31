package typings.blueprintjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compatibilityMod {
  
  object Browser {
    
    @JSImport("@blueprintjs/core/lib/esm/compatibility", "Browser")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isEdge(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdge")().asInstanceOf[Boolean]
    
    @scala.inline
    def isInternetExplorer(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInternetExplorer")().asInstanceOf[Boolean]
    
    @scala.inline
    def isWebkit(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebkit")().asInstanceOf[Boolean]
  }
}
