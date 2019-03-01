package typings
package contentDashTypeLib.contentDashTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedMediaType extends js.Object {
  var parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var `type`: java.lang.String
}

object ParsedMediaType {
  @scala.inline
  def apply(parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String], `type`: java.lang.String): ParsedMediaType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[ParsedMediaType]
  }
}

