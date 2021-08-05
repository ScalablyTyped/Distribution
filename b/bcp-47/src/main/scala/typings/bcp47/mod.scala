package typings.bcp47

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bcp-47", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ErrorCodes extends StObject
  @JSImport("bcp-47", "ErrorCodes")
  @js.native
  object ErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCodes & Double] = js.native
    
    @js.native
    sealed trait errEmptyExtension
      extends StObject
         with ErrorCodes
    /* 4 */ val errEmptyExtension: typings.bcp47.mod.ErrorCodes.errEmptyExtension & Double = js.native
    
    @js.native
    sealed trait errExtensionTooLong
      extends StObject
         with ErrorCodes
    /* 2 */ val errExtensionTooLong: typings.bcp47.mod.ErrorCodes.errExtensionTooLong & Double = js.native
    
    @js.native
    sealed trait errExtraContent
      extends StObject
         with ErrorCodes
    /* 6 */ val errExtraContent: typings.bcp47.mod.ErrorCodes.errExtraContent & Double = js.native
    
    @js.native
    sealed trait errPrivateUseTooLong
      extends StObject
         with ErrorCodes
    /* 5 */ val errPrivateUseTooLong: typings.bcp47.mod.ErrorCodes.errPrivateUseTooLong & Double = js.native
    
    @js.native
    sealed trait errTooManySubtags
      extends StObject
         with ErrorCodes
    /* 3 */ val errTooManySubtags: typings.bcp47.mod.ErrorCodes.errTooManySubtags & Double = js.native
    
    @js.native
    sealed trait errVariantTooLong
      extends StObject
         with ErrorCodes
    /* 1 */ val errVariantTooLong: typings.bcp47.mod.ErrorCodes.errVariantTooLong & Double = js.native
  }
  
  inline def parse(tag: String): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tag.asInstanceOf[js.Any]).asInstanceOf[Schema]
  inline def parse(tag: String, options: ParseOptions): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tag.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Schema]
  
  inline def stringify(schema: Schema): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(schema.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait LocaleExtension extends StObject {
    
    var extensions: js.Array[String]
    
    var singleton: String
  }
  object LocaleExtension {
    
    inline def apply(extensions: js.Array[String], singleton: String): LocaleExtension = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], singleton = singleton.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleExtension]
    }
    
    extension [Self <: LocaleExtension](x: Self) {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setSingleton(value: String): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseOptions extends StObject {
    
    var forgiving: js.UndefOr[Boolean] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var warning: js.UndefOr[
        js.Function3[/* errorMessage */ String, /* errorCode */ ErrorCodes, /* offset */ Double, Unit]
      ] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setForgiving(value: Boolean): Self = StObject.set(x, "forgiving", value.asInstanceOf[js.Any])
      
      inline def setForgivingUndefined: Self = StObject.set(x, "forgiving", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setWarning(value: (/* errorMessage */ String, /* errorCode */ ErrorCodes, /* offset */ Double) => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction3(value))
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait Schema extends StObject {
    
    var extendedLanguageSubtags: js.UndefOr[js.Array[String]] = js.undefined
    
    var extensions: js.UndefOr[js.Array[LocaleExtension]] = js.undefined
    
    var irregular: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var privateuse: js.UndefOr[js.Array[String]] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var regular: js.UndefOr[String] = js.undefined
    
    var script: js.UndefOr[String] = js.undefined
    
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
      
      inline def setExtendedLanguageSubtagsVarargs(value: String*): Self = StObject.set(x, "extendedLanguageSubtags", js.Array(value :_*))
      
      inline def setExtensions(value: js.Array[LocaleExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: LocaleExtension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setIrregular(value: String): Self = StObject.set(x, "irregular", value.asInstanceOf[js.Any])
      
      inline def setIrregularUndefined: Self = StObject.set(x, "irregular", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setPrivateuse(value: js.Array[String]): Self = StObject.set(x, "privateuse", value.asInstanceOf[js.Any])
      
      inline def setPrivateuseUndefined: Self = StObject.set(x, "privateuse", js.undefined)
      
      inline def setPrivateuseVarargs(value: String*): Self = StObject.set(x, "privateuse", js.Array(value :_*))
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRegular(value: String): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      inline def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setVariants(value: js.Array[String]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setVariantsVarargs(value: String*): Self = StObject.set(x, "variants", js.Array(value :_*))
    }
  }
}
