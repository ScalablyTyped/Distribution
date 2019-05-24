package typings
package confLib.confMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
Simple config handling for your app or module.
*/
@JSImport("conf", JSImport.Namespace)
@js.native
/**
	@example
	```
	import Conf = require('conf');
	const config = new Conf();
	config.set('unicorn', '🦄');
	console.log(config.get('unicorn'));
	//=> '🦄'
	// Use dot-notation to access nested properties
	config.set('foo.bar', true);
	console.log(config.get('foo'));
	//=> {bar: true}
	config.delete('unicorn');
	console.log(config.get('unicorn'));
	//=> undefined
	```
	*/
class ^[T] () extends Conf[T] {
  def this(options: Options[T]) = this()
}

