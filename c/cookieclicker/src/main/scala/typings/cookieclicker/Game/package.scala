package typings.cookieclicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Game {
  
  type Icon = js.Tuple3[scala.Double, scala.Double, js.UndefOr[java.lang.String]]
  
  type PseudoNull = typings.cookieclicker.cookieclickerNumbers.`0`
  
  /* Rewritten from type alias, can be one of: 
    - typings.cookieclicker.cookieclickerStrings.store
    - typings.cookieclicker.cookieclickerStrings.left
    - typings.cookieclicker.cookieclickerStrings.`bottom-right`
    - typings.cookieclicker.cookieclickerStrings.bottom
    - typings.cookieclicker.cookieclickerStrings.`this`
    - js.UndefOr[scala.Nothing]
  */
  type TooltipOrigins = js.UndefOr[typings.cookieclicker.Game._TooltipOrigins]
}
