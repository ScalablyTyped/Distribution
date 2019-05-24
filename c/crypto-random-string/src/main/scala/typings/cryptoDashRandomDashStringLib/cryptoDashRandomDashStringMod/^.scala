package typings
package cryptoDashRandomDashStringLib.cryptoDashRandomDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(): java.lang.String = js.native
  def apply(options: Options): java.lang.String = js.native
}

