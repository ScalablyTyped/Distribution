package typings
package bracesLib.bracesMod.bracesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Generate an "expanded" brace pattern (this option is unncessary with the `.expand` method, which does the same thing).
    *
    * ```js
    * console.log(braces('a/{b,c}/d', {expand: true}));
    * //=> [ 'a/b/d', 'a/c/d' ]
    * ```
    *
    * @default undefined
    */
  var expand: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Duplicates are removed by default. To keep duplicates, pass `{nodupes: false}` on the options
    *
    * @default true
    */
  var nodupes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enabled by default.
    *
    * ```js
    * console.log(braces('a/{b,c}/d'));
    * //=> [ 'a/(b|c)/d' ]
    * ```
    *
    * @default true
    */
  var optimize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * In regular expressions, quanitifiers can be used to specify how many times a token can be repeated. For example, `a{1,3}` will match the letter `a` one to three times.
    *
    * Unfortunately, regex quantifiers happen to share the same syntax as [Bash lists](#lists)
    *
    * The `quantifiers` option tells braces to detect when [regex quantifiers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp#quantifiers)
    * are defined in the given pattern, and not to try to expand them as lists.
    *
    * @default undefined
    *
    * @example
    * ```js
    * var braces = require('braces');
    * console.log(braces('a/b{1,3}/{x,y,z}'));
    * //=> [ 'a/b(1|3)/(x|y|z)' ]
    * console.log(braces('a/b{1,3}/{x,y,z}', {quantifiers: true}));
    * //=> [ 'a/b{1,3}/(x|y|z)' ]
    * console.log(braces('a/b{1,3}/{x,y,z}', {quantifiers: true, expand: true}));
    * //=> [ 'a/b{1,3}/x', 'a/b{1,3}/y', 'a/b{1,3}/z' ]
    * ```
    */
  var quantifiers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `braces.expand()` is used, or `options.expand` is true, brace patterns will automatically be [optimized](#optionsoptimize)
    * when the difference between the range minimum and range maximum exceeds the `rangeLimit`.
    * This is to prevent huge ranges from freezing your application.
    *
    * You can set this to any number, or change `options.rangeLimit` to `Inifinity` to disable this altogether.
    *
    * @default 250
    *
    * @example
    * ```js
    * // pattern exceeds the "rangeLimit", so it's optimized automatically
    * console.log(braces.expand('{1..1000}'));
    * //=> ['([1-9]|[1-9][0-9]{1,2}|1000)']
    *
    * // pattern does not exceed "rangeLimit", so it's NOT optimized
    * console.log(braces.expand('{1..100}'));
    * //=> ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11' ... '89', 90', '91', '92', '93', '94', '95', '96', '97', '98', '99', '100']
    * ```
    */
  var rangeLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Customize range expansion.
    *
    * ```js
    * var range = braces.expand('x{a..e}y', {
    *   transform: function(str) {
    *     return 'foo' + str;
    *   }
    * });
    *
    * console.log(range);
    * //=> [ 'xfooay', 'xfooby', 'xfoocy', 'xfoody', 'xfooey' ]
    * ```
    *
    * @default undefined
    */
  var transform: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * Strip backslashes that were used for escaping from the result.
    *
    * @default undefined
    */
  var unescape: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    expand: js.UndefOr[scala.Boolean] = js.undefined,
    nodupes: js.UndefOr[scala.Boolean] = js.undefined,
    optimize: js.UndefOr[scala.Boolean] = js.undefined,
    quantifiers: js.UndefOr[scala.Boolean] = js.undefined,
    rangeLimit: scala.Int | scala.Double = null,
    transform: /* str */ java.lang.String => java.lang.String = null,
    unescape: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (!js.isUndefined(nodupes)) __obj.updateDynamic("nodupes")(nodupes)
    if (!js.isUndefined(optimize)) __obj.updateDynamic("optimize")(optimize)
    if (!js.isUndefined(quantifiers)) __obj.updateDynamic("quantifiers")(quantifiers)
    if (rangeLimit != null) __obj.updateDynamic("rangeLimit")(rangeLimit.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(unescape)) __obj.updateDynamic("unescape")(unescape)
    __obj.asInstanceOf[Options]
  }
}

