package typings.axiosCaseConverter

import typings.axiosCaseConverter.typingsTypesMod.ApplyCaseMiddleware
import typings.axiosCaseConverter.typingsTypesMod.CreateAxiosInterceptor
import typings.axiosCaseConverter.typingsTypesMod.CreateAxiosRequestTransformer
import typings.axiosCaseConverter.typingsTypesMod.CreateAxiosResponseTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMiddlewareMod {
  
  @JSImport("axios-case-converter/typings/middleware", "applyCaseMiddleware")
  @js.native
  val applyCaseMiddleware: ApplyCaseMiddleware = js.native
  
  @JSImport("axios-case-converter/typings/middleware", "createCamelResponseTransformer")
  @js.native
  val createCamelResponseTransformer: CreateAxiosResponseTransformer = js.native
  
  @JSImport("axios-case-converter/typings/middleware", "createSnakeParamsInterceptor")
  @js.native
  val createSnakeParamsInterceptor: CreateAxiosInterceptor = js.native
  
  @JSImport("axios-case-converter/typings/middleware", "createSnakeRequestTransformer")
  @js.native
  val createSnakeRequestTransformer: CreateAxiosRequestTransformer = js.native
}
