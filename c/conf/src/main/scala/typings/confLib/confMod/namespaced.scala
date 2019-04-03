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
class namespaced[T] () extends Conf[T] {
  def this(options: confLib.confMod.ConfNs.Options[T]) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[js.Tuple2[java.lang.String, T]]] = js.native
}

