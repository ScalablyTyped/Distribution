package typings.cleanStack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clean-stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.UndefOr[String] */](stack: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(stack.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def default[T /* <: js.UndefOr[String] */](stack: T, options: Options): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(stack.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait Options extends StObject {
    
    /**
    	Remove the given base path from stack trace file paths, effectively turning absolute paths into relative ones.
    	Example with `'/Users/sindresorhus/dev/clean-stack/'` as `basePath`:
    	`/Users/sindresorhus/dev/clean-stack/unicorn.js:2:15` → `unicorn.js:2:15`
    	*/
    val basePath: js.UndefOr[String] = js.undefined
    
    /**
    	Remove the stack lines where the given function returns `false`. The function receives the path part of the stack line.
    	@example
    	```
    	import cleanStack from 'clean-stack';
    	const error = new Error('Missing unicorn');
    	console.log(cleanStack(error.stack));
    	// Error: Missing unicorn
    	//     at Object.<anonymous> (/Users/sindresorhus/dev/clean-stack/unicorn.js:2:15)
    	//     at Object.<anonymous> (/Users/sindresorhus/dev/clean-stack/omit-me.js:1:16)
    	const pathFilter = path => !/omit-me/.test(path);
    	console.log(cleanStack(error.stack, {pathFilter}));
    	// Error: Missing unicorn
    	//     at Object.<anonymous> (/Users/sindresorhus/dev/clean-stack/unicorn.js:2:15)
    	```
    	*/
    val pathFilter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
    
    /**
    	Prettify the file paths in the stack:
    	`/Users/sindresorhus/dev/clean-stack/unicorn.js:2:15` → `~/dev/clean-stack/unicorn.js:2:15`
    	@default false
    	*/
    val pretty: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setPathFilter(value: /* path */ String => Boolean): Self = StObject.set(x, "pathFilter", js.Any.fromFunction1(value))
      
      inline def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    }
  }
}
