package typings.axiosCaseConverter

import typings.axiosCaseConverter.typesMod.ApplyCaseMiddleware
import typings.axiosCaseConverter.typesMod.CreateAxiosInterceptor
import typings.axiosCaseConverter.typesMod.CreateAxiosRequestTransformer
import typings.axiosCaseConverter.typesMod.CreateAxiosResponseTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
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
