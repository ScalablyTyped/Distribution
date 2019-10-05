package typings.bson.bsonMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "deserializeStream")
@js.native
object deserializeStream extends js.Object {
  def apply(
    data: Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double
  ): scala.Double = js.native
  def apply(
    data: Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double,
    options: DeserializeOptions
  ): scala.Double = js.native
}

