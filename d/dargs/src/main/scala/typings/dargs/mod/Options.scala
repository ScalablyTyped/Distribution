package typings.dargs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Maps keys in `input` to an aliased name. Matching keys are converted to arguments with a single dash (`-`) in front of the aliased key and the value in a separate array item. Keys are still affected by `includes` and `excludes`.
  		*/
  var aliases: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
  		By default, camel-cased keys will be hyphenated. Enabling this will bypass the conversion process.
  		@default false
  		@example
  		```
  		import dargs = require('dargs');
  		console.log(dargs({fooBar: 'baz'}));
  		//=> ['--foo-bar', 'baz']
  		console.log(dargs({fooBar: 'baz'}, {allowCamelCase: true}));
  		//=> ['--fooBar', 'baz']
  		```
  		*/
  var allowCamelCase: js.UndefOr[Boolean] = js.undefined
  /**
  		Keys or regex of keys to exclude. Takes precedence over `includes`.
  		*/
  var excludes: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  /**
  		Exclude `false` values. Can be useful when dealing with strict argument parsers that throw on unknown arguments like `--no-foo`.
  		@default false
  		*/
  var ignoreFalse: js.UndefOr[Boolean] = js.undefined
  /**
  		Keys or regex of keys to include.
  		*/
  var includes: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  /**
  		Make a single character option key `{a: true}` become a short flag `-a` instead of `--a`.
  		@default true
  		@example
  		```
  		import dargs = require('dargs');
  		console.log(dargs({a: true}));
  		//=> ['-a']
  		console.log(dargs({a: true}, {shortFlag: false}));
  		//=> ['--a']
  		```
  		*/
  var shortFlag: js.UndefOr[Boolean] = js.undefined
  /**
  		Setting this to `false` makes it return the key and value as separate array items instead of using a `=` separator in one item. This can be useful for tools that doesn't support `--foo=bar` style flags.
  		@default true
  		@example
  		```
  		import dargs = require('dargs');
  		console.log(dargs({foo: 'bar'}, {useEquals: false}));
  		// [
  		// 	'--foo', 'bar'
  		// ]
  		```
  		*/
  var useEquals: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    aliases: StringDictionary[String] = null,
    allowCamelCase: js.UndefOr[Boolean] = js.undefined,
    excludes: js.Array[String | RegExp] = null,
    ignoreFalse: js.UndefOr[Boolean] = js.undefined,
    includes: js.Array[String | RegExp] = null,
    shortFlag: js.UndefOr[Boolean] = js.undefined,
    useEquals: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCamelCase)) __obj.updateDynamic("allowCamelCase")(allowCamelCase.asInstanceOf[js.Any])
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreFalse)) __obj.updateDynamic("ignoreFalse")(ignoreFalse.asInstanceOf[js.Any])
    if (includes != null) __obj.updateDynamic("includes")(includes.asInstanceOf[js.Any])
    if (!js.isUndefined(shortFlag)) __obj.updateDynamic("shortFlag")(shortFlag.asInstanceOf[js.Any])
    if (!js.isUndefined(useEquals)) __obj.updateDynamic("useEquals")(useEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

