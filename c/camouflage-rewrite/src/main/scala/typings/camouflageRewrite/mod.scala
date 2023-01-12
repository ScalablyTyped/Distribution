package typings.camouflageRewrite

import typings.express.mod.RequestHandler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("camouflage-rewrite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var mediaTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var rewriteContent: js.UndefOr[Boolean] = js.undefined
    
    var rewriteHeaders: js.UndefOr[Boolean] = js.undefined
    
    var url: String
  }
  object Options {
    
    inline def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMediaTypes(value: js.Array[String]): Self = StObject.set(x, "mediaTypes", value.asInstanceOf[js.Any])
      
      inline def setMediaTypesUndefined: Self = StObject.set(x, "mediaTypes", js.undefined)
      
      inline def setMediaTypesVarargs(value: String*): Self = StObject.set(x, "mediaTypes", js.Array(value*))
      
      inline def setRewriteContent(value: Boolean): Self = StObject.set(x, "rewriteContent", value.asInstanceOf[js.Any])
      
      inline def setRewriteContentUndefined: Self = StObject.set(x, "rewriteContent", js.undefined)
      
      inline def setRewriteHeaders(value: Boolean): Self = StObject.set(x, "rewriteHeaders", value.asInstanceOf[js.Any])
      
      inline def setRewriteHeadersUndefined: Self = StObject.set(x, "rewriteHeaders", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
