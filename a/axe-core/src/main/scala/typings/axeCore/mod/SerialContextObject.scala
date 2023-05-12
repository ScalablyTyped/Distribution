package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.axeCore.anon.ExcludeInclude
  - typings.axeCore.anon.`0`
*/
trait SerialContextObject extends StObject
object SerialContextObject {
  
  inline def `0`(exclude: SerialSelector | SerialSelectorList): typings.axeCore.anon.`0` = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.axeCore.anon.`0`]
  }
  
  inline def ExcludeInclude(include: SerialSelector | SerialSelectorList): typings.axeCore.anon.ExcludeInclude = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.axeCore.anon.ExcludeInclude]
  }
}
