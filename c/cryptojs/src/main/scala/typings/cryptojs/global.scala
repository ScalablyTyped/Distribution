package typings.cryptojs

import org.scalablytyped.runtime.Shortcut
import typings.cryptojs.CryptoJS.CryptoJSStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CryptoJS extends Shortcut {
    
    @JSGlobal("CryptoJS")
    @js.native
    val ^ : CryptoJSStatic = js.native
    
    type _To = CryptoJSStatic
    
    /* This means you don't have to write `^`, but can instead just say `CryptoJS.foo` */
    override def _to: CryptoJSStatic = ^
  }
}
