package typings.azureDashSb.libModelsRegistrationresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object]
  def serialize(`type`: String, resource: js.Object, properties: js.Array[String]): String
}

object RegistrationResult {
  @scala.inline
  def apply(
    parse: js.Object => js.Object | js.Array[js.Object],
    serialize: (String, js.Object, js.Array[String]) => String
  ): RegistrationResult = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction3(serialize))
  
    __obj.asInstanceOf[RegistrationResult]
  }
}

