package typings.bodyParser

import typings.connect.mod.NextHandleFunction
import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // for docs go to https://github.com/expressjs/body-parser/tree/1.19.0#body-parser
  /** @deprecated */
  @scala.inline
  def apply(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[NextHandleFunction]
  @scala.inline
  def apply(options: OptionsJson & OptionsText & OptionsUrlencoded): NextHandleFunction = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  @JSImport("body-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns middleware that only parses json and only looks at requests
    * where the Content-Type header matches the type option.
    */
  @scala.inline
  def json(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("json")().asInstanceOf[NextHandleFunction]
  @scala.inline
  def json(options: OptionsJson): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  /**
    * Returns middleware that parses all bodies as a Buffer and only looks at requests
    * where the Content-Type header matches the type option.
    */
  @scala.inline
  def raw(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")().asInstanceOf[NextHandleFunction]
  @scala.inline
  def raw(options: Options): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  /**
    * Returns middleware that parses all bodies as a string and only looks at requests
    * where the Content-Type header matches the type option.
    */
  @scala.inline
  def text(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("text")().asInstanceOf[NextHandleFunction]
  @scala.inline
  def text(options: OptionsText): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  /**
    * Returns middleware that only parses urlencoded bodies and only looks at requests
    * where the Content-Type header matches the type option
    */
  @scala.inline
  def urlencoded(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("urlencoded")().asInstanceOf[NextHandleFunction]
  @scala.inline
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("urlencoded")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
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
    var `type`: js.UndefOr[String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, js.Any])] = js.undefined
    
    /**
      * The verify option, if supplied, is called as verify(req, res, buf, encoding),
      * where buf is a Buffer of the raw request body and encoding is the encoding of the request.
      */
    var verify: js.UndefOr[
        js.Function4[
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          /* buf */ Buffer, 
          /* encoding */ String, 
          Unit
        ]
      ] = js.undefined
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
      def setInflate(value: Boolean): Self = StObject.set(x, "inflate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInflateUndefined: Self = StObject.set(x, "inflate", js.undefined)
      
      @scala.inline
      def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, js.Any])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFunction1(value: /* req */ IncomingMessage => js.Any): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setVerify(
        value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* buf */ Buffer, /* encoding */ String) => Unit
      ): Self = StObject.set(x, "verify", js.Any.fromFunction4(value))
      
      @scala.inline
      def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  trait OptionsJson
    extends StObject
       with Options {
    
    /**
      *
      * The reviver option is passed directly to JSON.parse as the second argument.
      */
    var reviver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, js.Any]] = js.undefined
    
    /**
      * When set to `true`, will only accept arrays and objects;
      * when `false` will accept anything JSON.parse accepts. Defaults to `true`.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsJson {
    
    @scala.inline
    def apply(): OptionsJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsJson]
    }
    
    @scala.inline
    implicit class OptionsJsonMutableBuilder[Self <: OptionsJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReviver(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
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
    
    @scala.inline
    def apply(): OptionsText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsText]
    }
    
    @scala.inline
    implicit class OptionsTextMutableBuilder[Self <: OptionsText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultCharset(value: String): Self = StObject.set(x, "defaultCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCharsetUndefined: Self = StObject.set(x, "defaultCharset", js.undefined)
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
    
    @scala.inline
    def apply(): OptionsUrlencoded = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsUrlencoded]
    }
    
    @scala.inline
    implicit class OptionsUrlencodedMutableBuilder[Self <: OptionsUrlencoded] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedUndefined: Self = StObject.set(x, "extended", js.undefined)
      
      @scala.inline
      def setParameterLimit(value: Double): Self = StObject.set(x, "parameterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterLimitUndefined: Self = StObject.set(x, "parameterLimit", js.undefined)
    }
  }
}
