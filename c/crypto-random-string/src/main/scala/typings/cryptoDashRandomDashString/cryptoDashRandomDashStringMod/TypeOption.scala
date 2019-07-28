package typings.cryptoDashRandomDashString.cryptoDashRandomDashStringMod

import typings.cryptoDashRandomDashString.cryptoDashRandomDashStringStrings.`url-safe`
import typings.cryptoDashRandomDashString.cryptoDashRandomDashStringStrings.base64
import typings.cryptoDashRandomDashString.cryptoDashRandomDashStringStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeOption extends js.Object {
  /**
  	Use only characters from a predefined set of allowed characters.
  	Cannot be set at the same time as the `characters` option.
  	@default 'hex'
  	@example
  	```
  	cryptoRandomString({length: 10});
  	//=> '87fc70e2b9'
  	cryptoRandomString({length: 10, type:'base64'});
  	//=> 'mhsX7xmIv/'
  	cryptoRandomString({length: 10, type:'url-safe'});
  	//=> 'VEjfNW3Yej'
  	```
  	*/
  var `type`: js.UndefOr[hex | base64 | `url-safe`] = js.undefined
}

object TypeOption {
  @scala.inline
  def apply(`type`: hex | base64 | `url-safe` = null): TypeOption = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOption]
  }
}

