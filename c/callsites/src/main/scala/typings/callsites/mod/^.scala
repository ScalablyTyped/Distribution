package typings.callsites.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("callsites", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Get callsites from the V8 stack trace API.
  	@returns An array of `CallSite` objects.
  	@example
  	```
  	import callsites = require('callsites');
  	function unicorn() {
  		console.log(callsites()[0].getFileName());
  		//=> '/Users/sindresorhus/dev/callsites/test.js'
  	}
  	unicorn();
  	```
  	*/
  def apply(): js.Array[CallSite] = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function callsites(): callsites.CallSite[];
  // export = callsites;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof callsites */ js.Any = js.native
}
