package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def calculateObjectSize(`object`: js.Any): scala.Double = js.native
  def calculateObjectSize(`object`: js.Any, options: bsonLib.bsonMod.CalculateObjectSizeOptions): scala.Double = js.native
  def deserialize(buffer: nodeLib.Buffer): js.Any = js.native
  def deserialize(buffer: nodeLib.Buffer, options: bsonLib.bsonMod.DeserializeOptions): js.Any = js.native
  def deserializeStream(
    data: nodeLib.Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double
  ): scala.Double = js.native
  def deserializeStream(
    data: nodeLib.Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double,
    options: bsonLib.bsonMod.DeserializeOptions
  ): scala.Double = js.native
  def serialize(`object`: js.Any): nodeLib.Buffer = js.native
  def serialize(`object`: js.Any, options: bsonLib.bsonMod.SerializeOptions): nodeLib.Buffer = js.native
  def serializeWithBufferAndIndex(`object`: js.Any, buffer: nodeLib.Buffer): scala.Double = js.native
  def serializeWithBufferAndIndex(
    `object`: js.Any,
    buffer: nodeLib.Buffer,
    options: bsonLib.bsonMod.SerializeWithBufferAndIndexOptions
  ): scala.Double = js.native
}

