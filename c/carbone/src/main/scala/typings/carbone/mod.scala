package typings.carbone

import org.scalablytyped.runtime.StringDictionary
import typings.carbone.anon.Rates
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("carbone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addFormatters(customFormatters: Formatters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFormatters")(customFormatters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def addTemplate(fileId: String, data: String, callback: VoidCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTemplate")(fileId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addTemplate(fileId: String, data: Buffer, callback: VoidCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTemplate")(fileId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def convert(data: Buffer, convertTo: String, callback: ConvertCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], convertTo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def convert(data: Buffer, convertTo: String, options: js.Object, callback: ConvertCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], convertTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def listConversionFormats(documentType: DocumentType): js.Array[ConversionFormat] = ^.asInstanceOf[js.Dynamic].applyDynamic("listConversionFormats")(documentType.asInstanceOf[js.Any]).asInstanceOf[js.Array[ConversionFormat]]
  
  @scala.inline
  def removeTemplate(fileId: String, callback: VoidCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTemplate")(fileId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def render(templatePath: String, data: js.Object, callback: RenderCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templatePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def render(templatePath: String, data: js.Object, options: RenderOptions, callback: RenderCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templatePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def renderXML(xml: String, data: js.Object, callback: RenderXMLCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderXML")(xml.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def renderXML(xml: String, data: js.Object, options: RenderXMLOptions, callback: RenderXMLCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderXML")(xml.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  @scala.inline
  def set(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ConversionFormat extends StObject {
    
    var desc: String
    
    var `extension`: String
    
    var format: String
    
    var id: String
  }
  object ConversionFormat {
    
    @scala.inline
    def apply(desc: String, `extension`: String, format: String, id: String): ConversionFormat = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversionFormat]
    }
    
    @scala.inline
    implicit class ConversionFormatMutableBuilder[Self <: ConversionFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def document: typings.carbone.carboneStrings.document = "document".asInstanceOf[typings.carbone.carboneStrings.document]
    
    @scala.inline
    def graphics: typings.carbone.carboneStrings.graphics = "graphics".asInstanceOf[typings.carbone.carboneStrings.graphics]
    
    @scala.inline
    def presentation: typings.carbone.carboneStrings.presentation = "presentation".asInstanceOf[typings.carbone.carboneStrings.presentation]
    
    @scala.inline
    def spreadsheet: typings.carbone.carboneStrings.spreadsheet = "spreadsheet".asInstanceOf[typings.carbone.carboneStrings.spreadsheet]
    
    @scala.inline
    def web: typings.carbone.carboneStrings.web = "web".asInstanceOf[typings.carbone.carboneStrings.web]
  }
  
  type Enums = StringDictionary[js.Array[String] | StringDictionary[String]]
  
  @js.native
  trait Formatter extends StObject {
    
    def apply(data: js.Any, params: js.Any*): Unit = js.native
  }
  
  trait FormatterContext extends StObject {
    
    var currency: Rates
    
    var `enum`: Enums
    
    var `extension`: String
    
    var lang: String
    
    var stopPropagation: Boolean
  }
  object FormatterContext {
    
    @scala.inline
    def apply(currency: Rates, `enum`: Enums, `extension`: String, lang: String, stopPropagation: Boolean): FormatterContext = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
      __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatterContext]
    }
    
    @scala.inline
    implicit class FormatterContextMutableBuilder[Self <: FormatterContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: Rates): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnum(value: Enums): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    }
  }
  
  type Formatters = StringDictionary[Formatter]
  
  trait Options extends StObject {
    
    var currencyRates: js.UndefOr[CurrencyRates] = js.undefined
    
    var currencySource: js.UndefOr[String] = js.undefined
    
    var currencyTarget: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var tempPath: js.UndefOr[String] = js.undefined
    
    var templatePath: js.UndefOr[String] = js.undefined
    
    var translations: js.UndefOr[Translations] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrencyRates(value: CurrencyRates): Self = StObject.set(x, "currencyRates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyRatesUndefined: Self = StObject.set(x, "currencyRates", js.undefined)
      
      @scala.inline
      def setCurrencySource(value: String): Self = StObject.set(x, "currencySource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencySourceUndefined: Self = StObject.set(x, "currencySource", js.undefined)
      
      @scala.inline
      def setCurrencyTarget(value: String): Self = StObject.set(x, "currencyTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyTargetUndefined: Self = StObject.set(x, "currencyTarget", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setTempPath(value: String): Self = StObject.set(x, "tempPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempPathUndefined: Self = StObject.set(x, "tempPath", js.undefined)
      
      @scala.inline
      def setTemplatePath(value: String): Self = StObject.set(x, "templatePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatePathUndefined: Self = StObject.set(x, "templatePath", js.undefined)
      
      @scala.inline
      def setTranslations(value: Translations): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
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
    
    var translations: js.UndefOr[Translations] = js.undefined
    
    var variableStr: js.UndefOr[String] = js.undefined
  }
  object RenderOptions {
    
    @scala.inline
    def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplement(value: js.Object): Self = StObject.set(x, "complement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplementUndefined: Self = StObject.set(x, "complement", js.undefined)
      
      @scala.inline
      def setConvertTo(value: String | js.Object): Self = StObject.set(x, "convertTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertToUndefined: Self = StObject.set(x, "convertTo", js.undefined)
      
      @scala.inline
      def setCurrencyRates(value: CurrencyRates): Self = StObject.set(x, "currencyRates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyRatesUndefined: Self = StObject.set(x, "currencyRates", js.undefined)
      
      @scala.inline
      def setCurrencySource(value: String): Self = StObject.set(x, "currencySource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencySourceUndefined: Self = StObject.set(x, "currencySource", js.undefined)
      
      @scala.inline
      def setCurrencyTarget(value: String): Self = StObject.set(x, "currencyTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyTargetUndefined: Self = StObject.set(x, "currencyTarget", js.undefined)
      
      @scala.inline
      def setEnum(value: Enums): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setTranslations(value: Translations): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
      
      @scala.inline
      def setVariableStr(value: String): Self = StObject.set(x, "variableStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableStrUndefined: Self = StObject.set(x, "variableStr", js.undefined)
    }
  }
  
  type RenderXMLCallback = js.Function2[/* err */ ErrnoException | Null, /* xmlResult */ String, Unit]
  
  trait RenderXMLOptions extends StObject {
    
    var complement: js.UndefOr[js.Object] = js.undefined
    
    var existingVariables: js.UndefOr[js.Array[Variable]] = js.undefined
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var formatters: js.UndefOr[Formatters] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var translations: js.UndefOr[Translations] = js.undefined
  }
  object RenderXMLOptions {
    
    @scala.inline
    def apply(): RenderXMLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderXMLOptions]
    }
    
    @scala.inline
    implicit class RenderXMLOptionsMutableBuilder[Self <: RenderXMLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplement(value: js.Object): Self = StObject.set(x, "complement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplementUndefined: Self = StObject.set(x, "complement", js.undefined)
      
      @scala.inline
      def setExistingVariables(value: js.Array[Variable]): Self = StObject.set(x, "existingVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistingVariablesUndefined: Self = StObject.set(x, "existingVariables", js.undefined)
      
      @scala.inline
      def setExistingVariablesVarargs(value: Variable*): Self = StObject.set(x, "existingVariables", js.Array(value :_*))
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      @scala.inline
      def setFormatters(value: Formatters): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setTranslations(value: Translations): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
  
  type Translations = StringDictionary[StringDictionary[String]]
  
  trait Variable extends StObject {
    
    var code: String
    
    var name: String
    
    var regex: RegExp
  }
  object Variable {
    
    @scala.inline
    def apply(code: String, name: String, regex: RegExp): Variable = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variable]
    }
    
    @scala.inline
    implicit class VariableMutableBuilder[Self <: Variable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  type VoidCallback = js.Function1[/* err */ ErrnoException | Null, Unit]
}
