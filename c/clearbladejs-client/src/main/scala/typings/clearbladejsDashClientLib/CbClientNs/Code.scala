package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var URI: java.lang.String
  var callTimeout: scala.Double
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def create(name: java.lang.String, body: java.lang.String, callback: CbCallback): scala.Unit
  def delete(name: java.lang.String, callback: CbCallback): scala.Unit
  def execute(name: java.lang.String, params: js.Object, callback: CbCallback): scala.Unit
  def getAllServices(callback: CbCallback): scala.Unit
  def getCompletedServices(callback: CbCallback): scala.Unit
  def getFailedServices(callback: CbCallback): scala.Unit
  def update(name: java.lang.String, body: java.lang.String, callback: CbCallback): scala.Unit
}

