package typings.carbone

import org.scalablytyped.runtime.StringDictionary
import typings.carbone.anon.Rates
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("carbone", "addFormatters")
  @js.native
  def addFormatters(customFormatters: Formatters): Unit = js.native
  
  @JSImport("carbone", "addTemplate")
  @js.native
  def addTemplate(fileId: String, data: String, callback: VoidCallback): Unit = js.native
  @JSImport("carbone", "addTemplate")
  @js.native
  def addTemplate(fileId: String, data: Buffer, callback: VoidCallback): Unit = js.native
  
  @JSImport("carbone", "convert")
  @js.native
  def convert(data: Buffer, convertTo: String, callback: ConvertCallback): Unit = js.native
  @JSImport("carbone", "convert")
  @js.native
  def convert(data: Buffer, convertTo: String, options: js.Object, callback: ConvertCallback): Unit = js.native
  
  @JSImport("carbone", "listConversionFormats")
  @js.native
  def listConversionFormats(documentType: DocumentType): js.Array[ConversionFormat] = js.native
  
  @JSImport("carbone", "removeTemplate")
  @js.native
  def removeTemplate(fileId: String, callback: VoidCallback): Unit = js.native
  
  @JSImport("carbone", "render")
  @js.native
  def render(templatePath: String, data: js.Object, callback: RenderCallback): Unit = js.native
  @JSImport("carbone", "render")
  @js.native
  def render(templatePath: String, data: js.Object, options: RenderOptions, callback: RenderCallback): Unit = js.native
  
  @JSImport("carbone", "renderXML")
  @js.native
  def renderXML(xml: String, data: js.Object, callback: RenderXMLCallback): Unit = js.native
  @JSImport("carbone", "renderXML")
  @js.native
  def renderXML(xml: String, data: js.Object, options: RenderXMLOptions, callback: RenderXMLCallback): Unit = js.native
  
  @JSImport("carbone", "reset")
  @js.native
  def reset(): Unit = js.native
  
  @JSImport("carbone", "set")
  @js.native
  def set(options: Options): Unit = js.native
  
  @js.native
  trait ConversionFormat extends StObject {
    
    var desc: String = js.native
    
    var extension: String = js.native
    
    var format: String = js.native
    
    var id: String = js.native
  }
  object ConversionFormat {
    
    @scala.inline
    def apply(desc: String, extension: String, format: String, id: String): ConversionFormat = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
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
  
  type Formatter = js.ThisFunction2[/* this */ FormatterContext, /* data */ js.Any, /* repeated */ js.Any, Unit]
  
  @js.native
  trait FormatterContext extends StObject {
    
    var currency: Rates = js.native
    
    var enum: Enums = js.native
    
    var extension: String = js.native
    
    var lang: String = js.native
    
    var stopPropagation: Boolean = js.native
  }
  object FormatterContext {
    
    @scala.inline
    def apply(currency: Rates, enum: Enums, extension: String, lang: String, stopPropagation: Boolean): FormatterContext = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
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
  
  @js.native
  trait Options extends StObject {
    
    var currencyRates: js.UndefOr[CurrencyRates] = js.native
    
    var currencySource: js.UndefOr[String] = js.native
    
    var currencyTarget: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var tempPath: js.UndefOr[String] = js.native
    
    var templatePath: js.UndefOr[String] = js.native
    
    var translations: js.UndefOr[Translations] = js.native
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
  
  @js.native
  trait RenderOptions extends StObject {
    
    var complement: js.UndefOr[js.Object] = js.native
    
    var convertTo: js.UndefOr[String | js.Object] = js.native
    
    var currencyRates: js.UndefOr[CurrencyRates] = js.native
    
    var currencySource: js.UndefOr[String] = js.native
    
    var currencyTarget: js.UndefOr[String] = js.native
    
    var enum: js.UndefOr[Enums] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var translations: js.UndefOr[Translations] = js.native
    
    var variableStr: js.UndefOr[String] = js.native
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
  
  @js.native
  trait RenderXMLOptions extends StObject {
    
    var complement: js.UndefOr[js.Object] = js.native
    
    var existingVariables: js.UndefOr[js.Array[Variable]] = js.native
    
    var extension: js.UndefOr[String] = js.native
    
    var formatters: js.UndefOr[Formatters] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var translations: js.UndefOr[Translations] = js.native
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
  
  @js.native
  trait Variable extends StObject {
    
    var code: String = js.native
    
    var name: String = js.native
    
    var regex: RegExp = js.native
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
