package typings
package decamelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
}

