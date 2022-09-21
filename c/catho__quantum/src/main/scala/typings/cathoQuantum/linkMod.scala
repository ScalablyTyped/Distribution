package typings.cathoQuantum

import typings.cathoQuantum.anon.`12`
import typings.cathoQuantum.cathoQuantumStrings.dark
import typings.cathoQuantum.cathoQuantumStrings.default
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  trait Link
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    @JSName("children")
    var children_Link: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
    
    var skin: js.UndefOr[default | dark] = js.undefined
    
    var theme: js.UndefOr[`12`] = js.undefined
  }
  object Link {
    
    inline def apply(): Link = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setSkin(value: default | dark): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: `12`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
