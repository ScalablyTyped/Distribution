package typings.browserSync.mod

import typings.node.httpMod.ServerResponse
import typings.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptions extends js.Object {
  
  /** set base directory */
  var baseDir: js.UndefOr[String | js.Array[String]] = js.native
  
  /** enable directory listing */
  var directory: js.UndefOr[Boolean] = js.native
  
  /** set index filename */
  var index: js.UndefOr[String] = js.native
  
  /** configure custom middleware */
  var middleware: js.UndefOr[js.Array[MiddlewareHandler | PerRouteMiddleware]] = js.native
  
  /**
    * key-value object hash, where the key is the url to match,
    * and the value is the folder to serve (relative to your working directory)
    */
  var routes: js.UndefOr[Hash[String]] = js.native
  
  var serveStaticOptions: js.UndefOr[ServeStaticOptions[ServerResponse]] = js.native
}
object ServerOptions {
  
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
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
    def setBaseDirVarargs(value: String*): Self = this.set("baseDir", js.Array(value :_*))
    
    @scala.inline
    def setBaseDir(value: String | js.Array[String]): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseDir: Self = this.set("baseDir", js.undefined)
    
    @scala.inline
    def setDirectory(value: Boolean): Self = this.set("directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setMiddlewareVarargs(value: (MiddlewareHandler | PerRouteMiddleware)*): Self = this.set("middleware", js.Array(value :_*))
    
    @scala.inline
    def setMiddleware(value: js.Array[MiddlewareHandler | PerRouteMiddleware]): Self = this.set("middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleware: Self = this.set("middleware", js.undefined)
    
    @scala.inline
    def setRoutes(value: Hash[String]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    
    @scala.inline
    def setServeStaticOptions(value: ServeStaticOptions[ServerResponse]): Self = this.set("serveStaticOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServeStaticOptions: Self = this.set("serveStaticOptions", js.undefined)
  }
}
