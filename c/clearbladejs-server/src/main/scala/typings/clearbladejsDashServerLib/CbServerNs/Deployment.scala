package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Deployment extends js.Object {
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def create(
    name: java.lang.String,
    description: java.lang.String,
    options: DeploymentOptions,
    callback: CbCallback
  ): scala.Unit
  def delete(name: java.lang.String, callback: CbCallback): scala.Unit
  def read(name: java.lang.String, callback: CbCallback): scala.Unit
  def readAll(query: QueryObj, callback: CbCallback): scala.Unit
  def update(name: java.lang.String, options: DeploymentOptions, callback: CbCallback): scala.Unit
}

