package typings.dargs

import org.scalablytyped.runtime.StringDictionary
import typings.dargs.anon.Dictkey
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Reverse [`minimist`](https://github.com/substack/minimist). Convert an object of options into an array of command-line arguments.
  @param object - Object to convert to command-line arguments.
  @example
  ```
  import dargs = require('dargs');
  const input = {
  	_: ['some', 'option'],          // Values in '_' will be appended to the end of the generated argument list
  	'--': ['separated', 'option'],  // Values in '--' will be put at the very end of the argument list after the escape option (`--`)
  	foo: 'bar',
  	hello: true,                    // Results in only the key being used
  	cake: false,                    // Prepends `no-` before the key
  	camelCase: 5,                   // CamelCase is slugged to `camel-case`
  	multiple: ['value', 'value2'],  // Converted to multiple arguments
  	pieKind: 'cherry',
  	sad: ':('
  };
  const excludes = ['sad', /.*Kind$/];  // Excludes and includes accept regular expressions
  const includes = ['camelCase', 'multiple', 'sad', /^pie.+/];
  const aliases = {file: 'f'};
  console.log(dargs(input, {excludes}));
  // [
  // 	'--foo=bar',
  // 	'--hello',
  // 	'--no-cake',
  // 	'--camel-case=5',
  // 	'--multiple=value',
  // 	'--multiple=value2',
  // 	'some',
  // 	'option',
  // 	'--',
  // 	'separated',
  // 	'option'
  // ]
  console.log(dargs(input, {excludes, includes}));
  // [
  // 	'--camel-case=5',
  // 	'--multiple=value',
  // 	'--multiple=value2'
  // ]
  console.log(dargs(input, {includes}));
  // [
  // 	'--camel-case=5',
  // 	'--multiple=value',
  // 	'--multiple=value2',
  // 	'--pie-kind=cherry',
  // 	'--sad=:('
  // ]
  console.log(dargs({
  	foo: 'bar',
  	hello: true,
  	file: 'baz'
  }, {aliases}));
  // [
  // 	'--foo=bar',
  // 	'--hello',
  // 	'-f', 'baz'
  // ]
  ```
  */
  inline def apply(`object`: Dictkey): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(`object`: Dictkey, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("dargs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAliases(value: StringDictionary[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAllowCamelCase(value: Boolean): Self = StObject.set(x, "allowCamelCase", value.asInstanceOf[js.Any])
      
      inline def setAllowCamelCaseUndefined: Self = StObject.set(x, "allowCamelCase", js.undefined)
      
      inline def setExcludes(value: js.Array[String | RegExp]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      inline def setExcludesVarargs(value: (String | RegExp)*): Self = StObject.set(x, "excludes", js.Array(value :_*))
      
      inline def setIgnoreFalse(value: Boolean): Self = StObject.set(x, "ignoreFalse", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFalseUndefined: Self = StObject.set(x, "ignoreFalse", js.undefined)
      
      inline def setIncludes(value: js.Array[String | RegExp]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      inline def setIncludesVarargs(value: (String | RegExp)*): Self = StObject.set(x, "includes", js.Array(value :_*))
      
      inline def setShortFlag(value: Boolean): Self = StObject.set(x, "shortFlag", value.asInstanceOf[js.Any])
      
      inline def setShortFlagUndefined: Self = StObject.set(x, "shortFlag", js.undefined)
      
      inline def setUseEquals(value: Boolean): Self = StObject.set(x, "useEquals", value.asInstanceOf[js.Any])
      
      inline def setUseEqualsUndefined: Self = StObject.set(x, "useEquals", js.undefined)
    }
  }
}
