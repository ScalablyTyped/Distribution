package typings.camelcase

import typings.camelcase.camelcaseBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("camelcase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(input: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(input: js.Array[String], options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	The locale parameter indicates the locale to be used to convert to upper/lower case according to any locale-specific case mappings. If multiple locales are given in an array, the best available locale is used.
    	Setting `locale: false` ignores the platform locale and uses the [Unicode Default Case Conversion](https://unicode-org.github.io/icu/userguide/transforms/casemappings.html#simple-single-character-case-mapping) algorithm.
    	Default: The host environment’s current locale.
    	@example
    	```
    	import camelCase from 'camelcase';
    	camelCase('lorem-ipsum', {locale: 'en-US'});
    	//=> 'loremIpsum'
    	camelCase('lorem-ipsum', {locale: 'tr-TR'});
    	//=> 'loremİpsum'
    	camelCase('lorem-ipsum', {locale: ['en-US', 'en-GB']});
    	//=> 'loremIpsum'
    	camelCase('lorem-ipsum', {locale: ['tr', 'TR', 'tr-TR']});
    	//=> 'loremİpsum'
    	```
    	*/
    val locale: js.UndefOr[`false` | String | js.Array[String]] = js.undefined
    
    /**
    	Uppercase the first character: `foo-bar` → `FooBar`.
    	@default false
    	*/
    val pascalCase: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Preserve consecutive uppercase characters: `foo-BAR` → `FooBAR`.
    	@default false
    	*/
    val preserveConsecutiveUppercase: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: `false` | String | js.Array[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocaleVarargs(value: String*): Self = StObject.set(x, "locale", js.Array(value*))
      
      inline def setPascalCase(value: Boolean): Self = StObject.set(x, "pascalCase", value.asInstanceOf[js.Any])
      
      inline def setPascalCaseUndefined: Self = StObject.set(x, "pascalCase", js.undefined)
      
      inline def setPreserveConsecutiveUppercase(value: Boolean): Self = StObject.set(x, "preserveConsecutiveUppercase", value.asInstanceOf[js.Any])
      
      inline def setPreserveConsecutiveUppercaseUndefined: Self = StObject.set(x, "preserveConsecutiveUppercase", js.undefined)
    }
  }
}
