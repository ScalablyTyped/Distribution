package typings
package deoxxaDashContentDashTypeLib.ContentTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var params: js.Any
  var q: js.UndefOr[scala.Double] = js.undefined
  var `type`: java.lang.String
}

object MediaType {
  @scala.inline
  def apply(
    params: js.Any,
    toString: js.Function0[java.lang.String],
    `type`: java.lang.String,
    q: scala.Int | scala.Double = null
  ): MediaType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("toString")(toString)
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaType]
  }
}

