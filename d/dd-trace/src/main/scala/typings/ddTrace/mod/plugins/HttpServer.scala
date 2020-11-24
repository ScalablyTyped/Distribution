package typings.ddTrace.mod.plugins

import typings.ddTrace.anon.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait HttpServer extends Http_ {
  
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[Request] = js.native
  
  /**
    * Whether to enable instrumention of <plugin>.middleware spans
    *
    * @default true
    */
  var middleware: js.UndefOr[Boolean] = js.native
}
object HttpServer {
  
  @scala.inline
  def apply(): HttpServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpServer]
  }
  
  @scala.inline
  implicit class HttpServerOps[Self <: HttpServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHooks(value: Request): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setMiddleware(value: Boolean): Self = this.set("middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleware: Self = this.set("middleware", js.undefined)
  }
}
