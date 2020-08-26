package typings.awsSdkJsonParser

import typings.awsSdkTypes.unmarshallerMod.BodyParser
import typings.awsSdkTypes.utilMod.Decoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/json-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JsonParser protected () extends BodyParser[String] {
    def this(base64Decoder: Decoder) = this()
    val base64Decoder: js.Any = js.native
    var unmarshall: js.Any = js.native
  }
  
}

