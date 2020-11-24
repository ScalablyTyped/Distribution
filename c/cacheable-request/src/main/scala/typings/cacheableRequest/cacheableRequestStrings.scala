package typings.cacheableRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheableRequestStrings {
  
  @scala.inline
  def CacheError: CacheError = "CacheError".asInstanceOf[CacheError]
  
  @scala.inline
  def RequestError: RequestError = "RequestError".asInstanceOf[RequestError]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait CacheError extends js.Object
  
  @js.native
  sealed trait RequestError extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait response extends js.Object
}
