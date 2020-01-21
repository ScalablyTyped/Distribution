package typings.awsSdkXmlBodyBuilder

import typings.awsSdkTypes.marshallerMod.BodySerializer
import typings.awsSdkTypes.marshallerMod.BodySerializerBuildOptions
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/xml-body-builder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class XmlBodyBuilder protected () extends BodySerializer[String] {
    def this(base64Encoder: Encoder, utf8Decoder: Decoder) = this()
    val base64Encoder: js.Any = js.native
    var formatMap: js.Any = js.native
    var serialize: js.Any = js.native
    var serializeBlob: js.Any = js.native
    var serializeFloat: js.Any = js.native
    var serializeInteger: js.Any = js.native
    var serializeList: js.Any = js.native
    var serializeMap: js.Any = js.native
    var serializeScalar: js.Any = js.native
    var serializeString: js.Any = js.native
    var serializeStructure: js.Any = js.native
    var serializeStructureMember: js.Any = js.native
    var serializeTimestamp: js.Any = js.native
    var toXml: js.Any = js.native
    val utf8Decoder: js.Any = js.native
    /**
      * Converts the provided `input` into the serialized format described in the
      * provided `shape`.
      *
      * @param options Modeled and user-provided operation input to serialize.
      *
      * @throws if a node in the input cannot be converted into the type
      *          specified by the serialization model
      */
    /* CompleteClass */
    override def build(options: BodySerializerBuildOptions): String = js.native
  }
  
}

