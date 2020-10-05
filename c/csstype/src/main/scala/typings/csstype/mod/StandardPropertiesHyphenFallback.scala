package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardPropertiesHyphenFallback[TLength, TTime]
  extends StandardLonghandPropertiesHyphenFallback[TLength, TTime]
     with StandardShorthandPropertiesHyphenFallback[TLength, TTime]

object StandardPropertiesHyphenFallback {
  @scala.inline
  def apply[TLength, TTime](): StandardPropertiesHyphenFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardPropertiesHyphenFallback[TLength, TTime]]
  }
}

