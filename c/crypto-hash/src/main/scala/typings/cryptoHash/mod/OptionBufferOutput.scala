package typings.cryptoHash.mod

import typings.cryptoHash.cryptoHashStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionBufferOutput extends js.Object {
  var outputFormat: buffer
}

object OptionBufferOutput {
  @scala.inline
  def apply(outputFormat: buffer): OptionBufferOutput = {
    val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionBufferOutput]
  }
}

