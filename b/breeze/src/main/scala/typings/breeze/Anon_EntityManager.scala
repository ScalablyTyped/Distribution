package typings.breeze

import typings.breeze.breeze.EntityManager
import typings.breeze.breeze.EntityQuery
import typings.breeze.breeze.HttpResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntityManager extends js.Object {
  var entityManager: EntityManager
  var httpResponse: HttpResponse
  var message: js.UndefOr[String] = js.undefined
  var query: EntityQuery
  var stack: js.UndefOr[String] = js.undefined
}

object Anon_EntityManager {
  @scala.inline
  def apply(
    entityManager: EntityManager,
    httpResponse: HttpResponse,
    query: EntityQuery,
    message: String = null,
    stack: String = null
  ): Anon_EntityManager = {
    val __obj = js.Dynamic.literal(entityManager = entityManager.asInstanceOf[js.Any], httpResponse = httpResponse.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EntityManager]
  }
}

