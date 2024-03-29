package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Namespaces
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.marked
import typings.ckeditorCkeditor5Engine.srcDataprocessorDataprocessorMod.DataProcessor
import typings.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import typings.std.DOMParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDataprocessorXmldataprocessorMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/dataprocessor/xmldataprocessor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with XmlDataProcessor {
    /**
      * Creates a new instance of the XML data processor class.
      */
    def this(document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default) = this()
    def this(document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default, options: Namespaces) = this()
    
    /**
      * DOM converter used to convert DOM elements to view elements.
      */
    /* CompleteClass */
    override val domConverter: typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.default = js.native
    
    /**
      * DOM parser instance used to parse an XML string to an XML document.
      */
    /* CompleteClass */
    override val domParser: DOMParser = js.native
    
    /**
      * A basic HTML writer instance used to convert DOM elements to an XML string.
      * There is no need to use a dedicated XML writer because the basic HTML writer works well in this case.
      */
    /* CompleteClass */
    override val htmlWriter: typings.ckeditorCkeditor5Engine.srcDataprocessorBasichtmlwriterMod.default = js.native
    
    /**
      * A list of namespaces allowed to use in the XML input.
      *
      * For example, registering namespaces [ 'attribute', 'container' ] allows to use `<attirbute:tagName></attribute:tagName>`
      * and `<container:tagName></container:tagName>` input. It is mainly for debugging.
      */
    /* CompleteClass */
    override val namespaces: js.Array[String] = js.native
    
    /* CompleteClass */
    override def registerRawContentMatcher(pattern: MatcherPattern): Unit = js.native
    
    /* CompleteClass */
    override def toData(fragment: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default): String = js.native
    
    /* CompleteClass */
    override def toView(data: String): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default | typings.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null = js.native
    
    /* CompleteClass */
    override def useFillerType(`type`: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked): Unit = js.native
  }
  
  trait XmlDataProcessor
    extends StObject
       with DataProcessor {
    
    /**
      * DOM converter used to convert DOM elements to view elements.
      */
    val domConverter: typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.default
    
    /**
      * DOM parser instance used to parse an XML string to an XML document.
      */
    val domParser: DOMParser
    
    /**
      * A basic HTML writer instance used to convert DOM elements to an XML string.
      * There is no need to use a dedicated XML writer because the basic HTML writer works well in this case.
      */
    val htmlWriter: typings.ckeditorCkeditor5Engine.srcDataprocessorBasichtmlwriterMod.default
    
    /**
      * A list of namespaces allowed to use in the XML input.
      *
      * For example, registering namespaces [ 'attribute', 'container' ] allows to use `<attirbute:tagName></attribute:tagName>`
      * and `<container:tagName></container:tagName>` input. It is mainly for debugging.
      */
    val namespaces: js.Array[String]
  }
  object XmlDataProcessor {
    
    inline def apply(
      domConverter: typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.default,
      domParser: DOMParser,
      htmlWriter: typings.ckeditorCkeditor5Engine.srcDataprocessorBasichtmlwriterMod.default,
      namespaces: js.Array[String],
      registerRawContentMatcher: MatcherPattern => Unit,
      toData: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default => String,
      toView: String => typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default | typings.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null,
      useFillerType: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked => Unit
    ): XmlDataProcessor = {
      val __obj = js.Dynamic.literal(domConverter = domConverter.asInstanceOf[js.Any], domParser = domParser.asInstanceOf[js.Any], htmlWriter = htmlWriter.asInstanceOf[js.Any], namespaces = namespaces.asInstanceOf[js.Any], registerRawContentMatcher = js.Any.fromFunction1(registerRawContentMatcher), toData = js.Any.fromFunction1(toData), toView = js.Any.fromFunction1(toView), useFillerType = js.Any.fromFunction1(useFillerType))
      __obj.asInstanceOf[XmlDataProcessor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlDataProcessor] (val x: Self) extends AnyVal {
      
      inline def setDomConverter(value: typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.default): Self = StObject.set(x, "domConverter", value.asInstanceOf[js.Any])
      
      inline def setDomParser(value: DOMParser): Self = StObject.set(x, "domParser", value.asInstanceOf[js.Any])
      
      inline def setHtmlWriter(value: typings.ckeditorCkeditor5Engine.srcDataprocessorBasichtmlwriterMod.default): Self = StObject.set(x, "htmlWriter", value.asInstanceOf[js.Any])
      
      inline def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
      
      inline def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value*))
    }
  }
}
