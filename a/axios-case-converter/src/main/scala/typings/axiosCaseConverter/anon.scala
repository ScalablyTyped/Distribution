package typings.axiosCaseConverter

import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosRequestHeaders
import typings.axios.mod.AxiosRequestTransformer
import typings.axios.mod.AxiosResponseHeaders
import typings.axios.mod.AxiosResponseTransformer
import typings.axiosCaseConverter.typesMod.AxiosInterceptor
import typings.axiosCaseConverter.typesMod.CaseFunction
import typings.noCase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<axios-case-converter.axios-case-converter/typings/types.CaseFunctions> */
  trait PartialCaseFunctions extends StObject {
    
    var camel: js.UndefOr[CaseFunction] = js.undefined
    
    var header: js.UndefOr[CaseFunction] = js.undefined
    
    var snake: js.UndefOr[CaseFunction] = js.undefined
  }
  object PartialCaseFunctions {
    
    inline def apply(): PartialCaseFunctions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCaseFunctions]
    }
    
    extension [Self <: PartialCaseFunctions](x: Self) {
      
      inline def setCamel(value: (/* input */ String, /* options */ js.UndefOr[Options]) => String): Self = StObject.set(x, "camel", js.Any.fromFunction2(value))
      
      inline def setCamelUndefined: Self = StObject.set(x, "camel", js.undefined)
      
      inline def setHeader(value: (/* input */ String, /* options */ js.UndefOr[Options]) => String): Self = StObject.set(x, "header", js.Any.fromFunction2(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setSnake(value: (/* input */ String, /* options */ js.UndefOr[Options]) => String): Self = StObject.set(x, "snake", js.Any.fromFunction2(value))
      
      inline def setSnakeUndefined: Self = StObject.set(x, "snake", js.undefined)
    }
  }
  
  trait RequestInterceptor extends StObject {
    
    var requestInterceptor: js.UndefOr[AxiosInterceptor] = js.undefined
    
    var requestTransformer: js.UndefOr[AxiosRequestTransformer] = js.undefined
    
    var responseTransformer: js.UndefOr[AxiosResponseTransformer] = js.undefined
  }
  object RequestInterceptor {
    
    inline def apply(): RequestInterceptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInterceptor]
    }
    
    extension [Self <: RequestInterceptor](x: Self) {
      
      inline def setRequestInterceptor(value: /* config */ AxiosRequestConfig[Any] => AxiosRequestConfig[Any]): Self = StObject.set(x, "requestInterceptor", js.Any.fromFunction1(value))
      
      inline def setRequestInterceptorUndefined: Self = StObject.set(x, "requestInterceptor", js.undefined)
      
      inline def setRequestTransformer(value: (/* data */ Any, /* headers */ js.UndefOr[AxiosRequestHeaders]) => Any): Self = StObject.set(x, "requestTransformer", js.Any.fromFunction2(value))
      
      inline def setRequestTransformerUndefined: Self = StObject.set(x, "requestTransformer", js.undefined)
      
      inline def setResponseTransformer(value: (/* data */ Any, /* headers */ js.UndefOr[AxiosResponseHeaders]) => Any): Self = StObject.set(x, "responseTransformer", js.Any.fromFunction2(value))
      
      inline def setResponseTransformerUndefined: Self = StObject.set(x, "responseTransformer", js.undefined)
    }
  }
}
