package typings.cors

import typings.cors.anon.End
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: CorsRequest */](): js.Function3[
    /* req */ T, 
    /* res */ End, 
    /* next */ js.Function1[/* err */ js.UndefOr[Any], Any], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function3[
    /* req */ T, 
    /* res */ End, 
    /* next */ js.Function1[/* err */ js.UndefOr[Any], Any], 
    Unit
  ]]
  inline def apply[T /* <: CorsRequest */](options: CorsOptions): js.Function3[
    /* req */ T, 
    /* res */ End, 
    /* next */ js.Function1[/* err */ js.UndefOr[Any], Any], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ T, 
    /* res */ End, 
    /* next */ js.Function1[/* err */ js.UndefOr[Any], Any], 
    Unit
  ]]
  inline def apply[T /* <: CorsRequest */](options: CorsOptionsDelegate[T]): js.Function3[
    /* req */ T, 
    /* res */ End, 
    /* next */ js.Function1[/* err */ js.UndefOr[Any], Any], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ T, 
    /* res */ End, 
    /* next */ js.Function1[/* err */ js.UndefOr[Any], Any], 
    Unit
  ]]
  
  @JSImport("cors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CorsOptions extends StObject {
    
    var allowedHeaders: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var credentials: js.UndefOr[Boolean] = js.undefined
    
    var exposedHeaders: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 'GET,HEAD,PUT,PATCH,POST,DELETE'
      */
    var methods: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * @default 204
      */
    var optionsSuccessStatus: js.UndefOr[Double] = js.undefined
    
    /**
      * @default '*''
      */
    var origin: js.UndefOr[StaticOrigin | CustomOrigin] = js.undefined
    
    /**
      * @default false
      */
    var preflightContinue: js.UndefOr[Boolean] = js.undefined
  }
  object CorsOptions {
    
    inline def apply(): CorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CorsOptions]
    }
    
    extension [Self <: CorsOptions](x: Self) {
      
      inline def setAllowedHeaders(value: String | js.Array[String]): Self = StObject.set(x, "allowedHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowedHeadersUndefined: Self = StObject.set(x, "allowedHeaders", js.undefined)
      
      inline def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "allowedHeaders", js.Array(value*))
      
      inline def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setExposedHeaders(value: String | js.Array[String]): Self = StObject.set(x, "exposedHeaders", value.asInstanceOf[js.Any])
      
      inline def setExposedHeadersUndefined: Self = StObject.set(x, "exposedHeaders", js.undefined)
      
      inline def setExposedHeadersVarargs(value: String*): Self = StObject.set(x, "exposedHeaders", js.Array(value*))
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setMethods(value: String | js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setOptionsSuccessStatus(value: Double): Self = StObject.set(x, "optionsSuccessStatus", value.asInstanceOf[js.Any])
      
      inline def setOptionsSuccessStatusUndefined: Self = StObject.set(x, "optionsSuccessStatus", js.undefined)
      
      inline def setOrigin(value: StaticOrigin | CustomOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginFunction2(
        value: (/* requestOrigin */ js.UndefOr[String], /* callback */ js.Function2[/* err */ js.Error | Null, /* origin */ js.UndefOr[StaticOrigin], Unit]) => Unit
      ): Self = StObject.set(x, "origin", js.Any.fromFunction2(value))
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOriginVarargs(value: (Boolean | String | js.RegExp)*): Self = StObject.set(x, "origin", js.Array(value*))
      
      inline def setPreflightContinue(value: Boolean): Self = StObject.set(x, "preflightContinue", value.asInstanceOf[js.Any])
      
      inline def setPreflightContinueUndefined: Self = StObject.set(x, "preflightContinue", js.undefined)
    }
  }
  
  type CorsOptionsDelegate[T /* <: CorsRequest */] = js.Function2[
    /* req */ T, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* options */ js.UndefOr[CorsOptions], Unit], 
    Unit
  ]
  
  trait CorsRequest extends StObject {
    
    var headers: IncomingHttpHeaders
    
    var method: js.UndefOr[String] = js.undefined
  }
  object CorsRequest {
    
    inline def apply(headers: IncomingHttpHeaders): CorsRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[CorsRequest]
    }
    
    extension [Self <: CorsRequest](x: Self) {
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  type CustomOrigin = js.Function2[
    /* requestOrigin */ js.UndefOr[String], 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* origin */ js.UndefOr[StaticOrigin], Unit], 
    Unit
  ]
  
  type StaticOrigin = Boolean | String | js.RegExp | (js.Array[Boolean | String | js.RegExp])
}
