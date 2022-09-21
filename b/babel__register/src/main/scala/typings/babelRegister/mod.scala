package typings.babelRegister

import typings.babelCore.mod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opts: RegisterOptions): Unit = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@babel/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RegisterOptions
    extends StObject
       with TransformOptions {
    
    /**
      * Setting this to false will disable the cache.
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting this will remove the currently hooked extensions of `.es6`, `.es`,
      * `.jsx`, `.mjs` and `.js` so you'll have to add them back if you want them
      * to be used again.
      */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object RegisterOptions {
    
    inline def apply(): RegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterOptions]
    }
    
    extension [Self <: RegisterOptions](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    }
  }
}
