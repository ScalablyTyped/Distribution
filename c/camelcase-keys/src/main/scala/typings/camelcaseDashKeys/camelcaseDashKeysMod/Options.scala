package typings.camelcaseDashKeys.camelcaseDashKeysMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Recurse nested objects and objects in arrays.
  		@default false
  		*/
  val deep: js.UndefOr[Boolean] = js.undefined
  /**
  		Exclude keys from being camel-cased.
  		@default []
  		*/
  val exclude: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  /**
  		Uppercase the first character as in `bye-bye` → `ByeBye`.
  		@default false
  		*/
  val pascalCase: js.UndefOr[Boolean] = js.undefined
  /**
  		Exclude children at the given object paths in dot-notation from being camel-cased. For example, with an object like `{a: {b: '🦄'}}`, the object path to reach the unicorn is `'a.b'`.
  		@default []
  		@example
  		```
  		camelcaseKeys({
  			a_b: 1,
  			a_c: {
  				c_d: 1,
  				c_e: {
  					e_f: 1
  				}
  			}
  		}, {
  			deep: true,
  			stopPaths: [
  				'a_c.c_e'
  			]
  		}),
  		// {
  		// 	aB: 1,
  		// 	aC: {
  		// 		cD: 1,
  		// 		cE: {
  		// 			e_f: 1
  		// 		}
  		// 	}
  		// }
  		```
  		*/
  val stopPaths: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    deep: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[String | RegExp] = null,
    pascalCase: js.UndefOr[Boolean] = js.undefined,
    stopPaths: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(pascalCase)) __obj.updateDynamic("pascalCase")(pascalCase.asInstanceOf[js.Any])
    if (stopPaths != null) __obj.updateDynamic("stopPaths")(stopPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

