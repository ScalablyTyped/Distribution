package typings.createHtmlElement

import typings.stringifyAttributes.mod.Attributes
import typings.typeFest.mergeExclusiveMod.MergeExclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Create a HTML element string.
  @example
  ```
  import createHtmlElement = require('create-html-element');
  createHtmlElement({
  	name: 'h1',
  	attributes: {
  		class: 'unicorn',
  		rainbow: true,
  		horse: false,
  		number: 1,
  		multiple: ['a', 'b']
  	},
  	html: '🦄'
  });
  //=> '<h1 class="unicorn" rainbow number="1" multiple="a b">🦄</h1>'
  createHtmlElement({text: 'Hello <em>World</em>'});
  //=> '<div>Hello &lt;em&gt;World&lt;/em&gt;</div>'
  ```
  */
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(options: Options): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("create-html-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BaseOptions extends StObject {
    
    /**
    		HTML tag attributes.
    		*/
    var attributes: js.UndefOr[Attributes] = js.undefined
    
    /**
    		HTML tag name.
    		@default 'div'
    		*/
    var name: js.UndefOr[String] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait HtmlOptions extends StObject {
    
    /**
    		HTML tag value in unescaped HTML.
    		*/
    var html: js.UndefOr[String] = js.undefined
  }
  object HtmlOptions {
    
    inline def apply(): HtmlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlOptions]
    }
    
    extension [Self <: HtmlOptions](x: Self) {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    }
  }
  
  type Options = BaseOptions & (MergeExclusive[HtmlOptions, TextOptions])
  
  trait TextOptions extends StObject {
    
    /**
    		HTML tag value in escaped HTML.
    		*/
    var text: js.UndefOr[String] = js.undefined
  }
  object TextOptions {
    
    inline def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    extension [Self <: TextOptions](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
