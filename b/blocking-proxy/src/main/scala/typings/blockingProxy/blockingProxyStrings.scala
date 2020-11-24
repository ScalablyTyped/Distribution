package typings.blockingProxy

import typings.blockingProxy.webdriverCommandsMod.HttpMethod
import typings.blockingProxy.webdriverCommandsMod.paramKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockingProxyStrings {
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def elementId: elementId = "elementId".asInstanceOf[elementId]
  
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @scala.inline
  def propertyName: propertyName = "propertyName".asInstanceOf[propertyName]
  
  @scala.inline
  def sessionId: sessionId = "sessionId".asInstanceOf[sessionId]
  
  @js.native
  sealed trait DELETE extends HttpMethod
  
  @js.native
  sealed trait GET extends HttpMethod
  
  @js.native
  sealed trait POST extends HttpMethod
  
  @js.native
  sealed trait elementId extends paramKey
  
  @js.native
  sealed trait name extends paramKey
  
  @js.native
  sealed trait propertyName extends paramKey
  
  @js.native
  sealed trait sessionId extends paramKey
}
