package typings.carbone

import org.scalablytyped.runtime.StringDictionary
import typings.carbone.anon.Rates
import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("carbone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addFormatters(customFormatters: Formatters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFormatters")(customFormatters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addTemplate(fileId: String, data: String, callback: VoidCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTemplate")(fileId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTemplate(fileId: String, data: Buffer, callback: VoidCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTemplate")(fileId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convert(data: Buffer, convertTo: String, callback: ConvertCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], convertTo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convert(data: Buffer, convertTo: String, options: js.Object, callback: ConvertCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], convertTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def listConversionFormats(documentType: DocumentType): js.Array[ConversionFormat] = ^.asInstanceOf[js.Dynamic].applyDynamic("listConversionFormats")(documentType.asInstanceOf[js.Any]).asInstanceOf[js.Array[ConversionFormat]]
  
  inline def removeTemplate(fileId: String, callback: VoidCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTemplate")(fileId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def render(templatePath: String, data: js.Object, callback: RenderCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templatePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def render(templatePath: String, data: js.Object, options: RenderOptions, callback: RenderCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templatePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderXML(xml: String, data: js.Object, callback: RenderXMLCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderXML")(xml.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderXML(xml: String, data: js.Object, options: RenderXMLOptions, callback: RenderXMLCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderXML")(xml.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def set(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ConversionFormat extends StObject {
    
    var desc: String
    
    var `extension`: String
    
    var format: String
    
    var id: String
  }
  object ConversionFormat {
    
    inline def apply(desc: String, `extension`: String, format: String, id: String): ConversionFormat = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversionFormat]
    }
    
    extension [Self <: ConversionFormat](x: Self) {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type ConvertCallback = js.Function2[/* err */ ErrnoException | Null, /* result */ Buffer, Unit]
  
  type CurrencyRates = StringDictionary[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbone.carboneStrings.document
    - typings.carbone.carboneStrings.web
    - typings.carbone.carboneStrings.graphics
    - typings.carbone.carboneStrings.spreadsheet
    - typings.carbone.carboneStrings.presentation
  */
  trait DocumentType extends StObject
  object DocumentType {
    
    inline def document: typings.carbone.carboneStrings.document = "document".asInstanceOf[typings.carbone.carboneStrings.document]
    
    inline def graphics: typings.carbone.carboneStrings.graphics = "graphics".asInstanceOf[typings.carbone.carboneStrings.graphics]
    
    inline def presentation: typings.carbone.carboneStrings.presentation = "presentation".asInstanceOf[typings.carbone.carboneStrings.presentation]
    
    inline def spreadsheet: typings.carbone.carboneStrings.spreadsheet = "spreadsheet".asInstanceOf[typings.carbone.carboneStrings.spreadsheet]
    
    inline def web: typings.carbone.carboneStrings.web = "web".asInstanceOf[typings.carbone.carboneStrings.web]
  }
  
  type Enums = StringDictionary[js.Array[String] | StringDictionary[String]]
  
  @js.native
  trait Formatter extends StObject {
    
    def apply(data: Any, params: Any*): Unit = js.native
  }
  
  trait FormatterContext extends StObject {
    
    var currency: Rates
    
    var `enum`: Enums
    
    var `extension`: String
    
    var lang: String
    
    var stopPropagation: Boolean
  }
  object FormatterContext {
    
    inline def apply(currency: Rates, `enum`: Enums, `extension`: String, lang: String, stopPropagation: Boolean): FormatterContext = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
      __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatterContext]
    }
    
    extension [Self <: FormatterContext](x: Self) {
      
      inline def setCurrency(value: Rates): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setEnum(value: Enums): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    }
  }
  
  type Formatters = StringDictionary[Formatter]
  
  trait Options extends StObject {
    
    var attempts: js.UndefOr[Double] = js.undefined
    
    var currencyRates: js.UndefOr[CurrencyRates] = js.undefined
    
    var currencySource: js.UndefOr[String] = js.undefined
    
    var currencyTarget: js.UndefOr[String] = js.undefined
    
    var factories: js.UndefOr[Double] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var startFactory: js.UndefOr[Boolean] = js.undefined
    
    var tempPath: js.UndefOr[String] = js.undefined
    
    var templatePath: js.UndefOr[String] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
    
    var translations: js.UndefOr[Translations] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
      
      inline def setCurrencyRates(value: CurrencyRates): Self = StObject.set(x, "currencyRates", value.asInstanceOf[js.Any])
      
      inline def setCurrencyRatesUndefined: Self = StObject.set(x, "currencyRates", js.undefined)
      
      inline def setCurrencySource(value: String): Self = StObject.set(x, "currencySource", value.asInstanceOf[js.Any])
      
      inline def setCurrencySourceUndefined: Self = StObject.set(x, "currencySource", js.undefined)
      
      inline def setCurrencyTarget(value: String): Self = StObject.set(x, "currencyTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrencyTargetUndefined: Self = StObject.set(x, "currencyTarget", js.undefined)
      
      inline def setFactories(value: Double): Self = StObject.set(x, "factories", value.asInstanceOf[js.Any])
      
      inline def setFactoriesUndefined: Self = StObject.set(x, "factories", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setStartFactory(value: Boolean): Self = StObject.set(x, "startFactory", value.asInstanceOf[js.Any])
      
      inline def setStartFactoryUndefined: Self = StObject.set(x, "startFactory", js.undefined)
      
      inline def setTempPath(value: String): Self = StObject.set(x, "tempPath", value.asInstanceOf[js.Any])
      
      inline def setTempPathUndefined: Self = StObject.set(x, "tempPath", js.undefined)
      
      inline def setTemplatePath(value: String): Self = StObject.set(x, "templatePath", value.asInstanceOf[js.Any])
      
      inline def setTemplatePathUndefined: Self = StObject.set(x, "templatePath", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      inline def setTranslations(value: Translations): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
  
  type RenderCallback = js.Function3[
    /* err */ ErrnoException | Null, 
    /* result */ Buffer | String, 
    /* reportName */ String, 
    Unit
  ]
  
  trait RenderOptions extends StObject {
    
    var complement: js.UndefOr[js.Object] = js.undefined
    
    var convertTo: js.UndefOr[String | js.Object] = js.undefined
    
    var currencyRates: js.UndefOr[CurrencyRates] = js.undefined
    
    var currencySource: js.UndefOr[String] = js.undefined
    
    var currencyTarget: js.UndefOr[String] = js.undefined
    
    var `enum`: js.UndefOr[Enums] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
    
    var translations: js.UndefOr[Translations] = js.undefined
    
    var variableStr: js.UndefOr[String] = js.undefined
  }
  object RenderOptions {
    
    inline def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    extension [Self <: RenderOptions](x: Self) {
      
      inline def setComplement(value: js.Object): Self = StObject.set(x, "complement", value.asInstanceOf[js.Any])
      
      inline def setComplementUndefined: Self = StObject.set(x, "complement", js.undefined)
      
      inline def setConvertTo(value: String | js.Object): Self = StObject.set(x, "convertTo", value.asInstanceOf[js.Any])
      
      inline def setConvertToUndefined: Self = StObject.set(x, "convertTo", js.undefined)
      
      inline def setCurrencyRates(value: CurrencyRates): Self = StObject.set(x, "currencyRates", value.asInstanceOf[js.Any])
      
      inline def setCurrencyRatesUndefined: Self = StObject.set(x, "currencyRates", js.undefined)
      
      inline def setCurrencySource(value: String): Self = StObject.set(x, "currencySource", value.asInstanceOf[js.Any])
      
      inline def setCurrencySourceUndefined: Self = StObject.set(x, "currencySource", js.undefined)
      
      inline def setCurrencyTarget(value: String): Self = StObject.set(x, "currencyTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrencyTargetUndefined: Self = StObject.set(x, "currencyTarget", js.undefined)
      
      inline def setEnum(value: Enums): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      inline def setTranslations(value: Translations): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
      
      inline def setVariableStr(value: String): Self = StObject.set(x, "variableStr", value.asInstanceOf[js.Any])
      
      inline def setVariableStrUndefined: Self = StObject.set(x, "variableStr", js.undefined)
    }
  }
  
  type RenderXMLCallback = js.Function2[/* err */ ErrnoException | Null, /* xmlResult */ String, Unit]
  
  trait RenderXMLOptions extends StObject {
    
    var complement: js.UndefOr[js.Object] = js.undefined
    
    var existingVariables: js.UndefOr[js.Array[Variable]] = js.undefined
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var formatters: js.UndefOr[Formatters] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
    
    var translations: js.UndefOr[Translations] = js.undefined
  }
  object RenderXMLOptions {
    
    inline def apply(): RenderXMLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderXMLOptions]
    }
    
    extension [Self <: RenderXMLOptions](x: Self) {
      
      inline def setComplement(value: js.Object): Self = StObject.set(x, "complement", value.asInstanceOf[js.Any])
      
      inline def setComplementUndefined: Self = StObject.set(x, "complement", js.undefined)
      
      inline def setExistingVariables(value: js.Array[Variable]): Self = StObject.set(x, "existingVariables", value.asInstanceOf[js.Any])
      
      inline def setExistingVariablesUndefined: Self = StObject.set(x, "existingVariables", js.undefined)
      
      inline def setExistingVariablesVarargs(value: Variable*): Self = StObject.set(x, "existingVariables", js.Array(value*))
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setFormatters(value: Formatters): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      inline def setTranslations(value: Translations): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
  
  type Translations = StringDictionary[StringDictionary[String]]
  
  trait Variable extends StObject {
    
    var code: String
    
    var name: String
    
    var regex: js.RegExp
  }
  object Variable {
    
    inline def apply(code: String, name: String, regex: js.RegExp): Variable = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variable]
    }
    
    extension [Self <: Variable](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  type VoidCallback = js.Function1[/* err */ ErrnoException | Null, Unit]
}
