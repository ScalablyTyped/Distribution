package typings.callerPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("caller-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[String]]
  inline def default(options: Options): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  trait Options extends StObject {
    
    /**
    	The caller path depth, meaning how many levels we follow back on the stack trace.
    	@default 0
    	@example
    	```
    	// foo.ts
    	import callerPath from 'caller-path';
    	export default function foo() {
    		console.log(callerPath());
    		//=> '/Users/sindresorhus/dev/unicorn/foobar.ts'
    		console.log(callerPath({depth: 1}));
    		//=> '/Users/sindresorhus/dev/unicorn/bar.ts'
    		console.log(callerPath({depth: 2}));
    		//=> '/Users/sindresorhus/dev/unicorn/foo.ts'
    	}
    	// bar.ts
    	import foo from './foo.js';
    	export default function bar() => {
    		foo();
    	}
    	// foobar.ts
    	import bar from './bar.js';
    	bar();
    	```
    	*/
    val depth: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    }
  }
}
