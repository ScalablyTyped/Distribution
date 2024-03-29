package typings.cathoQuantum

import typings.cathoQuantum.anon.Gutter
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.secondary
import typings.cathoQuantum.cathoQuantumStrings.xlarge
import typings.cathoQuantum.cathoQuantumStrings.xxlarge
import typings.cathoQuantum.cathoQuantumStrings.xxxlarge
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularLoaderMod {
  
  @JSImport("@catho/quantum/CircularLoader", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CircularLoaderProps, js.Object, Any]
  
  type CircularLoader = Component[CircularLoaderProps, js.Object, Any]
  
  trait CircularLoaderProps extends StObject {
    
    var size: js.UndefOr[medium | large | xlarge | xxlarge | xxxlarge] = js.undefined
    
    var skin: js.UndefOr[primary | secondary] = js.undefined
    
    var theme: js.UndefOr[Gutter] = js.undefined
  }
  object CircularLoaderProps {
    
    inline def apply(): CircularLoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircularLoaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircularLoaderProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: medium | large | xlarge | xxlarge | xxxlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: primary | secondary): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: Gutter): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
