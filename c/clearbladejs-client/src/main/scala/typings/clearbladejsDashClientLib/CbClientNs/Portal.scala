package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Portal extends js.Object {
  var URI: java.lang.String
  var name: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def fetch(callback: CbCallback): scala.Unit
  def update(data: js.Object, callback: CbCallback): scala.Unit
}

