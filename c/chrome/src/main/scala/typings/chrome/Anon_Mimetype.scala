package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mimetype extends js.Object {
  var mime_type: String
  var path: String
}

object Anon_Mimetype {
  @scala.inline
  def apply(mime_type: String, path: String): Anon_Mimetype = {
    val __obj = js.Dynamic.literal(mime_type = mime_type, path = path)
  
    __obj.asInstanceOf[Anon_Mimetype]
  }
}

