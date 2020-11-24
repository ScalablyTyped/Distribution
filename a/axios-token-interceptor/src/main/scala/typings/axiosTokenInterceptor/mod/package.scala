package typings.axiosTokenInterceptor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TokenProvider = js.Function1[
    /* config */ typings.axios.mod.AxiosRequestConfig, 
    js.Promise[typings.axios.mod.AxiosRequestConfig]
  ]
}
