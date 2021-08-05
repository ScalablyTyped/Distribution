package typings.blocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Server extends StObject {
  
  /**
    * Caches pages result instead of executing them each time.
    * Disabling cache could impact performance.
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The port at which your application will be run
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * The folder where your application files like .html; .js and .css are going to be.
    * The value is passed to express.static() middleware.
    */
  var static: js.UndefOr[String] = js.undefined
  
  /**
    * Provide an express middleware function or an array of middleware functions.
    * Use: [compression(); bodyParser()]
    */
  var use: js.UndefOr[js.Any] = js.undefined
}
object Server {
  
  inline def apply(): Server = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Server]
  }
  
  extension [Self <: Server](x: Self) {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setStatic(value: String): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    inline def setUse(value: js.Any): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
  }
}
