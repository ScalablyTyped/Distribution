package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Collection extends js.Object {
  var URI: java.lang.String
  var endpoint: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def create(newItem: Item, callback: CbCallback): scala.Unit
  def fetch(query: QueryObj, callback: CbCallback): scala.Unit
  def remove(query: Query, callback: CbCallback): scala.Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): scala.Unit
}

