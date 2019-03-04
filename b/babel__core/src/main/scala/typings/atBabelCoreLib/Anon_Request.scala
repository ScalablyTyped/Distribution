package typings
package atBabelCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  /**
    * The file that the user requested, e.g. `"@babel/env"`
    */
  var request: java.lang.String
  /**
    * The full path of the resolved file, e.g. `"/tmp/node_modules/@babel/preset-env/lib/index.js"`
    */
  var resolved: java.lang.String
}

object Anon_Request {
  @scala.inline
  def apply(request: java.lang.String, resolved: java.lang.String): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request, resolved = resolved)
  
    __obj.asInstanceOf[Anon_Request]
  }
}

