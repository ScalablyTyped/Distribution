package typings
package contentDashTypeLib.contentDashTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLike extends js.Object {
  var headers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
}

object RequestLike {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
  ): RequestLike = {
    val __obj = js.Dynamic.literal(headers = headers)
  
    __obj.asInstanceOf[RequestLike]
  }
}

