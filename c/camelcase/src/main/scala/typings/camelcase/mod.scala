package typings.camelcase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Convert a dash/dot/underscore/space separated string to camelCase or PascalCase: `foo-bar` → `fooBar`.
  Correctly handles Unicode strings.
  @param input - String to convert to camel case.
  @example
  ```
  import camelCase = require('camelcase');
  camelCase('foo-bar');
  //=> 'fooBar'
  camelCase('foo_bar');
  //=> 'fooBar'
  camelCase('Foo-Bar');
  //=> 'fooBar'
  camelCase('розовый_пушистый_единороги');
  //=> 'розовыйПушистыйЕдинороги'
  camelCase('Foo-Bar', {pascalCase: true});
  //=> 'FooBar'
  camelCase('--foo.bar', {pascalCase: false});
  //=> 'fooBar'
  camelCase('Foo-BAR', {preserveConsecutiveUppercase: true});
  //=> 'fooBAR'
  camelCase('fooBAR', {pascalCase: true, preserveConsecutiveUppercase: true}));
  //=> 'FooBAR'
  camelCase('foo bar');
  //=> 'fooBar'
  console.log(process.argv[3]);
  //=> '--foo-bar'
  camelCase(process.argv[3]);
  //=> 'fooBar'
  camelCase(['foo', 'bar']);
  //=> 'fooBar'
  camelCase(['__foo__', '--bar'], {pascalCase: true});
  //=> 'FooBar'
  camelCase(['foo', 'BAR'], {pascalCase: true, preserveConsecutiveUppercase: true})
  //=> 'FooBAR'
  camelCase('lorem-ipsum', {locale: 'en-US'});
  //=> 'loremIpsum'
  ```
  */
  @scala.inline
  def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(input: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(input: js.Array[String], options: Options): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("camelcase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		The locale parameter indicates the locale to be used to convert to upper/lower case according to any locale-specific case mappings. If multiple locales are given in an array, the best available locale is used.
    		Default: The host environment’s current locale.
    		@example
    		```
    		import camelCase = require('camelcase');
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
    val locale: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
    		Uppercase the first character: `foo-bar` → `FooBar`.
    		@default false
    		*/
    val pascalCase: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Preserve the consecutive uppercase characters: `foo-BAR` → `FooBAR`.
    		@default false
    		*/
    val preserveConsecutiveUppercase: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String | js.Array[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocaleVarargs(value: String*): Self = StObject.set(x, "locale", js.Array(value :_*))
      
      @scala.inline
      def setPascalCase(value: Boolean): Self = StObject.set(x, "pascalCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPascalCaseUndefined: Self = StObject.set(x, "pascalCase", js.undefined)
      
      @scala.inline
      def setPreserveConsecutiveUppercase(value: Boolean): Self = StObject.set(x, "preserveConsecutiveUppercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveConsecutiveUppercaseUndefined: Self = StObject.set(x, "preserveConsecutiveUppercase", js.undefined)
    }
  }
}
