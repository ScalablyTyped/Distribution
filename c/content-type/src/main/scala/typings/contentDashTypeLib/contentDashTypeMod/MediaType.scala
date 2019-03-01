package typings
package contentDashTypeLib.contentDashTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var parameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var `type`: java.lang.String
}

object MediaType {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): MediaType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[MediaType]
  }
}

