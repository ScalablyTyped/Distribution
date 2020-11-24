package typings.crawler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crawlerStrings {
  
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  
  @scala.inline
  def limiterChange: limiterChange = "limiterChange".asInstanceOf[limiterChange]
  
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @scala.inline
  def schedule: schedule = "schedule".asInstanceOf[schedule]
  
  @js.native
  sealed trait drain extends js.Object
  
  @js.native
  sealed trait limiterChange extends js.Object
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait schedule extends js.Object
}
