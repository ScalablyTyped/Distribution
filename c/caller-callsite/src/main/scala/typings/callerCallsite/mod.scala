package typings.callerCallsite

import typings.callsites.mod.CallSite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("caller-callsite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[CallSite] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[CallSite]]
  inline def default(options: Options): js.UndefOr[CallSite] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CallSite]]
  
  trait Options extends StObject {
    
    /**
    	The callsite depth, meaning how many levels we follow back on the stack trace.
    	@default 0
    	@example
    	```
    	// foo.ts
    	import callerCallsite from 'caller-callsite';
    	export default function foo() {
    		console.log(callerCallsite().getFileName());
    		//=> '/Users/sindresorhus/dev/unicorn/foobar.ts'
    		console.log(callerCallsite({depth: 1}).getFileName());
    		//=> '/Users/sindresorhus/dev/unicorn/bar.ts'
    		console.log(callerCallsite({depth: 2}).getFileName());
    		//=> '/Users/sindresorhus/dev/unicorn/foo.ts'
    	}
    	// bar.ts
    	import foo from './foo.js';
    	export default function bar() {
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
