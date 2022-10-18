package typings.ckeditorCkeditor5Heading

import typings.ckeditorCkeditor5Heading.anon.RootName
import typings.ckeditorCkeditor5Heading.anon.TypeofParagraph
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTitleMod {
  
  @JSImport("@ckeditor/ckeditor5-heading/src/title", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Title
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-heading/src/title", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.Title = js.native
    
    @JSImport("@ckeditor/ckeditor5-heading/src/title", "default.requires")
    @js.native
    val requires: js.Array[TypeofParagraph] = js.native
  }
  
  @js.native
  trait Title
    extends StObject
       with Plugin {
    
    def getBody(): String = js.native
    def getBody(options: RootName): String = js.native
    
    def getTitle(): String = js.native
    
    def init(): Unit = js.native
  }
  
  trait TitleConfig extends StObject {
    
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object TitleConfig {
    
    inline def apply(): TitleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleConfig]
    }
    
    extension [Self <: TitleConfig](x: Self) {
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Title: typings.ckeditorCkeditor5Heading.srcTitleMod.Title
    }
    object Plugins {
      
      inline def apply(Title: Title): Plugins = {
        val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setTitle(value: Title): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      }
    }
  }
}
