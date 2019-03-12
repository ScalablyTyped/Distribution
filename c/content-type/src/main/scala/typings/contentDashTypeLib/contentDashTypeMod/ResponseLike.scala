package typings
package contentDashTypeLib.contentDashTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseLike extends js.Object {
  def getHeader(name: java.lang.String): js.UndefOr[scala.Double | java.lang.String | js.Array[java.lang.String]]
}

object ResponseLike {
  @scala.inline
  def apply(
    getHeader: java.lang.String => js.UndefOr[scala.Double | java.lang.String | js.Array[java.lang.String]]
  ): ResponseLike = {
    val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader))
  
    __obj.asInstanceOf[ResponseLike]
  }
}

