package typings.braces.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Generate an "expanded" brace pattern (alternatively you can use the `braces.expand()` method).
    *
    * @default undefined
    * @example
    * console.log(braces('a/{b,c}/d', { expand: true }));
    * //=> [ 'a/b/d', 'a/c/d' ]
    */
  var expand: js.UndefOr[Boolean] = js.native
  /**
    * Limit the length of the input string. Useful when the input string is generated or your application allows
    * users to pass a string, et cetera.
    *
    * @default 65536
    * @example
    * console.log(braces('a/{b,c}/d', { maxLength: 3 }));
    * //=> throws an error
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * Remove duplicates from the returned array.
    *
    * @default undefined
    */
  var nodupes: js.UndefOr[Boolean] = js.native
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
  var quantifiers: js.UndefOr[Boolean] = js.native
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
  var rangeLimit: js.UndefOr[Double] = js.native
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
  var transform: js.UndefOr[Transform] = js.native
  /**
    * Strip backslashes that were used for escaping from the result.
    *
    * @default undefined
    */
  var unescape: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setNodupes(value: Boolean): Self = this.set("nodupes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodupes: Self = this.set("nodupes", js.undefined)
    @scala.inline
    def setQuantifiers(value: Boolean): Self = this.set("quantifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantifiers: Self = this.set("quantifiers", js.undefined)
    @scala.inline
    def setRangeLimit(value: Double): Self = this.set("rangeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeLimit: Self = this.set("rangeLimit", js.undefined)
    @scala.inline
    def setTransform(value: /* str */ String => String): Self = this.set("transform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setUnescape(value: Boolean): Self = this.set("unescape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnescape: Self = this.set("unescape", js.undefined)
  }
  
}

