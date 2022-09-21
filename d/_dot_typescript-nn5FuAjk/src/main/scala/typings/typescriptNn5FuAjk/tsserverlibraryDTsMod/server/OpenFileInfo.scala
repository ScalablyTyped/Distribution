package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenFileInfo extends StObject {
  
  val checkJs: Boolean
}
object OpenFileInfo {
  
  inline def apply(checkJs: Boolean): OpenFileInfo = {
    val __obj = js.Dynamic.literal(checkJs = checkJs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFileInfo]
  }
  
  extension [Self <: OpenFileInfo](x: Self) {
    
    inline def setCheckJs(value: Boolean): Self = StObject.set(x, "checkJs", value.asInstanceOf[js.Any])
  }
}
