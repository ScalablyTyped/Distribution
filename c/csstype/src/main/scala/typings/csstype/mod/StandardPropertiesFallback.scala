package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardPropertiesFallback[TLength, TTime]
  extends StandardLonghandPropertiesFallback[TLength, TTime]
     with StandardShorthandPropertiesFallback[TLength, TTime]

object StandardPropertiesFallback {
  @scala.inline
  def apply[TLength, TTime](): StandardPropertiesFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardPropertiesFallback[TLength, TTime]]
  }
}

