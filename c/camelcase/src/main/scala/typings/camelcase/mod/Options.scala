package typings.camelcase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  val locale: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
  		Uppercase the first character: `foo-bar` → `FooBar`.
  		@default false
  		*/
  val pascalCase: js.UndefOr[Boolean] = js.native
  
  /**
  		Preserve the consecutive uppercase characters: `foo-BAR` → `FooBAR`.
  		@default false
  		*/
  val preserveConsecutiveUppercase: js.UndefOr[Boolean] = js.native
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
    def setLocaleVarargs(value: String*): Self = this.set("locale", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: String | js.Array[String]): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setPascalCase(value: Boolean): Self = this.set("pascalCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePascalCase: Self = this.set("pascalCase", js.undefined)
    
    @scala.inline
    def setPreserveConsecutiveUppercase(value: Boolean): Self = this.set("preserveConsecutiveUppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveConsecutiveUppercase: Self = this.set("preserveConsecutiveUppercase", js.undefined)
  }
}
