package typings.cpy.cpyMod

import typings.cpy.Anon_Default
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
  var default_Original: Anon_Default = js.native
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
  def default(source: String, destination: String): js.Promise[js.Array[String]] with ProgressEmitter = js.native
  def default(source: String, destination: String, options: Options): js.Promise[js.Array[String]] with ProgressEmitter = js.native
  def default(source: js.Array[String], destination: String): js.Promise[js.Array[String]] with ProgressEmitter = js.native
  def default(source: js.Array[String], destination: String, options: Options): js.Promise[js.Array[String]] with ProgressEmitter = js.native
}

