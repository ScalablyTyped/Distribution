package typings
package azureDashSbLib.libModelsRegistrationresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object]
  def serialize(`type`: java.lang.String, resource: js.Object, properties: js.Array[java.lang.String]): java.lang.String
}

object RegistrationResult {
  @scala.inline
  def apply(
    parse: js.Function1[js.Object, js.Object | js.Array[js.Object]],
    serialize: js.Function3[java.lang.String, js.Object, js.Array[java.lang.String], java.lang.String]
  ): RegistrationResult = {
    val __obj = js.Dynamic.literal(parse = parse, serialize = serialize)
  
    __obj.asInstanceOf[RegistrationResult]
  }
}

