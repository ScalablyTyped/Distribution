package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.marked
import typings.ckeditorCkeditor5Engine.dataprocessorMod.DataProcessor
import typings.ckeditorCkeditor5Engine.matcherMod.MatcherPattern
import typings.std.DOMParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmldataprocessorMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/dataprocessor/htmldataprocessor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with HtmlDataProcessor {
    /**
      * Creates a new instance of the HTML data processor class.
      */
    def this(document: typings.ckeditorCkeditor5Engine.viewDocumentMod.default) = this()
    
    /**
      * A DOM converter used to convert DOM elements to view elements.
      */
    /* CompleteClass */
    var domConverter: typings.ckeditorCkeditor5Engine.domconverterMod.default = js.native
    
    /**
      * A DOM parser instance used to parse an HTML string to an HTML document.
      */
    /* CompleteClass */
    override val domParser: DOMParser = js.native
    
    /**
      * A basic HTML writer instance used to convert DOM elements to an HTML string.
      */
    /* CompleteClass */
    override val htmlWriter: typings.ckeditorCkeditor5Engine.basichtmlwriterMod.default = js.native
    
    /* CompleteClass */
    override def registerRawContentMatcher(pattern: MatcherPattern): Unit = js.native
    
    /* CompleteClass */
    override def toData(fragment: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default): String = js.native
    
    /* CompleteClass */
    override def toView(data: String): typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default | typings.ckeditorCkeditor5Engine.viewNodeMod.default | Null = js.native
    
    /* CompleteClass */
    override def useFillerType(`type`: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked): Unit = js.native
  }
  
  trait HtmlDataProcessor
    extends StObject
       with DataProcessor {
    
    /**
      * A DOM converter used to convert DOM elements to view elements.
      */
    var domConverter: typings.ckeditorCkeditor5Engine.domconverterMod.default
    
    /**
      * A DOM parser instance used to parse an HTML string to an HTML document.
      */
    val domParser: DOMParser
    
    /**
      * A basic HTML writer instance used to convert DOM elements to an HTML string.
      */
    val htmlWriter: typings.ckeditorCkeditor5Engine.basichtmlwriterMod.default
  }
  object HtmlDataProcessor {
    
    inline def apply(
      domConverter: typings.ckeditorCkeditor5Engine.domconverterMod.default,
      domParser: DOMParser,
      htmlWriter: typings.ckeditorCkeditor5Engine.basichtmlwriterMod.default,
      registerRawContentMatcher: MatcherPattern => Unit,
      toData: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default => String,
      toView: String => typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default | typings.ckeditorCkeditor5Engine.viewNodeMod.default | Null,
      useFillerType: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked => Unit
    ): HtmlDataProcessor = {
      val __obj = js.Dynamic.literal(domConverter = domConverter.asInstanceOf[js.Any], domParser = domParser.asInstanceOf[js.Any], htmlWriter = htmlWriter.asInstanceOf[js.Any], registerRawContentMatcher = js.Any.fromFunction1(registerRawContentMatcher), toData = js.Any.fromFunction1(toData), toView = js.Any.fromFunction1(toView), useFillerType = js.Any.fromFunction1(useFillerType))
      __obj.asInstanceOf[HtmlDataProcessor]
    }
    
    extension [Self <: HtmlDataProcessor](x: Self) {
      
      inline def setDomConverter(value: typings.ckeditorCkeditor5Engine.domconverterMod.default): Self = StObject.set(x, "domConverter", value.asInstanceOf[js.Any])
      
      inline def setDomParser(value: DOMParser): Self = StObject.set(x, "domParser", value.asInstanceOf[js.Any])
      
      inline def setHtmlWriter(value: typings.ckeditorCkeditor5Engine.basichtmlwriterMod.default): Self = StObject.set(x, "htmlWriter", value.asInstanceOf[js.Any])
    }
  }
}
