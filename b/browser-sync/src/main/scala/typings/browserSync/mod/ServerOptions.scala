package typings.browserSync.mod

import typings.node.httpMod.ServerResponse
import typings.serveStatic.mod.ServeStaticOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions extends StObject {
  
  /** set base directory */
  var baseDir: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** enable directory listing */
  var directory: js.UndefOr[Boolean] = js.undefined
  
  /** set index filename */
  var index: js.UndefOr[String] = js.undefined
  
  /** configure custom middleware */
  var middleware: js.UndefOr[js.Array[MiddlewareHandler | PerRouteMiddleware]] = js.undefined
  
  /**
    * key-value object hash, where the key is the url to match,
    * and the value is the folder to serve (relative to your working directory)
    */
  var routes: js.UndefOr[Hash[String]] = js.undefined
  
  var serveStaticOptions: js.UndefOr[ServeStaticOptions[ServerResponse]] = js.undefined
}
object ServerOptions {
  
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseDir(value: String | js.Array[String]): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
    
    @scala.inline
    def setBaseDirVarargs(value: String*): Self = StObject.set(x, "baseDir", js.Array(value :_*))
    
    @scala.inline
    def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setMiddleware(value: js.Array[MiddlewareHandler | PerRouteMiddleware]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    @scala.inline
    def setMiddlewareVarargs(value: (MiddlewareHandler | PerRouteMiddleware)*): Self = StObject.set(x, "middleware", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: Hash[String]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    
    @scala.inline
    def setServeStaticOptions(value: ServeStaticOptions[ServerResponse]): Self = StObject.set(x, "serveStaticOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServeStaticOptionsUndefined: Self = StObject.set(x, "serveStaticOptions", js.undefined)
  }
}
