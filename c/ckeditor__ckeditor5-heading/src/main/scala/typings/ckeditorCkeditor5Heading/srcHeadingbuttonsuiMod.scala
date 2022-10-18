package typings.ckeditorCkeditor5Heading

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHeadingbuttonsuiMod {
  
  @JSImport("@ckeditor/ckeditor5-heading/src/headingbuttonsui", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HeadingButtonsUI
  
  @js.native
  trait HeadingButtonsUI
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var HeadingButtonsUI: typings.ckeditorCkeditor5Heading.srcHeadingbuttonsuiMod.HeadingButtonsUI
    }
    object Plugins {
      
      inline def apply(HeadingButtonsUI: HeadingButtonsUI): Plugins = {
        val __obj = js.Dynamic.literal(HeadingButtonsUI = HeadingButtonsUI.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setHeadingButtonsUI(value: HeadingButtonsUI): Self = StObject.set(x, "HeadingButtonsUI", value.asInstanceOf[js.Any])
      }
    }
  }
}
