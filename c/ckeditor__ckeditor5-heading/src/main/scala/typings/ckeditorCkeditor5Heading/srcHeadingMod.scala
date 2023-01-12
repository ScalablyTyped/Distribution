package typings.ckeditorCkeditor5Heading

import typings.ckeditorCkeditor5Engine.srcViewElementdefinitionMod.ElementDefinition
import typings.ckeditorCkeditor5Heading.anon.TypeofHeadingEditing
import typings.ckeditorCkeditor5Heading.anon.TypeofHeadingUI
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHeadingMod {
  
  @JSImport("@ckeditor/ckeditor5-heading/src/heading", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Plugin
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-heading/src/heading", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.Heading = js.native
    
    @JSImport("@ckeditor/ckeditor5-heading/src/heading", "default.requires")
    @js.native
    val requires: js.Tuple2[TypeofHeadingEditing, TypeofHeadingUI] = js.native
  }
  
  type Heading = Plugin
  
  trait HeadingConfig extends StObject {
    
    var options: js.Array[HeadingOption]
  }
  object HeadingConfig {
    
    inline def apply(options: js.Array[HeadingOption]): HeadingConfig = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadingConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadingConfig] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: js.Array[HeadingOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: HeadingOption*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  trait HeadingOption extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var model: String
    
    var title: String
    
    var view: js.UndefOr[ElementDefinition] = js.undefined
  }
  object HeadingOption {
    
    inline def apply(model: String, title: String): HeadingOption = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadingOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadingOption] (val x: Self) extends AnyVal {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setView(value: ElementDefinition): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Heading: typings.ckeditorCkeditor5Heading.srcHeadingMod.Heading
    }
    object Plugins {
      
      inline def apply(Heading: Heading): Plugins = {
        val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
        
        inline def setHeading(value: Heading): Self = StObject.set(x, "Heading", value.asInstanceOf[js.Any])
      }
    }
  }
}
