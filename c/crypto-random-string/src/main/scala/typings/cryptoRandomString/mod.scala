package typings.cryptoRandomString

import typings.cryptoRandomString.cryptoRandomStringStrings.`ascii-printable`
import typings.cryptoRandomString.cryptoRandomStringStrings.`url-safe`
import typings.cryptoRandomString.cryptoRandomStringStrings.alphanumeric
import typings.cryptoRandomString.cryptoRandomStringStrings.base64
import typings.cryptoRandomString.cryptoRandomStringStrings.distinguishable
import typings.cryptoRandomString.cryptoRandomStringStrings.hex
import typings.cryptoRandomString.cryptoRandomStringStrings.numeric
import typings.typeFest.mergeExclusiveMod.MergeExclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Generate a [cryptographically strong](https://en.wikipedia.org/wiki/Strong_cryptography) random string.
  	@returns A randomized string.
  	@example
  	```
  	import cryptoRandomString = require('crypto-random-string');
  	cryptoRandomString({length: 10});
  	//=> '2cf05d94db'
  	```
  	*/
  @scala.inline
  def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  @scala.inline
  def apply(options: Options): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("crypto-random-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Asynchronously generate a [cryptographically strong](https://en.wikipedia.org/wiki/Strong_cryptography) random string.
  	@returns A promise which resolves to a randomized string.
  	@example
  	```
  	import cryptoRandomString = require('crypto-random-string');
  	await cryptoRandomString.async({length: 10});
  	//=> '2cf05d94db'
  	```
  	*/
  @scala.inline
  def async(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")().asInstanceOf[js.Promise[String]]
  @scala.inline
  def async(options: Options): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait BaseOptions extends StObject {
    
    /**
    	Length of the returned string.
    	*/
    var length: Double
  }
  object BaseOptions {
    
    @scala.inline
    def apply(length: Double): BaseOptions = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait CharactersOption extends StObject {
    
    /**
    	Use only characters from a custom set of allowed characters.
    	Cannot be set at the same time as the `type` option.
    	Minimum length: `1`
    	Maximum length: `65536`
    	@example
    	```
    	cryptoRandomString({length: 10, characters: '0123456789'});
    	//=> '8796225811'
    	```
    	*/
    var characters: js.UndefOr[String] = js.undefined
  }
  object CharactersOption {
    
    @scala.inline
    def apply(): CharactersOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CharactersOption]
    }
    
    @scala.inline
    implicit class CharactersOptionMutableBuilder[Self <: CharactersOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacters(value: String): Self = StObject.set(x, "characters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharactersUndefined: Self = StObject.set(x, "characters", js.undefined)
    }
  }
  
  type Options = BaseOptions & (MergeExclusive[TypeOption, CharactersOption])
  
  trait TypeOption extends StObject {
    
    /**
    	Use only characters from a predefined set of allowed characters.
    	Cannot be set at the same time as the `characters` option.
    	@default 'hex'
    	The `distinguishable` set contains only uppercase characters that are not easily confused: `CDEHKMPRTUWXY012458`. It can be useful if you need to print out a short string that you'd like users to read and type back in with minimal errors. For example, reading a code off of a screen that needs to be typed into a phone to connect two devices.
    	The `ascii-printable` set contains all [printable ASCII characters](https://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters): ``!"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~`` Useful for generating passwords where all possible ASCII characters should be used.
    	The `alphanumeric` set contains uppercase letters, lowercase letters, and digits: `ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789`. Useful for generating [nonce](https://developer.mozilla.org/en-US/docs/Web/API/HTMLOrForeignElement/nonce) values.
    	@example
    	```
    	cryptoRandomString({length: 10});
    	//=> '87fc70e2b9'
    	cryptoRandomString({length: 10, type: 'base64'});
    	//=> 'mhsX7xmIv/'
    	cryptoRandomString({length: 10, type: 'url-safe'});
    	//=> 'VEjfNW3Yej'
    	cryptoRandomString({length: 10, type: 'numeric'});
    	//=> '8314659141'
    	cryptoRandomString({length: 6, type: 'distinguishable'});
    	//=> 'CDEHKM'
    	cryptoRandomString({length: 10, type: 'ascii-printable'});
    	//=> '`#Rt8$IK>B'
    	
    	cryptoRandomString({length: 10, type: 'alphanumeric'});
    	//=> 'DMuKL8YtE7'
    	```
    	*/
    var `type`: js.UndefOr[
        hex | base64 | `url-safe` | numeric | distinguishable | `ascii-printable` | alphanumeric
      ] = js.undefined
  }
  object TypeOption {
    
    @scala.inline
    def apply(): TypeOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeOption]
    }
    
    @scala.inline
    implicit class TypeOptionMutableBuilder[Self <: TypeOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: hex | base64 | `url-safe` | numeric | distinguishable | `ascii-printable` | alphanumeric): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
