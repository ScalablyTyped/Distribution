package typings.bullBoard.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.PropsWithChildren<{  title :string}> */
trait PropsWithChildrentitlestr extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var title: String
}
object PropsWithChildrentitlestr {
  
  inline def apply(title: String): PropsWithChildrentitlestr = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithChildrentitlestr]
  }
  
  extension [Self <: PropsWithChildrentitlestr](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
