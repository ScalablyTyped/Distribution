package typings.ckeditorCkeditor5Heading

import typings.ckeditorCkeditor5Heading.headingMod.Heading
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headinguiMod {
  
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
  
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Heading: typings.ckeditorCkeditor5Heading.headingMod.Heading
    }
    object Plugins {
      
      inline def apply(Heading: Heading): Plugins = {
        val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setHeading(value: Heading): Self = StObject.set(x, "Heading", value.asInstanceOf[js.Any])
      }
    }
  }
}
