package typings
package camelcaseDashKeysLib.camelcaseDashKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camelcase-keys", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Convert object keys to camelCase using [`camelcase`](https://github.com/sindresorhus/camelcase).
  @param input - Object or array of objects to camelCase.
  @example
  ```
  import camelcaseKeys = require('camelcase-keys');
  // Convert an object
  camelcaseKeys({'foo-bar': true});
  //=> {fooBar: true}
  // Convert an array of objects
  camelcaseKeys([{'foo-bar': true}, {'bar-foo': false}]);
  //=> [{fooBar: true}, {barFoo: false}]
  camelcaseKeys({'foo-bar': true, nested: {unicorn_rainbow: true}}, {deep: true});
  //=> {fooBar: true, nested: {unicornRainbow: true}}
  import minimist = require('minimist');
  const argv = minimist(process.argv.slice(2));
  //=> {_: [], 'foo-bar': true}
  camelcaseKeys(argv);
  //=> {_: [], fooBar: true}
  ```
  */
  def apply(input: js.Any): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def apply(input: js.Any, options: Options): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

