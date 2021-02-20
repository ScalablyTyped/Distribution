package typings.c3.anon

import typings.c3.c3Strings.`inner-bottom`
import typings.c3.c3Strings.`inner-middle`
import typings.c3.c3Strings.`inner-top`
import typings.c3.c3Strings.`outer-bottom`
import typings.c3.c3Strings.`outer-middle`
import typings.c3.c3Strings.`outer-top`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionText extends StObject {
  
  /** The position of the label. */
  var position: `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom` = js.native
  
  /** The label text to show. */
  var text: String = js.native
}
object PositionText {
  
  @scala.inline
  def apply(
    position: `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom`,
    text: String
  ): PositionText = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionText]
  }
  
  @scala.inline
  implicit class PositionTextMutableBuilder[Self <: PositionText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(
      value: `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom`
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
