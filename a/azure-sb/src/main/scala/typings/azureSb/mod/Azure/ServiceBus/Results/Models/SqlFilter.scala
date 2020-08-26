package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.mod.Azure.ServiceBus.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-messaging-sql-filter
  */
@js.native
trait SqlFilter extends js.Object {
  val CompatibilityLevel: String = js.native
  var Parameters: js.UndefOr[Dictionary[_]] = js.native
  var RequiresPreprocessing: js.UndefOr[String] = js.native
  var SqlExpression: String = js.native
}

object SqlFilter {
  @scala.inline
  def apply(CompatibilityLevel: String, SqlExpression: String): SqlFilter = {
    val __obj = js.Dynamic.literal(CompatibilityLevel = CompatibilityLevel.asInstanceOf[js.Any], SqlExpression = SqlExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlFilter]
  }
  @scala.inline
  implicit class SqlFilterOps[Self <: SqlFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompatibilityLevel(value: String): Self = this.set("CompatibilityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSqlExpression(value: String): Self = this.set("SqlExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: Dictionary[_]): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setRequiresPreprocessing(value: String): Self = this.set("RequiresPreprocessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiresPreprocessing: Self = this.set("RequiresPreprocessing", js.undefined)
  }
  
}

