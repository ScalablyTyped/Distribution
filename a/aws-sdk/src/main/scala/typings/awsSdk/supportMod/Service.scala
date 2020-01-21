package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * A list of categories that describe the type of support issue a case describes. Categories consist of a category name and a category code. Category names and codes are passed to AWS Support when you call CreateCase.
    */
  var categories: js.UndefOr[CategoryList] = js.native
  /**
    * The code for an AWS service returned by the DescribeServices response. The name element contains the corresponding friendly name.
    */
  var code: js.UndefOr[ServiceCode] = js.native
  /**
    * The friendly name for an AWS service. The code element contains the corresponding code.
    */
  var name: js.UndefOr[ServiceName] = js.native
}

object Service {
  @scala.inline
  def apply(categories: CategoryList = null, code: ServiceCode = null, name: ServiceName = null): Service = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

