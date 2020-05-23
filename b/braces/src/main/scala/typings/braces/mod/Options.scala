package typings.braces.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Generate an "expanded" brace pattern (alternatively you can use the `braces.expand()` method).
    *
    * @default undefined
    * @example
    * console.log(braces('a/{b,c}/d', { expand: true }));
    * //=> [ 'a/b/d', 'a/c/d' ]
    */
  var expand: js.UndefOr[Boolean] = js.undefined
  /**
    * Limit the length of the input string. Useful when the input string is generated or your application allows
    * users to pass a string, et cetera.
    *
    * @default 65536
    * @example
    * console.log(braces('a/{b,c}/d', { maxLength: 3 }));
    * //=> throws an error
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * Remove duplicates from the returned array.
    *
    * @default undefined
    */
  var nodupes: js.UndefOr[Boolean] = js.undefined
  /**
    * In regular expressions, quanitifiers can be used to specify how many times a token can be repeated.
    * For example, `a{1,3}` will match the letter `a` one to three times.
    *
    * Unfortunately, regex quantifiers happen to share the same syntax as [Bash lists](#lists)
    *
    * The `quantifiers` option tells braces to detect when [regex quantifiers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp#quantifiers)
    * are defined in the given pattern, and not to try to expand them as lists.
    *
    * @default undefined
    * @example
    * const braces = require('braces');
    * console.log(braces('a/b{1,3}/{x,y,z}'));
    * //=> [ 'a/b(1|3)/(x|y|z)' ]
    * console.log(braces('a/b{1,3}/{x,y,z}', {quantifiers: true}));
    * //=> [ 'a/b{1,3}/(x|y|z)' ]
    * console.log(braces('a/b{1,3}/{x,y,z}', {quantifiers: true, expand: true}));
    * //=> [ 'a/b{1,3}/x', 'a/b{1,3}/y', 'a/b{1,3}/z' ]
    */
  var quantifiers: js.UndefOr[Boolean] = js.undefined
  /**
    * To prevent malicious patterns from being passed by users, an error is thrown when `braces.expand()`
    * is used or `options.expand` is true and the generated range will exceed the `rangeLimit`.
    *
    * You can customize `options.rangeLimit` or set it to `Infinity` to disable this altogether.
    *
    * @default 1000
    * @example
    * // pattern exceeds the "rangeLimit", so it's optimized automatically
    * console.log(braces.expand('{1..1000}'));
    * //=> ['([1-9]|[1-9][0-9]{1,2}|1000)']
    *
    * // pattern does not exceed "rangeLimit", so it's NOT optimized
    * console.log(braces.expand('{1..100}'));
    * //=> ['1', '2', '3', '4', '5', …, '100']
    */
  var rangeLimit: js.UndefOr[Double] = js.undefined
  /**
    * Customize range expansion.
    *
    * @default undefined
    * @example
    * const range = braces.expand('x{a..e}y', {
    *   transform: (str) => `foo/${str}`
    * });
    *
    * console.log(range);
    * //=> [ 'xfooay', 'xfooby', 'xfoocy', 'xfoody', 'xfooey' ]
    */
  var transform: js.UndefOr[Transform] = js.undefined
  /**
    * Strip backslashes that were used for escaping from the result.
    *
    * @default undefined
    */
  var unescape: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    expand: js.UndefOr[Boolean] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    nodupes: js.UndefOr[Boolean] = js.undefined,
    quantifiers: js.UndefOr[Boolean] = js.undefined,
    rangeLimit: js.UndefOr[Double] = js.undefined,
    transform: /* str */ String => String = null,
    unescape: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodupes)) __obj.updateDynamic("nodupes")(nodupes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantifiers)) __obj.updateDynamic("quantifiers")(quantifiers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeLimit)) __obj.updateDynamic("rangeLimit")(rangeLimit.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(unescape)) __obj.updateDynamic("unescape")(unescape.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

