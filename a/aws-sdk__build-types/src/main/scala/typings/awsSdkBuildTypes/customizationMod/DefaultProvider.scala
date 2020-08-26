package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultProvider extends js.Object {
  /**
    * A string containing a valid TypeScript expression that evaluates to a
    * function that, when called, will return a valid value for this
    * configuration property.
    *
    * This function will be called with the full configuration object at its
    * current point in processing.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var expression: String = js.native
  var `type`: provider = js.native
}

object DefaultProvider {
  @scala.inline
  def apply(expression: String, `type`: provider): DefaultProvider = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProvider]
  }
  @scala.inline
  implicit class DefaultProviderOps[Self <: DefaultProvider] (val x: Self) extends AnyVal {
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
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: provider): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

