package typings.awsSdkXmlBodyParser

import typings.awsSdkTypes.unmarshallerMod.BodyParser
import typings.awsSdkTypes.utilMod.Decoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/xml-body-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class XmlBodyParser protected () extends BodyParser[String] {
    def this(base64Decoder: Decoder) = this()
    val base64Decoder: js.Any = js.native
    var mapToXMLKey: js.Any = js.native
    var parseList: js.Any = js.native
    var parseMap: js.Any = js.native
    var parseStructure: js.Any = js.native
    var parseTimeStamp: js.Any = js.native
    var unmarshall: js.Any = js.native
  }
  
}

