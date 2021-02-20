package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnloadT extends StObject {
  
  var onloadT: integer = js.native
  
  var pageT: integer = js.native
  
  var startE: integer = js.native
  
  var tran: integer = js.native
}
object OnloadT {
  
  @scala.inline
  def apply(onloadT: integer, pageT: integer, startE: integer, tran: integer): OnloadT = {
    val __obj = js.Dynamic.literal(onloadT = onloadT.asInstanceOf[js.Any], pageT = pageT.asInstanceOf[js.Any], startE = startE.asInstanceOf[js.Any], tran = tran.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnloadT]
  }
  
  @scala.inline
  implicit class OnloadTMutableBuilder[Self <: OnloadT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnloadT(value: integer): Self = StObject.set(x, "onloadT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageT(value: integer): Self = StObject.set(x, "pageT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartE(value: integer): Self = StObject.set(x, "startE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTran(value: integer): Self = StObject.set(x, "tran", value.asInstanceOf[js.Any])
  }
}
