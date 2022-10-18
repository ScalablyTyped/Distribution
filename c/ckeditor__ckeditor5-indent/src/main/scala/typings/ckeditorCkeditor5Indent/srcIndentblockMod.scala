package typings.ckeditorCkeditor5Indent

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentblockMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentblock", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IndentBlock
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-indent/src/indentblock", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.IndentBlock = js.native
  }
  
  @js.native
  trait IndentBlock
    extends StObject
       with Plugin {
    
    def afterInit(): Unit = js.native
    
    def init(): Unit = js.native
  }
  
  trait IndentBlockConfig extends StObject {
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var unit: js.UndefOr[String] = js.undefined
  }
  object IndentBlockConfig {
    
    inline def apply(): IndentBlockConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndentBlockConfig]
    }
    
    extension [Self <: IndentBlockConfig](x: Self) {
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var IndentBlock: typings.ckeditorCkeditor5Indent.srcIndentblockMod.IndentBlock
    }
    object Plugins {
      
      inline def apply(IndentBlock: IndentBlock): Plugins = {
        val __obj = js.Dynamic.literal(IndentBlock = IndentBlock.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setIndentBlock(value: IndentBlock): Self = StObject.set(x, "IndentBlock", value.asInstanceOf[js.Any])
      }
    }
  }
}
