package typings.bcp47

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyMod {
  
  @JSImport("bcp-47/lib/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[String]
  inline def stringify(schema: Schema): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(schema.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Inlined std.Partial<bcp-47.bcp-47/lib/parse.Extension> */
  trait Extension extends StObject {
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var singleton: js.UndefOr[String] = js.undefined
  }
  object Extension {
    
    inline def apply(): Extension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extension]
    }
    
    extension [Self <: Extension](x: Self) {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setSingleton(value: String): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
      
      inline def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bcp-47.bcp-47/lib/parse.Schema> */
  trait Schema extends StObject {
    
    var extendedLanguageSubtags: js.UndefOr[js.Array[String]] = js.undefined
    
    var extensions: js.UndefOr[js.Array[typings.bcp47.parseMod.Extension]] = js.undefined
    
    var irregular: js.UndefOr[String | Null] = js.undefined
    
    var language: js.UndefOr[String | Null] = js.undefined
    
    var privateuse: js.UndefOr[js.Array[String]] = js.undefined
    
    var region: js.UndefOr[String | Null] = js.undefined
    
    var regular: js.UndefOr[String | Null] = js.undefined
    
    var script: js.UndefOr[String | Null] = js.undefined
    
    var variants: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Schema {
    
    inline def apply(): Schema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setExtendedLanguageSubtags(value: js.Array[String]): Self = StObject.set(x, "extendedLanguageSubtags", value.asInstanceOf[js.Any])
      
      inline def setExtendedLanguageSubtagsUndefined: Self = StObject.set(x, "extendedLanguageSubtags", js.undefined)
      
      inline def setExtendedLanguageSubtagsVarargs(value: String*): Self = StObject.set(x, "extendedLanguageSubtags", js.Array(value*))
      
      inline def setExtensions(value: js.Array[typings.bcp47.parseMod.Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: typings.bcp47.parseMod.Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setIrregular(value: String): Self = StObject.set(x, "irregular", value.asInstanceOf[js.Any])
      
      inline def setIrregularNull: Self = StObject.set(x, "irregular", null)
      
      inline def setIrregularUndefined: Self = StObject.set(x, "irregular", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageNull: Self = StObject.set(x, "language", null)
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setPrivateuse(value: js.Array[String]): Self = StObject.set(x, "privateuse", value.asInstanceOf[js.Any])
      
      inline def setPrivateuseUndefined: Self = StObject.set(x, "privateuse", js.undefined)
      
      inline def setPrivateuseVarargs(value: String*): Self = StObject.set(x, "privateuse", js.Array(value*))
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionNull: Self = StObject.set(x, "region", null)
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRegular(value: String): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      inline def setRegularNull: Self = StObject.set(x, "regular", null)
      
      inline def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptNull: Self = StObject.set(x, "script", null)
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setVariants(value: js.Array[String]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setVariantsVarargs(value: String*): Self = StObject.set(x, "variants", js.Array(value*))
    }
  }
}
