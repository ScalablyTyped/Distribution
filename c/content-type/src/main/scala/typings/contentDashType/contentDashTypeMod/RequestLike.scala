package typings.contentDashType.contentDashTypeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLike extends js.Object {
  var headers: StringDictionary[js.UndefOr[String | js.Array[String]]]
}

object RequestLike {
  @scala.inline
  def apply(headers: StringDictionary[js.UndefOr[String | js.Array[String]]]): RequestLike = {
    val __obj = js.Dynamic.literal(headers = headers)
  
    __obj.asInstanceOf[RequestLike]
  }
}

