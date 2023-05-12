package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.axeCore.anon.Exclude
  - typings.axeCore.anon.Include
*/
trait ContextObject
  extends StObject
     with _ElementContext
object ContextObject {
  
  inline def Exclude(include: Selector | SelectorList): typings.axeCore.anon.Exclude = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.axeCore.anon.Exclude]
  }
  
  inline def Include(exclude: Selector | SelectorList): typings.axeCore.anon.Include = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.axeCore.anon.Include]
  }
}
