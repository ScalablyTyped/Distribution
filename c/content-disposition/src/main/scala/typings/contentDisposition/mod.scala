package typings.contentDisposition

import typings.contentDisposition.contentDispositionStrings.`inline`
import typings.contentDisposition.contentDispositionStrings.attachment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create an attachment `Content-Disposition` header value using the given file name, if supplied.
    * The `filename` is optional and if no file name is desired, but you want to specify options, set `filename` to undefined.
    */
  @JSImport("content-disposition", JSImport.Namespace)
  @js.native
  def apply(): String = js.native
  @JSImport("content-disposition", JSImport.Namespace)
  @js.native
  def apply(filename: js.UndefOr[scala.Nothing], options: Options): String = js.native
  @JSImport("content-disposition", JSImport.Namespace)
  @js.native
  def apply(filename: String): String = js.native
  @JSImport("content-disposition", JSImport.Namespace)
  @js.native
  def apply(filename: String, options: Options): String = js.native
  
  /**
    * Parse a Content-Disposition header string
    */
  @JSImport("content-disposition", "parse")
  @js.native
  def parse(contentDispositionHeader: String): ContentDisposition = js.native
  
  /**
    * Class for parsed Content-Disposition header for v8 optimization
    */
  @js.native
  trait ContentDisposition extends StObject {
    
    /**
      * An object of the parameters in the disposition
      * (name of parameter always lower case and extended versions replace non-extended versions)
      */
    var parameters: js.Any = js.native
    
    /**
      * The disposition type (always lower case)
      */
    var `type`: attachment | `inline` | String = js.native
  }
  object ContentDisposition {
    
    @scala.inline
    def apply(parameters: js.Any, `type`: attachment | `inline` | String): ContentDisposition = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentDisposition]
    }
    
    @scala.inline
    implicit class ContentDispositionMutableBuilder[Self <: ContentDisposition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: attachment | `inline` | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * If the filename option is outside ISO-8859-1,
      * then the file name is actually stored in a supplemental field for clients
      * that support Unicode file names and a ISO-8859-1 version of the file name is automatically generated
      * @default true
      */
    var fallback: js.UndefOr[String | Boolean] = js.native
    
    /**
      * Specifies the disposition type.
      * This can also be "inline", or any other value (all values except `inline` are treated like attachment,
      * but can convey additional information if both parties agree to it).
      * The `type` is normalized to lower-case.
      * @default 'attachment'
      */
    var `type`: js.UndefOr[attachment | `inline` | String] = js.native
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
      def setFallback(value: String | Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setType(value: attachment | `inline` | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
