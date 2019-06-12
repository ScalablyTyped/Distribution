package typings
package cpyLib

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
  def apply(source: java.lang.String, destination: java.lang.String): js.Promise[js.Array[java.lang.String]] with cpyLib.cpyMod.ProgressEmitter = js.native
  def apply(source: java.lang.String, destination: java.lang.String, options: cpyLib.cpyMod.Options): js.Promise[js.Array[java.lang.String]] with cpyLib.cpyMod.ProgressEmitter = js.native
  def apply(source: js.Array[java.lang.String], destination: java.lang.String): js.Promise[js.Array[java.lang.String]] with cpyLib.cpyMod.ProgressEmitter = js.native
  def apply(source: js.Array[java.lang.String], destination: java.lang.String, options: cpyLib.cpyMod.Options): js.Promise[js.Array[java.lang.String]] with cpyLib.cpyMod.ProgressEmitter = js.native
}

