package typings.bodyParserXml

import typings.bodyParser.mod.BodyParser
import typings.connect.mod.NextHandleFunction
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.xml2js.mod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This library adds an xml method to the body-parser object.
    */
  inline def apply(bodyParser: BodyParser): Unit = ^.asInstanceOf[js.Dynamic].apply(bodyParser.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("body-parser-xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Specify the default character set for the text content if the charset is not specified in the Content-Type header of the request.
      * @default 'utf-8'
      */
    var defaultCharset: js.UndefOr[BufferEncoding] = js.undefined
    
    /**
      * When set to true, then deflated (compressed) bodies will be inflated; when false, deflated bodies are rejected.
      * @default true
      */
    var inflate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the maximum request body size. If this is a number, then the value specifies the number of bytes; if it is a string, the value is passed to the bytes library for parsing.
      * @default '100kb'
      */
    var limit: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The type option is used to determine what media type the middleware will parse.
      * @default ['_/xml', '+xml']
      */
    var `type`: js.UndefOr[String | js.Array[String] | (js.Function1[/* req */ Request, Boolean])] = js.undefined
    
    /**
      * The verify option, if supplied, is called as verify(req, res, buf, encoding),
      * where buf is a Buffer of the raw request body and encoding is the encoding of the request.
      * The parsing can be aborted by throwing an error.
      */
    var verify: js.UndefOr[
        js.Function4[
          /* req */ Request, 
          /* res */ Response, 
          /* buf */ Buffer, 
          /* encoding */ BufferEncoding, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * This option controls the behaviour of the XML parser
      */
    var xmlParseOptions: js.UndefOr[ParserOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDefaultCharset(value: BufferEncoding): Self = StObject.set(x, "defaultCharset", value.asInstanceOf[js.Any])
      
      inline def setDefaultCharsetUndefined: Self = StObject.set(x, "defaultCharset", js.undefined)
      
      inline def setInflate(value: Boolean): Self = StObject.set(x, "inflate", value.asInstanceOf[js.Any])
      
      inline def setInflateUndefined: Self = StObject.set(x, "inflate", js.undefined)
      
      inline def setLimit(value: String | Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setType(value: String | js.Array[String] | (js.Function1[/* req */ Request, Boolean])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction1(value: /* req */ Request => Boolean): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
      
      inline def setVerify(
        value: (/* req */ Request, /* res */ Response, /* buf */ Buffer, /* encoding */ BufferEncoding) => Unit
      ): Self = StObject.set(x, "verify", js.Any.fromFunction4(value))
      
      inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
      
      inline def setXmlParseOptions(value: ParserOptions): Self = StObject.set(x, "xmlParseOptions", value.asInstanceOf[js.Any])
      
      inline def setXmlParseOptionsUndefined: Self = StObject.set(x, "xmlParseOptions", js.undefined)
    }
  }
  
  /* augmented module */
  object bodyParserAugmentingMod {
    
    @js.native
    trait BodyParser extends StObject {
      
      def xml(): NextHandleFunction = js.native
      def xml(options: typings.bodyParser.mod.Options): NextHandleFunction = js.native
    }
  }
}
