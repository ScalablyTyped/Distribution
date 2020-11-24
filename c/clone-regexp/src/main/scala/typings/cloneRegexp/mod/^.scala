package typings.cloneRegexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("clone-regexp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Clone and modify a [RegExp](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp) instance.
  @param regexp - Regex to clone.
  @example
  ```
  import cloneRegexp = require('clone-regexp');
  const regex = /[a-z]/gi;
  cloneRegexp(regex);
  //=> /[a-z]/gi
  cloneRegexp(regex) === regex;
  //=> false
  cloneRegexp(regex, {global: false});
  //=> /[a-z]/i
  cloneRegexp(regex, {multiline: true});
  //=> /[a-z]/gim
  cloneRegexp(regex, {source: 'unicorn'});
  //=> /unicorn/gi
  ```
  */
  def apply(regexp: RegExp): RegExp = js.native
  def apply(regexp: RegExp, options: Options): RegExp = js.native
}
