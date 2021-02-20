package typings.blockingProxy

import typings.blockingProxy.webdriverCommandsMod.HttpMethod
import typings.blockingProxy.webdriverCommandsMod.paramKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockingProxyStrings {
  
  @js.native
  sealed trait DELETE extends HttpMethod
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET extends HttpMethod
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait POST extends HttpMethod
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait elementId extends paramKey
  @scala.inline
  def elementId: elementId = "elementId".asInstanceOf[elementId]
  
  @js.native
  sealed trait name extends paramKey
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait propertyName extends paramKey
  @scala.inline
  def propertyName: propertyName = "propertyName".asInstanceOf[propertyName]
  
  @js.native
  sealed trait sessionId extends paramKey
  @scala.inline
  def sessionId: sessionId = "sessionId".asInstanceOf[sessionId]
}
