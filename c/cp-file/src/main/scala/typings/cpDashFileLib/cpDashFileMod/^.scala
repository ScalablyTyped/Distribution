package typings
package cpDashFileLib.cpDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cp-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: cpDashFileLib.Anon_Default = js.native
  /**
  	Copy a file.
  	@param source - File you want to copy.
  	@param destination - Where you want the file copied.
  	@returns A `Promise` that resolves when the file is copied.
  	@example
  	```
  	import cpFile = require('cp-file');
  	(async () => {
  		await cpFile('source/unicorn.png', 'destination/unicorn.png');
  		console.log('File copied');
  	})();
  	```
  	*/
  def apply(source: java.lang.String, destination: java.lang.String): js.Promise[scala.Unit] with ProgressEmitter = js.native
  def apply(source: java.lang.String, destination: java.lang.String, options: Options): js.Promise[scala.Unit] with ProgressEmitter = js.native
  /**
  	Copy a file.
  	@param source - File you want to copy.
  	@param destination - Where you want the file copied.
  	@returns A `Promise` that resolves when the file is copied.
  	@example
  	```
  	import cpFile = require('cp-file');
  	(async () => {
  		await cpFile('source/unicorn.png', 'destination/unicorn.png');
  		console.log('File copied');
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release
  def default(source: java.lang.String, destination: java.lang.String): js.Promise[scala.Unit] with ProgressEmitter = js.native
  def default(source: java.lang.String, destination: java.lang.String, options: Options): js.Promise[scala.Unit] with ProgressEmitter = js.native
  /**
  	Copy a file synchronously.
  	@param source - File you want to copy.
  	@param destination - Where you want the file copied.
  	*/
  def sync(source: java.lang.String, destination: java.lang.String): scala.Unit = js.native
  def sync(source: java.lang.String, destination: java.lang.String, options: Options): scala.Unit = js.native
}

