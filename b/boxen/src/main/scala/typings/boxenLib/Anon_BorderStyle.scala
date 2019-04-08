package typings
package boxenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BorderStyle extends js.Object {
  /**
  	Creates a box in the terminal.
  	@param text - The text inside the box.
  	@returns The box.
  	@example
  	```
  	import boxen = require('boxen');
  	console.log(boxen('unicorn', {padding: 1}));
  	// ┌─────────────┐
  	// │             │
  	// │   unicorn   │
  	// │             │
  	// └─────────────┘
  	console.log(boxen('unicorn', {padding: 1, margin: 1, borderStyle: 'double'}));
  	//
  	// ╔═════════════╗
  	// ║             ║
  	// ║   unicorn   ║
  	// ║             ║
  	// ╚═════════════╝
  	//
  	```
  	*/
  def apply(text: java.lang.String): java.lang.String = js.native
  def apply(text: java.lang.String, options: boxenLib.boxenMod.boxenNs.Options): java.lang.String = js.native
}

