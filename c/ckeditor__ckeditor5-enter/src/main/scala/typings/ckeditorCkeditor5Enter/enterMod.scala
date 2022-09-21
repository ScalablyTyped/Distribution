package typings.ckeditorCkeditor5Enter

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enterMod {
  
  @JSImport("@ckeditor/ckeditor5-enter/src/enter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Enter
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-enter/src/enter", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Enter.ckeditorCkeditor5EnterStrings.Enter = js.native
  }
  
  @js.native
  trait Enter
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Enter: typings.ckeditorCkeditor5Enter.enterMod.Enter
    }
    object Plugins {
      
      inline def apply(Enter: Enter): Plugins = {
        val __obj = js.Dynamic.literal(Enter = Enter.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setEnter(value: Enter): Self = StObject.set(x, "Enter", value.asInstanceOf[js.Any])
      }
    }
  }
}
