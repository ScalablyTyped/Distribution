package typings.cpy

import typings.cpy.cpyMod.Options
import typings.cpy.cpyMod.ProgressEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Copy files.
  	@param source - Files to copy.
  	@param destination - Destination directory.
  	@param options - Options are passed to [cp-file](https://github.com/sindresorhus/cp-file#options) and [globby](https://github.com/sindresorhus/globby#options).
  	@example
  	```
  	import cpy = require('cpy');
  	(async () => {
  		await cpy(['source/ *.png', '!source/goat.png'], 'destination');
  		console.log('Files copied!');
  	})();
  	```
  	*/
  def apply(source: String, destination: String): js.Promise[js.Array[String]] with ProgressEmitter = js.native
  def apply(source: String, destination: String, options: Options): js.Promise[js.Array[String]] with ProgressEmitter = js.native
  def apply(source: js.Array[String], destination: String): js.Promise[js.Array[String]] with ProgressEmitter = js.native
  def apply(source: js.Array[String], destination: String, options: Options): js.Promise[js.Array[String]] with ProgressEmitter = js.native
}

