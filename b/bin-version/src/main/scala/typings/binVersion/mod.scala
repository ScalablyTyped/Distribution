package typings.binVersion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Get the version of a binary in [semver](https://github.com/npm/node-semver) format.
  @param binary - The name of or path to the binary to get the version from.
  @returns The version of the `binary`.
  @example
  ```
  import binVersion = require('bin-version');
  (async () => {
  	// $ curl --version
  	// curl 7.30.0 (x86_64-apple-darwin13.0)
  	console.log(await binVersion('curl'));
  	//=> '7.30.0'
  	// $ openssl version
  	// OpenSSL 1.0.2d 9 Jul 2015
  	console.log(await binVersion('openssl'));
  	//=> '1.0.2'
  	console.log(await binVersion('openssl', {args: ['version']}));
  	//=> '1.0.2'
  })();
  ```
  */
  inline def apply(binary: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(binary.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(binary: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(binary.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("bin-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    }
  }
}
