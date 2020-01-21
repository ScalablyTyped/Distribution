package typings.awsSdkJsonBuilder

import typings.awsSdkTypes.marshallerMod.BodySerializer
import typings.awsSdkTypes.marshallerMod.BodySerializerBuildOptions
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/json-builder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JsonBuilder protected () extends BodySerializer[String] {
    def this(base64Encoder: Encoder, utf8Decoder: Decoder) = this()
    val base64Encoder: js.Any = js.native
    var format: js.Any = js.native
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

