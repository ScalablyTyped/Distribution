package typings.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticOptions extends js.Object {
  var dir: String | js.Array[String]
  var route: String | js.Array[String]
}

object StaticOptions {
  @scala.inline
  def apply(dir: String | js.Array[String], route: String | js.Array[String]): StaticOptions = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StaticOptions]
  }
}

