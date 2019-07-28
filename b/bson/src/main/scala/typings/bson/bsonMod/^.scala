package typings.bson.bsonMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def calculateObjectSize(`object`: js.Any): scala.Double = js.native
  def calculateObjectSize(`object`: js.Any, options: CalculateObjectSizeOptions): scala.Double = js.native
  def deserialize(buffer: Buffer): js.Any = js.native
  def deserialize(buffer: Buffer, options: DeserializeOptions): js.Any = js.native
  def deserializeStream(
    data: Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double
  ): scala.Double = js.native
  def deserializeStream(
    data: Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double,
    options: DeserializeOptions
  ): scala.Double = js.native
  def serialize(`object`: js.Any): Buffer = js.native
  def serialize(`object`: js.Any, options: SerializeOptions): Buffer = js.native
  def serializeWithBufferAndIndex(`object`: js.Any, buffer: Buffer): scala.Double = js.native
  def serializeWithBufferAndIndex(`object`: js.Any, buffer: Buffer, options: SerializeWithBufferAndIndexOptions): scala.Double = js.native
}

