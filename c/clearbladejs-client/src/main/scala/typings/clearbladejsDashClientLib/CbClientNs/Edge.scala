package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Edge extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def columns(callback: CbCallback): scala.Unit
  def count(query: Query, callback: CbCallback): scala.Unit
  def create(newEdge: js.Object, name: java.lang.String, callback: CbCallback): scala.Unit
  def deleteEdgeByName(name: java.lang.String, callback: CbCallback): scala.Unit
  def updateEdgeByName(name: java.lang.String, `object`: js.Object, callback: CbCallback): scala.Unit
}

