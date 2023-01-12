package typings.ckeditorCkeditor5Heading

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHeadinguiMod {
  
  @JSImport("@ckeditor/ckeditor5-heading/src/headingui", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HeadingUI
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-heading/src/headingui", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.HeadingUI = js.native
  }
  
  @js.native
  trait HeadingUI
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var HeadingUI: typings.ckeditorCkeditor5Heading.srcHeadinguiMod.HeadingUI
    }
    object Plugins {
      
      inline def apply(HeadingUI: HeadingUI): Plugins = {
        val __obj = js.Dynamic.literal(HeadingUI = HeadingUI.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
        
        inline def setHeadingUI(value: HeadingUI): Self = StObject.set(x, "HeadingUI", value.asInstanceOf[js.Any])
      }
    }
  }
}
