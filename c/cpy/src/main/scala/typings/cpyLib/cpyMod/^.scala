package typings
package cpyLib.cpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cpy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function cpy(
  // 	source: string | ReadonlyArray<string>,
  // 	destination: string,
  // 	options?: cpy.Options
  // ): Promise<void> & cpy.ProgressEmitter;
  // export = cpy;
  @JSName("default")
  var default_Original: cpyLib.Anon_Default = js.native
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
  def apply(source: java.lang.String, destination: java.lang.String): js.Promise[js.Array[java.lang.String]] with ProgressEmitter = js.native
  def apply(source: java.lang.String, destination: java.lang.String, options: Options): js.Promise[js.Array[java.lang.String]] with ProgressEmitter = js.native
  def apply(source: js.Array[java.lang.String], destination: java.lang.String): js.Promise[js.Array[java.lang.String]] with ProgressEmitter = js.native
  def apply(source: js.Array[java.lang.String], destination: java.lang.String, options: Options): js.Promise[js.Array[java.lang.String]] with ProgressEmitter = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function cpy(
  // 	source: string | ReadonlyArray<string>,
  // 	destination: string,
  // 	options?: cpy.Options
  // ): Promise<void> & cpy.ProgressEmitter;
  // export = cpy;
  def default(source: java.lang.String, destination: java.lang.String): js.Promise[js.Array[java.lang.String]] with ProgressEmitter = js.native
  def default(source: java.lang.String, destination: java.lang.String, options: Options): js.Promise[js.Array[java.lang.String]] with ProgressEmitter = js.native
  def default(source: js.Array[java.lang.String], destination: java.lang.String): js.Promise[js.Array[java.lang.String]] with ProgressEmitter = js.native
  def default(source: js.Array[java.lang.String], destination: java.lang.String, options: Options): js.Promise[js.Array[java.lang.String]] with ProgressEmitter = js.native
}

