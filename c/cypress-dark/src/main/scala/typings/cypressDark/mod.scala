package typings.cypressDark

import org.scalablytyped.runtime.Shortcut
import typings.cypressDark.cypressDarkStrings.dark
import typings.cypressDark.cypressDarkStrings.halloween
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cypress-dark", JSImport.Namespace)
  @js.native
  val ^ : Any = js.native
  
  type _To = Any
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Any = ^
  
  object global {
    
    object Cypress {
      
      trait ResolvedConfigOptions extends StObject {
        
        var theme: js.UndefOr[dark | halloween | String] = js.undefined
      }
      object ResolvedConfigOptions {
        
        inline def apply(): ResolvedConfigOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ResolvedConfigOptions]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: ResolvedConfigOptions] (val x: Self) extends AnyVal {
          
          inline def setTheme(value: dark | halloween | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
          
          inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
        }
      }
    }
  }
}
