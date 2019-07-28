package typings.atBabelCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  /**
    * The file that the user requested, e.g. `"@babel/env"`
    */
  var request: String
  /**
    * The full path of the resolved file, e.g. `"/tmp/node_modules/@babel/preset-env/lib/index.js"`
    */
  var resolved: String
}

object Anon_Request {
  @scala.inline
  def apply(request: String, resolved: String): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request, resolved = resolved)
  
    __obj.asInstanceOf[Anon_Request]
  }
}

