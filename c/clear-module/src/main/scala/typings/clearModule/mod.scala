package typings.clearModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Clear a module from the [cache](https://nodejs.org/api/modules.html#modules_caching).
  	@param moduleId - What you would use with `require()`.
  	@example
  	```
  	// foo.ts
  	let i = 0;
  	module.exports = () => ++i;
  	// test.ts
  	import clearModule = require('clear-module');
  	require('./foo')();
  	//=> 1
  	require('./foo')();
  	//=> 2
  	clearModule('./foo');
  	require('./foo')();
  	//=> 1
  	```
  	*/
  inline def apply(moduleId: String): Unit = ^.asInstanceOf[js.Dynamic].apply(moduleId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("clear-module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Clear all modules from the cache.
  	*/
  inline def all(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[Unit]
  
  /**
  	Clear all matching modules from the cache.
  	@param regex - Regex to match against the module IDs.
  	*/
  inline def `match`(regex: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(regex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  	Clear a single module from the cache non-recursively. No parent or children modules will be affected.
  	This is mostly only useful if you use singletons, where you would want to clear a specific module without causing any side effects.
  	@param moduleId - What you would use with `require()`.
  	*/
  inline def single(moduleId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(moduleId.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
