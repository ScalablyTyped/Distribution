package typings.atAwsDashSdkTypes.buildMarshallerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodySerializer[SerializedType] extends js.Object {
  /**
    * Converts the provided `input` into the serialized format described in the
    * provided `shape`.
    *
    * @param options Modeled and user-provided operation input to serialize.
    *
    * @throws if a node in the input cannot be converted into the type
    *          specified by the serialization model
    */
  def build(options: BodySerializerBuildOptions): SerializedType
}

object BodySerializer {
  @scala.inline
  def apply[SerializedType](build: BodySerializerBuildOptions => SerializedType): BodySerializer[SerializedType] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build))
  
    __obj.asInstanceOf[BodySerializer[SerializedType]]
  }
}

