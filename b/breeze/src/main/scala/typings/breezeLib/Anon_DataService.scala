package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataService extends js.Object {
  var dataService: breezeLib.breezeNs.DataService
  var query: breezeLib.breezeNs.EntityQuery
  def getUrl(): java.lang.String
}

object Anon_DataService {
  @scala.inline
  def apply(
    dataService: breezeLib.breezeNs.DataService,
    getUrl: js.Function0[java.lang.String],
    query: breezeLib.breezeNs.EntityQuery
  ): Anon_DataService = {
    val __obj = js.Dynamic.literal(dataService = dataService, getUrl = getUrl, query = query)
  
    __obj.asInstanceOf[Anon_DataService]
  }
}

