package typings
package delLib.delMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("del", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Delete files and directories using glob patterns.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	- [Pattern examples with expected matches](https://github.com/sindresorhus/multimatch/blob/master/test/test.js)
  	- [Quick globbing pattern overview](https://github.com/sindresorhus/multimatch#globbing-patterns)
  	@param options - You can specify any of the [`globby` options](https://github.com/sindresorhus/globby#options) in addition to the `del` options. In constrast to the `globby` defaults, `expandDirectories`, `onlyFiles`, and `followSymbolicLinks` are `false` by default.
  	@returns The deleted paths.
  	@example
  	```
  	import del = require('del');
  	(async () => {
  		const deletedPaths = await del(['temp/ *.js', '!temp/unicorn.js']);
  		console.log('Deleted files and directories:\n', deletedPaths.join('\n'));
  	})();
  	```
  	*/
  def apply(patterns: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: java.lang.String, options: Options): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: js.Array[java.lang.String], options: Options): js.Promise[js.Array[java.lang.String]] = js.native
  /**
  	Synchronously delete files and directories using glob patterns.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	- [Pattern examples with expected matches](https://github.com/sindresorhus/multimatch/blob/master/test/test.js)
  	- [Quick globbing pattern overview](https://github.com/sindresorhus/multimatch#globbing-patterns)
  	@param options - You can specify any of the [`globby` options](https://github.com/sindresorhus/globby#options) in addition to the `del` options. In constrast to the `globby` defaults, `expandDirectories`, `onlyFiles`, and `followSymbolicLinks` are `false` by default.
  	@returns The deleted paths.
  	*/
  def sync(patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def sync(patterns: java.lang.String, options: Options): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String], options: Options): js.Array[java.lang.String] = js.native
}

