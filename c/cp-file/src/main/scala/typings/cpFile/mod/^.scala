package typings.cpFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cp-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply(source: String, destination: String): js.Promise[Unit] with ProgressEmitter = js.native
  def apply(source: String, destination: String, options: Options): js.Promise[Unit] with ProgressEmitter = js.native
  /**
  	Copy a file synchronously.
  	@param source - File you want to copy.
  	@param destination - Where you want the file copied.
  	*/
  def sync(source: String, destination: String): Unit = js.native
  def sync(source: String, destination: String, options: Options): Unit = js.native
}

