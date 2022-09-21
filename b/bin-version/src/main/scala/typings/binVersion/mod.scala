package typings.binVersion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bin-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(binary: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(binary.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(binary: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(binary.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait Options extends StObject {
    
    /**
    	The arguments to pass to `binary` so that it will print its version.
    	If not specified, predefined arguments will be used for known binaries, or `['--version']` and `['version']` arguments will be tried.
    	*/
    val args: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    }
  }
}
