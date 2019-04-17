package typings
package dargsLib.dargsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Maps keys in `input` to an aliased name. Matching keys are converted to arguments with a single dash (`-`) in front of the aliased key and the value in a separate array item. Keys are still affected by `includes` and `excludes`.
  		*/
  var aliases: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
  		By default, camelCased keys will be hyphenated. Enabling this will bypass the conversion process.
  		@default false
  		@example
  		```
  		console.log(dargs({fooBar: 'baz'}));
  		//=> ['--foo-bar', 'baz']
  		console.log(dargs({fooBar: 'baz'}, {allowCamelCase: true}));
  		//=> ['--fooBar', 'baz']
  		```
  		*/
  var allowCamelCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Keys or regex of keys to exclude. Takes precedence over `includes`.
  		*/
  var excludes: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  /**
  		Exclude `false` values. Can be useful when dealing with strict argument parsers that throw on unknown arguments like `--no-foo`.
  		@default false
  		*/
  var ignoreFalse: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Keys or regex of keys to include.
  		*/
  var includes: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  /**
  		Setting this to `false` makes it return the key and value as separate array items instead of using a `=` separator in one item. This can be useful for tools that doesn't support `--foo=bar` style flags.
  		@default true
  		@example
  		```
  		console.log(dargs({foo: 'bar'}, {useEquals: false}));
  		// [
  		// 	'--foo', 'bar'
  		// ]
  		```
  		*/
  var useEquals: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    aliases: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    allowCamelCase: js.UndefOr[scala.Boolean] = js.undefined,
    excludes: js.Array[java.lang.String | stdLib.RegExp] = null,
    ignoreFalse: js.UndefOr[scala.Boolean] = js.undefined,
    includes: js.Array[java.lang.String | stdLib.RegExp] = null,
    useEquals: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (!js.isUndefined(allowCamelCase)) __obj.updateDynamic("allowCamelCase")(allowCamelCase)
    if (excludes != null) __obj.updateDynamic("excludes")(excludes)
    if (!js.isUndefined(ignoreFalse)) __obj.updateDynamic("ignoreFalse")(ignoreFalse)
    if (includes != null) __obj.updateDynamic("includes")(includes)
    if (!js.isUndefined(useEquals)) __obj.updateDynamic("useEquals")(useEquals)
    __obj.asInstanceOf[Options]
  }
}

