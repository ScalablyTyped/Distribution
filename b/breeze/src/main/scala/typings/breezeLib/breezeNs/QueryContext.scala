package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryContext extends js.Object {
  var dataService: DataService
  var entityManager: EntityManager
  var query: EntityQuery | java.lang.String
  var queryOptions: QueryOptions
  var url: java.lang.String
}

