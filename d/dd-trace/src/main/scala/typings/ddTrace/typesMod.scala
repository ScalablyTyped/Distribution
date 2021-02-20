package typings.ddTrace

import typings.ddTrace.ddTraceStrings.http
import typings.ddTrace.ddTraceStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("dd-trace/ext/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dd-trace/ext/types", "HTTP")
  @js.native
  def HTTP: http = js.native
  @scala.inline
  def HTTP_=(x: http): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/types", "WEB")
  @js.native
  def WEB: web = js.native
  @scala.inline
  def WEB_=(x: web): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEB")(x.asInstanceOf[js.Any])
}
