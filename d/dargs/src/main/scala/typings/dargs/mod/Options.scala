package typings.dargs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		Maps keys in `input` to an aliased name. Matching keys are converted to arguments with a single dash (`-`) in front of the aliased key and the value in a separate array item. Keys are still affected by `includes` and `excludes`.
  		*/
  var aliases: js.UndefOr[StringDictionary[String]] = js.native
  
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
  var allowCamelCase: js.UndefOr[Boolean] = js.native
  
  /**
  		Keys or regex of keys to exclude. Takes precedence over `includes`.
  		*/
  var excludes: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  /**
  		Exclude `false` values. Can be useful when dealing with strict argument parsers that throw on unknown arguments like `--no-foo`.
  		@default false
  		*/
  var ignoreFalse: js.UndefOr[Boolean] = js.native
  
  /**
  		Keys or regex of keys to include.
  		*/
  var includes: js.UndefOr[js.Array[String | RegExp]] = js.native
  
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
  var shortFlag: js.UndefOr[Boolean] = js.native
  
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
  var useEquals: js.UndefOr[Boolean] = js.native
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
    def setAliases(value: StringDictionary[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setAllowCamelCase(value: Boolean): Self = this.set("allowCamelCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCamelCase: Self = this.set("allowCamelCase", js.undefined)
    
    @scala.inline
    def setExcludesVarargs(value: (String | RegExp)*): Self = this.set("excludes", js.Array(value :_*))
    
    @scala.inline
    def setExcludes(value: js.Array[String | RegExp]): Self = this.set("excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    
    @scala.inline
    def setIgnoreFalse(value: Boolean): Self = this.set("ignoreFalse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFalse: Self = this.set("ignoreFalse", js.undefined)
    
    @scala.inline
    def setIncludesVarargs(value: (String | RegExp)*): Self = this.set("includes", js.Array(value :_*))
    
    @scala.inline
    def setIncludes(value: js.Array[String | RegExp]): Self = this.set("includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludes: Self = this.set("includes", js.undefined)
    
    @scala.inline
    def setShortFlag(value: Boolean): Self = this.set("shortFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortFlag: Self = this.set("shortFlag", js.undefined)
    
    @scala.inline
    def setUseEquals(value: Boolean): Self = this.set("useEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEquals: Self = this.set("useEquals", js.undefined)
  }
}
