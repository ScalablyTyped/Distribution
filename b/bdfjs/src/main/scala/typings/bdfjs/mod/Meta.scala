package typings.bdfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var boundingBox: BoundingBox
  var name: String
  // The spec says that `properties` is optional, but then goes on to point out
  // that without `defaultChar`, `fontAscent` and `fontDescent` it's not really
  // a valid font, so I chose to not mark them as a maybe.
  var properties: Properties
  var size: Size
  var totalChars: Double
  var version: String
}

object Meta {
  @scala.inline
  def apply(
    boundingBox: BoundingBox,
    name: String,
    properties: Properties,
    size: Size,
    totalChars: Double,
    version: String
  ): Meta = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], totalChars = totalChars.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
}

