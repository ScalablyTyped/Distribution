package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestOptions
  extends Loggable
     with Timeoutable {
  var auth: js.Object
  var body: RequestBody
  var failOnStatusCode: scala.Boolean
  var followRedirect: scala.Boolean
  var form: scala.Boolean
  var gzip: scala.Boolean
  var headers: js.Object
  var method: HttpMethod
  var qs: java.lang.String
  var url: java.lang.String
}

