package typings
package cpyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Copy files.
  	@param files - Files to copy.
  	@param destination - Destination directory.
  	@param options - Options are passed to [cp-file](https://github.com/sindresorhus/cp-file#options) and [globby](https://github.com/sindresorhus/globby#options).
  	@example
  	```
  	import cpy = require('cpy');
  	(async () => {
  		await cpy(['src/ *.png', '!src/goat.png'], 'dist');
  		console.log('Files copied!');
  	})();
  	```
  	*/
  def apply(files: java.lang.String, destination: java.lang.String): js.Promise[scala.Unit] with cpyLib.cpyMod.ProgressEmitter = js.native
  def apply(files: java.lang.String, destination: java.lang.String, options: cpyLib.cpyMod.Options): js.Promise[scala.Unit] with cpyLib.cpyMod.ProgressEmitter = js.native
  def apply(files: js.Array[java.lang.String], destination: java.lang.String): js.Promise[scala.Unit] with cpyLib.cpyMod.ProgressEmitter = js.native
  def apply(files: js.Array[java.lang.String], destination: java.lang.String, options: cpyLib.cpyMod.Options): js.Promise[scala.Unit] with cpyLib.cpyMod.ProgressEmitter = js.native
}

