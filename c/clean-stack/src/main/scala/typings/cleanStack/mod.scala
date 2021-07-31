package typings.cleanStack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Clean up error stack traces. Removes the mostly unhelpful internal Node.js entries.
  @param stack - The `stack` property of an `Error`.
  @example
  ```
  import cleanStack = require('clean-stack');
  const error = new Error('Missing unicorn');
  console.log(error.stack);
  // Error: Missing unicorn
  //     at Object.<anonymous> (/Users/sindresorhus/dev/clean-stack/unicorn.js:2:15)
  //     at Module._compile (module.js:409:26)
  //     at Object.Module._extensions..js (module.js:416:10)
  //     at Module.load (module.js:343:32)
  //     at Function.Module._load (module.js:300:12)
  //     at Function.Module.runMain (module.js:441:10)
  //     at startup (node.js:139:18)
  console.log(cleanStack(error.stack));
  // Error: Missing unicorn
  //     at Object.<anonymous> (/Users/sindresorhus/dev/clean-stack/unicorn.js:2:15)
  ```
  */
  @scala.inline
  def apply(stack: String): String = ^.asInstanceOf[js.Dynamic].apply(stack.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(stack: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(stack.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("clean-stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Remove the given base path from stack trace file paths, effectively turning absolute paths into relative ones.
    		Example with `'/Users/sindresorhus/dev/clean-stack/'` as `basePath`:
    		`/Users/sindresorhus/dev/clean-stack/unicorn.js:2:15` → `unicorn.js:2:15`
    		*/
    val basePath: js.UndefOr[String] = js.undefined
    
    /**
    		Prettify the file paths in the stack:
    		`/Users/sindresorhus/dev/clean-stack/unicorn.js:2:15` → `~/dev/clean-stack/unicorn.js:2:15`
    		@default false
    		*/
    val pretty: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    }
  }
}
