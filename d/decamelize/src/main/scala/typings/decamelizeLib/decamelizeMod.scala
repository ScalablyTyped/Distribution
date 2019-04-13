package typings
package decamelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decamelize", JSImport.Namespace)
@js.native
object decamelizeMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function decamelize(string: string, separator?: string): string;
  // export = decamelize;
  @JSName("default")
  var default_Original: decamelizeLib.Anon_Default = js.native
  /**
  	Convert a camelized string into a lowercased one with a custom separator: `unicornRainbow` → `unicorn_rainbow`.
  	@param string - The camelcase string to decamelize.
  	@param separator - The separator to use to put in between the words from `string`. Default: `'_'`.
  	@example
  	```
  	import decamelize = require('decamelize');
  	decamelize('unicornRainbow');
  	//=> 'unicorn_rainbow'
  	decamelize('unicornRainbow', '-');
  	//=> 'unicorn-rainbow'
  	```
  	*/
  def apply(string: java.lang.String): java.lang.String = js.native
  def apply(string: java.lang.String, separator: java.lang.String): java.lang.String = js.native
  /**
  	Convert a camelized string into a lowercased one with a custom separator: `unicornRainbow` → `unicorn_rainbow`.
  	@param string - The camelcase string to decamelize.
  	@param separator - The separator to use to put in between the words from `string`. Default: `'_'`.
  	@example
  	```
  	import decamelize = require('decamelize');
  	decamelize('unicornRainbow');
  	//=> 'unicorn_rainbow'
  	decamelize('unicornRainbow', '-');
  	//=> 'unicorn-rainbow'
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function decamelize(string: string, separator?: string): string;
  // export = decamelize;
  def default(string: java.lang.String): java.lang.String = js.native
  def default(string: java.lang.String, separator: java.lang.String): java.lang.String = js.native
}

