package typings.conf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
Simple config handling for your app or module.
*/
@JSImport("conf", JSImport.Namespace)
@js.native
/**
	Changes are written to disk atomically, so if the process crashes during a write, it will not corrupt the existing config.
	@example
	```
	import Conf = require('conf');
	type StoreType = {
		isRainbow: boolean,
		unicorn?: string
	}
	const config = new Conf<StoreType>({
		defaults: {
			isRainbow: true
		}
	});
	config.get('isRainbow');
	//=> true
	config.set('unicorn', '🦄');
	console.log(config.get('unicorn'));
	//=> '🦄'
	config.delete('unicorn');
	console.log(config.get('unicorn'));
	//=> undefined
	```
	*/
class ^[T] () extends Conf[T] {
  def this(options: Options[T]) = this()
}

