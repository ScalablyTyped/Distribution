package typings
package bdfjsLib.bdfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var boundingBox: BoundingBox
  var name: java.lang.String
  // The spec says that `properties` is optional, but then goes on to point out
  // that without `defaultChar`, `fontAscent` and `fontDescent` it's not really
  // a valid font, so I chose to not mark them as a maybe.
  var properties: Properties
  var size: Size
  var totalChars: scala.Double
  var version: java.lang.String
}

object Meta {
  @scala.inline
  def apply(
    boundingBox: BoundingBox,
    name: java.lang.String,
    properties: Properties,
    size: Size,
    totalChars: scala.Double,
    version: java.lang.String
  ): Meta = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox, name = name, properties = properties, size = size, totalChars = totalChars, version = version)
  
    __obj.asInstanceOf[Meta]
  }
}

