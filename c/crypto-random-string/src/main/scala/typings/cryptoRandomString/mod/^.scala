package typings.cryptoRandomString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto-random-string", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def apply(): String = js.native
  def apply(options: Options): String = js.native
  
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
  def async(): js.Promise[String] = js.native
  def async(options: Options): js.Promise[String] = js.native
}
