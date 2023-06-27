package typings.codemirrorLangXml

import typings.codemirrorAutocomplete.mod.Completion
import typings.codemirrorAutocomplete.mod.CompletionSource
import typings.codemirrorLangXml.anon.PartialCompletion
import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Create a completion source for the given schema.
  */
  inline def completeFromSchema(eltSpecs: js.Array[ElementSpec], attrSpecs: js.Array[AttrSpec]): CompletionSource = (^.asInstanceOf[js.Dynamic].applyDynamic("completeFromSchema")(eltSpecs.asInstanceOf[js.Any], attrSpecs.asInstanceOf[js.Any])).asInstanceOf[CompletionSource]
  
  /**
  XML language support. Includes schema-based autocompletion when
  configured.
  */
  inline def xml(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("xml")().asInstanceOf[LanguageSupport]
  inline def xml(conf: XMLConfig): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("xml")(conf.asInstanceOf[js.Any]).asInstanceOf[LanguageSupport]
  
  /**
  A language provider based on the [Lezer XML
  parser](https://github.com/lezer-parser/xml), extended with
  highlighting and indentation information.
  */
  @JSImport("@codemirror/lang-xml", "xmlLanguage")
  @js.native
  val xmlLanguage: LRLanguage = js.native
  
  /**
  Describes an attribute in your XML schema.
  */
  trait AttrSpec extends StObject {
    
    /**
      Provides extra fields to the
      [completion](https://codemirror.net/6/docs/ref/#autocompletion.Completion) object created for this
      element
      */
    var completion: js.UndefOr[PartialCompletion] = js.undefined
    
    /**
      When `true`, this attribute can be added to all elements.
      */
    var global: js.UndefOr[Boolean] = js.undefined
    
    /**
      The attribute name.
      */
    var name: String
    
    /**
      Pre-defined values to complete for this attribute.
      */
    var values: js.UndefOr[js.Array[String | Completion]] = js.undefined
  }
  object AttrSpec {
    
    inline def apply(name: String): AttrSpec = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttrSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttrSpec] (val x: Self) extends AnyVal {
      
      inline def setCompletion(value: PartialCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      inline def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String | Completion]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: (String | Completion)*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  /**
  Describes an element in your XML document schema.
  */
  trait ElementSpec extends StObject {
    
    /**
      Allowed attributes in this element. Strings refer to attributes
      specified in [`XMLConfig.attrs`](https://codemirror.net/6/docs/ref/#lang-xml.XMLConfig.attrs), but
      you can also provide one-off [attribute
      specs](https://codemirror.net/6/docs/ref/#lang-xml.AttrSpec). Attributes marked as
      [`global`](https://codemirror.net/6/docs/ref/#lang-xml.AttrSpec.global) are allowed in every
      element, and don't have to be mentioned here.
      */
    var attributes: js.UndefOr[js.Array[String | AttrSpec]] = js.undefined
    
    /**
      Allowed children in this element. When not given, all elements
      are allowed inside it.
      */
    var children: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      Can be provided to add extra fields to the
      [completion](https://codemirror.net/6/docs/ref/#autocompletion.Completion) object created for this
      element.
      */
    var completion: js.UndefOr[PartialCompletion] = js.undefined
    
    /**
      The element name.
      */
    var name: String
    
    /**
      When given, allows users to complete the given content strings
      as plain text when at the start of the element.
      */
    var textContent: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      Whether this element may appear at the top of the document.
      */
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object ElementSpec {
    
    inline def apply(name: String): ElementSpec = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementSpec] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[String | AttrSpec]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: (String | AttrSpec)*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setChildren(value: js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCompletion(value: PartialCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      inline def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTextContent(value: js.Array[String]): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
      
      inline def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
      
      inline def setTextContentVarargs(value: String*): Self = StObject.set(x, "textContent", js.Array(value*))
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait XMLConfig extends StObject {
    
    /**
      Supporting attribute descriptions for the schema specified in
      [`elements`](https://codemirror.net/6/docs/ref/#lang-xml.xml^conf.elements).
      */
    var attributes: js.UndefOr[js.Array[AttrSpec]] = js.undefined
    
    /**
      Provide a schema to create completions from.
      */
    var elements: js.UndefOr[js.Array[ElementSpec]] = js.undefined
  }
  object XMLConfig {
    
    inline def apply(): XMLConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XMLConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XMLConfig] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[AttrSpec]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: AttrSpec*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setElements(value: js.Array[ElementSpec]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setElementsVarargs(value: ElementSpec*): Self = StObject.set(x, "elements", js.Array(value*))
    }
  }
}
