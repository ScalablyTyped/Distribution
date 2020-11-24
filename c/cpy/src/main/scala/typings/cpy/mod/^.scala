package typings.cpy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cpy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Copy files.
  @param source - Files to copy. If any of the files do not exist, an error will be thrown (does not apply to globs).
  @param destination - Destination directory.
  @param options - In addition to the options defined here, options are passed to [globby](https://github.com/sindresorhus/globby#options).
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
