package typings.camelcaseDashKeys.camelcaseDashKeysMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camelcase-keys", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Convert object keys to camel case using [`camelcase`](https://github.com/sindresorhus/camelcase).
  @param input - Object or array of objects to camel-case.
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
  def apply(input: js.Array[StringDictionary[_]]): js.Array[StringDictionary[_]] = js.native
  def apply(input: js.Array[StringDictionary[_]], options: Options): js.Array[StringDictionary[_]] = js.native
  def apply(input: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  def apply(input: StringDictionary[js.Any], options: Options): StringDictionary[js.Any] = js.native
}

