package typings.breeze.anon

import typings.breeze.breeze.EntityQuery
import typings.breeze.breeze.HttpResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityManager extends js.Object {
  var entityManager: typings.breeze.breeze.EntityManager
  var httpResponse: HttpResponse
  var message: js.UndefOr[String] = js.undefined
  var query: EntityQuery
  var stack: js.UndefOr[String] = js.undefined
}

object EntityManager {
  @scala.inline
  def apply(
    entityManager: typings.breeze.breeze.EntityManager,
    httpResponse: HttpResponse,
    query: EntityQuery,
    message: String = null,
    stack: String = null
  ): EntityManager = {
    val __obj = js.Dynamic.literal(entityManager = entityManager.asInstanceOf[js.Any], httpResponse = httpResponse.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityManager]
  }
}

