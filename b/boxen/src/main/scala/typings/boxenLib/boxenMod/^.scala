package typings
package boxenLib.boxenMod

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
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: boxenLib.Anon_BorderStyle = js.native
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
  def apply(text: java.lang.String, options: Options): java.lang.String = js.native
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
  // TODO: Remove this for the next major release
  def default(text: java.lang.String): java.lang.String = js.native
  def default(text: java.lang.String, options: Options): java.lang.String = js.native
}

