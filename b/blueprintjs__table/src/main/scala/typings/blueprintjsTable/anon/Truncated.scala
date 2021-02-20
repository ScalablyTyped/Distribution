package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Truncated extends StObject {
  
  var truncated: Boolean = js.native
  
  var wrapText: Boolean = js.native
}
object Truncated {
  
  @scala.inline
  def apply(truncated: Boolean, wrapText: Boolean): Truncated = {
    val __obj = js.Dynamic.literal(truncated = truncated.asInstanceOf[js.Any], wrapText = wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Truncated]
  }
  
  @scala.inline
  implicit class TruncatedMutableBuilder[Self <: Truncated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
  }
}
