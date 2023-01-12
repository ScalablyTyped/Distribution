package typings.dargs

import typings.dargs.anon._empty
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dargs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`object`: _empty & (Record[String, String | Boolean | Double | js.Array[String]])): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def default(
    `object`: _empty & (Record[String, String | Boolean | Double | js.Array[String]]),
    options: Options
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait Options extends StObject {
    
    /**
    	Maps keys in `input` to an aliased name. Matching keys are converted to arguments with a single dash (`-`) in front of the aliased key and the value in a separate array item. Keys are still affected by `includes` and `excludes`.
    	*/
    val aliases: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
    	By default, camel-cased keys will be hyphenated. Enabling this will bypass the conversion process.
    	@default false
    	@example
    	```
    	import dargs from 'dargs';
    	console.log(dargs({fooBar: 'baz'}));
    	//=> ['--foo-bar', 'baz']
    	console.log(dargs({fooBar: 'baz'}, {allowCamelCase: true}));
    	//=> ['--fooBar', 'baz']
    	```
    	*/
    val allowCamelCase: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Keys or regex of keys to exclude. Takes precedence over `includes`.
    	*/
    val excludes: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    /**
    	Exclude `false` values. Can be useful when dealing with strict argument parsers that throw on unknown arguments like `--no-foo`.
    	@default false
    	*/
    val ignoreFalse: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Exclude `true` values. Can be useful when dealing with argument parsers that only expect negated arguments like `--no-foo`.
    	@default false
    	*/
    val ignoreTrue: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Keys or regex of keys to include.
    	*/
    val includes: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    /**
    	Make a single character option key `{a: true}` become a short flag `-a` instead of `--a`.
    	@default true
    	@example
    	```
    	import dargs from 'dargs';
    	console.log(dargs({a: true}));
    	//=> ['-a']
    	console.log(dargs({a: true}, {shortFlag: false}));
    	//=> ['--a']
    	```
    	*/
    val shortFlag: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Setting this to `false` makes it return the key and value as separate array items instead of using a `=` separator in one item. This can be useful for tools that doesn't support `--foo=bar` style flags.
    	@default true
    	@example
    	```
    	import dargs from 'dargs';
    	console.log(dargs({foo: 'bar'}, {useEquals: false}));
    	// [
    	// 	'--foo', 'bar'
    	// ]
    	```
    	*/
    val useEquals: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: Record[String, String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAllowCamelCase(value: Boolean): Self = StObject.set(x, "allowCamelCase", value.asInstanceOf[js.Any])
      
      inline def setAllowCamelCaseUndefined: Self = StObject.set(x, "allowCamelCase", js.undefined)
      
      inline def setExcludes(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      inline def setExcludesVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "excludes", js.Array(value*))
      
      inline def setIgnoreFalse(value: Boolean): Self = StObject.set(x, "ignoreFalse", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFalseUndefined: Self = StObject.set(x, "ignoreFalse", js.undefined)
      
      inline def setIgnoreTrue(value: Boolean): Self = StObject.set(x, "ignoreTrue", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTrueUndefined: Self = StObject.set(x, "ignoreTrue", js.undefined)
      
      inline def setIncludes(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      inline def setIncludesVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "includes", js.Array(value*))
      
      inline def setShortFlag(value: Boolean): Self = StObject.set(x, "shortFlag", value.asInstanceOf[js.Any])
      
      inline def setShortFlagUndefined: Self = StObject.set(x, "shortFlag", js.undefined)
      
      inline def setUseEquals(value: Boolean): Self = StObject.set(x, "useEquals", value.asInstanceOf[js.Any])
      
      inline def setUseEqualsUndefined: Self = StObject.set(x, "useEquals", js.undefined)
    }
  }
}
