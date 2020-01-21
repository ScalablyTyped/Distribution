package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.mod.Azure.ServiceBus.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-messaging-sql-filter
  */
trait SqlFilter extends js.Object {
  val CompatibilityLevel: String
  var Parameters: js.UndefOr[Dictionary[_]] = js.undefined
  var RequiresPreprocessing: js.UndefOr[String] = js.undefined
  var SqlExpression: String
}

object SqlFilter {
  @scala.inline
  def apply(
    CompatibilityLevel: String,
    SqlExpression: String,
    Parameters: Dictionary[_] = null,
    RequiresPreprocessing: String = null
  ): SqlFilter = {
    val __obj = js.Dynamic.literal(CompatibilityLevel = CompatibilityLevel.asInstanceOf[js.Any], SqlExpression = SqlExpression.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (RequiresPreprocessing != null) __obj.updateDynamic("RequiresPreprocessing")(RequiresPreprocessing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlFilter]
  }
}

