package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntityManager extends js.Object {
  var entityManager: breezeLib.breezeNs.EntityManager
  var httpResponse: breezeLib.breezeNs.HttpResponse
  var message: js.UndefOr[java.lang.String] = js.undefined
  var query: breezeLib.breezeNs.EntityQuery
  var stack: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EntityManager {
  @scala.inline
  def apply(
    entityManager: breezeLib.breezeNs.EntityManager,
    httpResponse: breezeLib.breezeNs.HttpResponse,
    query: breezeLib.breezeNs.EntityQuery,
    message: java.lang.String = null,
    stack: java.lang.String = null
  ): Anon_EntityManager = {
    val __obj = js.Dynamic.literal(entityManager = entityManager, httpResponse = httpResponse, query = query)
    if (message != null) __obj.updateDynamic("message")(message)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Anon_EntityManager]
  }
}

