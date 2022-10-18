package typings.createHtmlElement

import typings.stringifyAttributes.mod.HTMLAttributes
import typings.typeFest.sourceMergeExclusiveMod.MergeExclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-html-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait BaseOptions extends StObject {
    
    /**
    	HTML tag attributes.
    	*/
    val attributes: js.UndefOr[HTMLAttributes] = js.undefined
    
    /**
    	HTML tag name.
    	@default 'div'
    	*/
    val name: js.UndefOr[String] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setAttributes(value: HTMLAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait HtmlOptions extends StObject {
    
    /**
    	HTML tag value in unescaped HTML.
    	*/
    val html: js.UndefOr[String] = js.undefined
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
    val text: js.UndefOr[String] = js.undefined
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
