package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardPropertiesHyphen[TLength]
  extends StandardLonghandPropertiesHyphen[TLength]
     with StandardShorthandPropertiesHyphen[TLength]
object StandardPropertiesHyphen {
  
  @scala.inline
  def apply[TLength](): StandardPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardPropertiesHyphen[TLength]]
  }
}
