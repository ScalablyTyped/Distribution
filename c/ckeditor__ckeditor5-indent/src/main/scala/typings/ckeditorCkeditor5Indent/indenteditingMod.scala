package typings.ckeditorCkeditor5Indent

import typings.ckeditorCkeditor5Indent.indentMod.Indent
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indenteditingMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentediting", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IndentEditing
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-indent/src/indentediting", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.IndentEditing = js.native
  }
  
  @js.native
  trait IndentEditing
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Indent: typings.ckeditorCkeditor5Indent.indentMod.Indent
    }
    object Plugins {
      
      inline def apply(Indent: Indent): Plugins = {
        val __obj = js.Dynamic.literal(Indent = Indent.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setIndent(value: Indent): Self = StObject.set(x, "Indent", value.asInstanceOf[js.Any])
      }
    }
  }
}
