package typings.c3.anon

import typings.c3.c3Strings.`inner-center`
import typings.c3.c3Strings.`inner-left`
import typings.c3.c3Strings.`inner-right`
import typings.c3.c3Strings.`outer-center`
import typings.c3.c3Strings.`outer-left`
import typings.c3.c3Strings.`outer-right`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  /** The position of the label. */
  var position: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left`
  
  /** The label text to show. */
  var text: String
}
object Position {
  
  inline def apply(
    position: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left`,
    text: String
  ): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setPosition(
      value: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left`
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
