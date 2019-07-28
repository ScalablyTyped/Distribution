package typings.contentDashType.contentDashTypeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var parameters: js.UndefOr[StringDictionary[String]] = js.undefined
  var `type`: String
}

object MediaType {
  @scala.inline
  def apply(`type`: String, parameters: StringDictionary[String] = null): MediaType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[MediaType]
  }
}

