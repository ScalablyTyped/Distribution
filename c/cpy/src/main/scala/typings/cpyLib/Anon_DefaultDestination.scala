package typings
package cpyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultDestination extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function cpy(
  // 	files: string | ReadonlyArray<string>,
  // 	destination: string,
  // 	options?: cpy.Options
  // ): Promise<void> & cpy.ProgressEmitter;
  // export = cpy;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  def apply(files: java.lang.String, destination: java.lang.String): js.Promise[scala.Unit] with cpyLib.cpyMod.cpyNs.ProgressEmitter = js.native
  def apply(files: java.lang.String, destination: java.lang.String, options: cpyLib.cpyMod.cpyNs.Options): js.Promise[scala.Unit] with cpyLib.cpyMod.cpyNs.ProgressEmitter = js.native
  def apply(files: js.Array[java.lang.String], destination: java.lang.String): js.Promise[scala.Unit] with cpyLib.cpyMod.cpyNs.ProgressEmitter = js.native
  def apply(
    files: js.Array[java.lang.String],
    destination: java.lang.String,
    options: cpyLib.cpyMod.cpyNs.Options
  ): js.Promise[scala.Unit] with cpyLib.cpyMod.cpyNs.ProgressEmitter = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function cpy(
  // 	files: string | ReadonlyArray<string>,
  // 	destination: string,
  // 	options?: cpy.Options
  // ): Promise<void> & cpy.ProgressEmitter;
  // export = cpy;
  def default(files: java.lang.String, destination: java.lang.String): js.Promise[scala.Unit] with cpyLib.cpyMod.cpyNs.ProgressEmitter = js.native
  def default(files: java.lang.String, destination: java.lang.String, options: cpyLib.cpyMod.cpyNs.Options): js.Promise[scala.Unit] with cpyLib.cpyMod.cpyNs.ProgressEmitter = js.native
  def default(files: js.Array[java.lang.String], destination: java.lang.String): js.Promise[scala.Unit] with cpyLib.cpyMod.cpyNs.ProgressEmitter = js.native
  def default(
    files: js.Array[java.lang.String],
    destination: java.lang.String,
    options: cpyLib.cpyMod.cpyNs.Options
  ): js.Promise[scala.Unit] with cpyLib.cpyMod.cpyNs.ProgressEmitter = js.native
}

