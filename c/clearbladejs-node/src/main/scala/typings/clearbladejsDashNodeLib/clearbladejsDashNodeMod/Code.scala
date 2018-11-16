package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Code extends js.Object {
  var URI: java.lang.String
  var URIPrefix: java.lang.String
  var callTimeout: scala.Double
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def execute(name: java.lang.String, params: js.Object, callback: CbCallback): scala.Unit
}

