package typings.cryptoRandomString.mod

import typings.cryptoRandomString.cryptoRandomStringStrings.`url-safe`
import typings.cryptoRandomString.cryptoRandomStringStrings.base64
import typings.cryptoRandomString.cryptoRandomStringStrings.distinguishable
import typings.cryptoRandomString.cryptoRandomStringStrings.hex
import typings.cryptoRandomString.cryptoRandomStringStrings.numeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeOption extends js.Object {
  /**
  	Use only characters from a predefined set of allowed characters.
  	Cannot be set at the same time as the `characters` option.
  	@default 'hex'
  	The `distinguishable` set contains only uppercase characters that are not easily confused: `CDEHKMPRTUWXY012458`. It can be useful if you need to print out a short string that you'd like users to read and type back in with minimal errors. For example, reading a code off of a screen that needs to be typed into a phone to connect two devices.
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
  	```
  	*/
  var `type`: js.UndefOr[hex | base64 | `url-safe` | numeric | distinguishable] = js.undefined
}

object TypeOption {
  @scala.inline
  def apply(`type`: hex | base64 | `url-safe` | numeric | distinguishable = null): TypeOption = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOption]
  }
}

