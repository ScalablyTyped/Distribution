package typings.babelCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  /**
    * The file that the user requested, e.g. `"@babel/env"`
    */
  var request: String
  /**
    * The full path of the resolved file, e.g. `"/tmp/node_modules/@babel/preset-env/lib/index.js"`
    */
  var resolved: String
}

object AnonRequest {
  @scala.inline
  def apply(request: String, resolved: String): AnonRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequest]
  }
}

