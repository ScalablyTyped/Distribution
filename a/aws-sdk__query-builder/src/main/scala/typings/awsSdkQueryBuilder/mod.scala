package typings.awsSdkQueryBuilder

import typings.awsSdkTypes.marshallerMod.BodySerializer
import typings.awsSdkTypes.marshallerMod.BodySerializerBuildOptions
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/query-builder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class QueryBuilder protected () extends BodySerializer[String] {
    def this(base64Encoder: Encoder, utf8Decoder: Decoder) = this()
    def this(base64Encoder: Encoder, utf8Decoder: Decoder, protocol: String) = this()
    val base64Encoder: js.Any = js.native
    var capitalizeFirstChar: js.Any = js.native
    val isEC2Query: js.Any = js.native
    var serialize: js.Any = js.native
    var serializeBlob: js.Any = js.native
    var serializeList: js.Any = js.native
    var serializeMap: js.Any = js.native
    var serializeMapEntry: js.Any = js.native
    var serializeStructure: js.Any = js.native
    var serializeTimestamp: js.Any = js.native
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

