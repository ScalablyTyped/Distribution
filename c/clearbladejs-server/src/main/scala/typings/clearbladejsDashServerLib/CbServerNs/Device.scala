package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Device extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  def create(newDevice: js.Object, callback: CbCallback): scala.Unit
  def delete(query: Query, callback: CbCallback): scala.Unit
  def fetch(query: Query, callback: CbCallback): scala.Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): scala.Unit
}

