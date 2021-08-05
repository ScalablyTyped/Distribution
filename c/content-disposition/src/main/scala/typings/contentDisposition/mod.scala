package typings.contentDisposition

import typings.contentDisposition.contentDispositionStrings.`inline`
import typings.contentDisposition.contentDispositionStrings.attachment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create an attachment `Content-Disposition` header value using the given file name, if supplied.
    * The `filename` is optional and if no file name is desired, but you want to specify options, set `filename` to undefined.
    */
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(filename: String): String = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(filename: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(filename: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("content-disposition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse a Content-Disposition header string
    */
  inline def parse(contentDispositionHeader: String): ContentDisposition = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(contentDispositionHeader.asInstanceOf[js.Any]).asInstanceOf[ContentDisposition]
  
  /**
    * Class for parsed Content-Disposition header for v8 optimization
    */
  trait ContentDisposition extends StObject {
    
    /**
      * An object of the parameters in the disposition
      * (name of parameter always lower case and extended versions replace non-extended versions)
      */
    var parameters: js.Any
    
    /**
      * The disposition type (always lower case)
      */
    var `type`: attachment | `inline` | String
  }
  object ContentDisposition {
    
    inline def apply(parameters: js.Any, `type`: attachment | `inline` | String): ContentDisposition = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentDisposition]
    }
    
    extension [Self <: ContentDisposition](x: Self) {
      
      inline def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setType(value: attachment | `inline` | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * If the filename option is outside ISO-8859-1,
      * then the file name is actually stored in a supplemental field for clients
      * that support Unicode file names and a ISO-8859-1 version of the file name is automatically generated
      * @default true
      */
    var fallback: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * Specifies the disposition type.
      * This can also be "inline", or any other value (all values except `inline` are treated like attachment,
      * but can convey additional information if both parties agree to it).
      * The `type` is normalized to lower-case.
      * @default 'attachment'
      */
    var `type`: js.UndefOr[attachment | `inline` | String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFallback(value: String | Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setType(value: attachment | `inline` | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
