package typings.boxen.boxenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("boxen", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Border styles from [`cli-boxes`](https://github.com/sindresorhus/cli-boxes).
  	*/
  var BorderStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BorderStyle */ js.Any = js.native
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
  def apply(text: String): String = js.native
  def apply(text: String, options: Options): String = js.native
}

