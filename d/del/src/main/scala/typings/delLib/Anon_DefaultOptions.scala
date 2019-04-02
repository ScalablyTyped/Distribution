package typings
package delLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultOptions extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Delete files and folders using glob patterns.
  	@param patterns - See supported minimatch [patterns](https://github.com/isaacs/minimatch#usage).
  	- [Pattern examples with expected matches](https://github.com/sindresorhus/multimatch/blob/master/test/test.js)
  	- [Quick globbing pattern overview](https://github.com/sindresorhus/multimatch#globbing-patterns)
  	@param options - See the [`glob` options](https://github.com/isaacs/node-glob#options).
  	@returns A promise for an array of deleted paths.
  	@example
  	```
  	import del = require('del');
  	(async () => {
  		const deletedPaths = await del(['tmp/ *.js', '!tmp/unicorn.js']);
  		console.log('Deleted files and folders:\n', deletedPaths.join('\n'));
  	})();
  	```
  	*/
  def apply(patterns: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: java.lang.String, options: delLib.delMod.delNs.Options): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: js.Array[java.lang.String], options: delLib.delMod.delNs.Options): js.Promise[js.Array[java.lang.String]] = js.native
  /**
  	Delete files and folders using glob patterns.
  	@param patterns - See supported minimatch [patterns](https://github.com/isaacs/minimatch#usage).
  	- [Pattern examples with expected matches](https://github.com/sindresorhus/multimatch/blob/master/test/test.js)
  	- [Quick globbing pattern overview](https://github.com/sindresorhus/multimatch#globbing-patterns)
  	@param options - See the [`glob` options](https://github.com/isaacs/node-glob#options).
  	@returns A promise for an array of deleted paths.
  	@example
  	```
  	import del = require('del');
  	(async () => {
  		const deletedPaths = await del(['tmp/ *.js', '!tmp/unicorn.js']);
  		console.log('Deleted files and folders:\n', deletedPaths.join('\n'));
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release
  def default(patterns: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def default(patterns: java.lang.String, options: delLib.delMod.delNs.Options): js.Promise[js.Array[java.lang.String]] = js.native
  def default(patterns: js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def default(patterns: js.Array[java.lang.String], options: delLib.delMod.delNs.Options): js.Promise[js.Array[java.lang.String]] = js.native
  /**
  	Synchronously delete files and folders using glob patterns.
  	@param patterns - See supported minimatch [patterns](https://github.com/isaacs/minimatch#usage).
  	- [Pattern examples with expected matches](https://github.com/sindresorhus/multimatch/blob/master/test/test.js)
  	- [Quick globbing pattern overview](https://github.com/sindresorhus/multimatch#globbing-patterns)
  	@param options - See the [`glob` options](https://github.com/isaacs/node-glob#options).
  	@returns An array of deleted paths.
  	*/
  def sync(patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def sync(patterns: java.lang.String, options: delLib.delMod.delNs.Options): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String], options: delLib.delMod.delNs.Options): js.Array[java.lang.String] = js.native
}

