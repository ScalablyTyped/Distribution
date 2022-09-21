package typings.createHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    /** Content to insert into <body> tag. */
    var body: js.UndefOr[String] = js.undefined
    
    /** CSS filename. */
    var css: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Add async attribute to CSS tag. */
    var cssAsync: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Direction of content. */
    var dir: js.UndefOr[String] = js.undefined
    
    /** Site favicon. */
    var favicon: js.UndefOr[String] = js.undefined
    
    /** Content to insert into <head> tag. */
    var head: js.UndefOr[String] = js.undefined
    
    /** Language of content. */
    var lang: js.UndefOr[String] = js.undefined
    
    /** JavaScript filename. */
    var script: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Add async attribute to script tag. */
    var scriptAsync: js.UndefOr[Boolean] = js.undefined
    
    /** Page title. */
    var title: js.UndefOr[String] = js.undefined
  }
  object Body {
    
    inline def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCss(value: String | js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssAsync(value: String | js.Array[String]): Self = StObject.set(x, "cssAsync", value.asInstanceOf[js.Any])
      
      inline def setCssAsyncUndefined: Self = StObject.set(x, "cssAsync", js.undefined)
      
      inline def setCssAsyncVarargs(value: String*): Self = StObject.set(x, "cssAsync", js.Array(value*))
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setScript(value: String | js.Array[String]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptAsync(value: Boolean): Self = StObject.set(x, "scriptAsync", value.asInstanceOf[js.Any])
      
      inline def setScriptAsyncUndefined: Self = StObject.set(x, "scriptAsync", js.undefined)
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setScriptVarargs(value: String*): Self = StObject.set(x, "script", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
