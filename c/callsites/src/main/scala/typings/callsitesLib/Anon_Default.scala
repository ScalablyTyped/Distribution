package typings
package callsitesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
  def apply(): js.Array[callsitesLib.callsitesMod.CallSite] = js.native
}

