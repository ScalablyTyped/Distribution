package typings.bodyParser

import org.scalablytyped.runtime.Shortcut
import typings.connect.mod.NextHandleFunction
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("body-parser", JSImport.Namespace)
  @js.native
  val ^ : BodyParser = js.native
  
  @js.native
  trait BodyParser extends StObject {
    
    /**
      * @deprecated  use individual json/urlencoded middlewares
      */
    def apply(): NextHandleFunction = js.native
    def apply(options: OptionsJson & OptionsText & OptionsUrlencoded): NextHandleFunction = js.native
    
    /**
      * Returns middleware that only parses json and only looks at requests
      * where the Content-Type header matches the type option.
      */
    def json(): NextHandleFunction = js.native
    def json(options: OptionsJson): NextHandleFunction = js.native
    
    /**
      * Returns middleware that parses all bodies as a Buffer and only looks at requests
      * where the Content-Type header matches the type option.
      */
    def raw(): NextHandleFunction = js.native
    def raw(options: Options): NextHandleFunction = js.native
    
    /**
      * Returns middleware that parses all bodies as a string and only looks at requests
      * where the Content-Type header matches the type option.
      */
    def text(): NextHandleFunction = js.native
    def text(options: OptionsText): NextHandleFunction = js.native
    
    /**
      * Returns middleware that only parses urlencoded bodies and only looks at requests
      * where the Content-Type header matches the type option
      */
    def urlencoded(): NextHandleFunction = js.native
    def urlencoded(options: OptionsUrlencoded): NextHandleFunction = js.native
  }
  
  trait Options extends StObject {
    
    /** When set to true, then deflated (compressed) bodies will be inflated; when false, deflated bodies are rejected. Defaults to true. */
    var inflate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the maximum request body size. If this is a number,
      * then the value specifies the number of bytes; if it is a string,
      * the value is passed to the bytes library for parsing. Defaults to '100kb'.
      */
    var limit: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The type option is used to determine what media type the middleware will parse
      */
    var `type`: js.UndefOr[String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, Any])] = js.undefined
    
    /**
      * The verify option, if supplied, is called as verify(req, res, buf, encoding),
      * where buf is a Buffer of the raw request body and encoding is the encoding of the request.
      */
    var verify: js.UndefOr[
        js.Function4[
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* buf */ Buffer, 
          /* encoding */ String, 
          Unit
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setInflate(value: Boolean): Self = StObject.set(x, "inflate", value.asInstanceOf[js.Any])
      
      inline def setInflateUndefined: Self = StObject.set(x, "inflate", js.undefined)
      
      inline def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setType(value: String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, Any])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction1(value: /* req */ IncomingMessage => Any): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
      
      inline def setVerify(
        value: (/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], /* buf */ Buffer, /* encoding */ String) => Unit
      ): Self = StObject.set(x, "verify", js.Any.fromFunction4(value))
      
      inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  trait OptionsJson
    extends StObject
       with Options {
    
    /**
      *
      * The reviver option is passed directly to JSON.parse as the second argument.
      */
    var reviver: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any]] = js.undefined
    
    /**
      * When set to `true`, will only accept arrays and objects;
      * when `false` will accept anything JSON.parse accepts. Defaults to `true`.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsJson {
    
    inline def apply(): OptionsJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsJson] (val x: Self) extends AnyVal {
      
      inline def setReviver(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait OptionsText
    extends StObject
       with Options {
    
    /**
      * Specify the default character set for the text content if the charset
      * is not specified in the Content-Type header of the request.
      * Defaults to `utf-8`.
      */
    var defaultCharset: js.UndefOr[String] = js.undefined
  }
  object OptionsText {
    
    inline def apply(): OptionsText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsText] (val x: Self) extends AnyVal {
      
      inline def setDefaultCharset(value: String): Self = StObject.set(x, "defaultCharset", value.asInstanceOf[js.Any])
      
      inline def setDefaultCharsetUndefined: Self = StObject.set(x, "defaultCharset", js.undefined)
    }
  }
  
  trait OptionsUrlencoded
    extends StObject
       with Options {
    
    /**
      * The extended option allows to choose between parsing the URL-encoded data
      * with the querystring library (when `false`) or the qs library (when `true`).
      */
    var extended: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The parameterLimit option controls the maximum number of parameters
      * that are allowed in the URL-encoded data. If a request contains more parameters than this value,
      * a 413 will be returned to the client. Defaults to 1000.
      */
    var parameterLimit: js.UndefOr[Double] = js.undefined
  }
  object OptionsUrlencoded {
    
    inline def apply(): OptionsUrlencoded = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsUrlencoded]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsUrlencoded] (val x: Self) extends AnyVal {
      
      inline def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      inline def setExtendedUndefined: Self = StObject.set(x, "extended", js.undefined)
      
      inline def setParameterLimit(value: Double): Self = StObject.set(x, "parameterLimit", value.asInstanceOf[js.Any])
      
      inline def setParameterLimitUndefined: Self = StObject.set(x, "parameterLimit", js.undefined)
    }
  }
  
  type _To = BodyParser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BodyParser = ^
}
