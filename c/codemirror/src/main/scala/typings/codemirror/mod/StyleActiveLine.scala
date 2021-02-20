package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleActiveLine extends StObject {
  
  /**
    * Controls whether single-line selections, or just cursor selections, are styled. Defaults to false (only cursor selections).
    */
  var nonEmpty: Boolean = js.native
}
object StyleActiveLine {
  
  @scala.inline
  def apply(nonEmpty: Boolean): StyleActiveLine = {
    val __obj = js.Dynamic.literal(nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleActiveLine]
  }
  
  @scala.inline
  implicit class StyleActiveLineMutableBuilder[Self <: StyleActiveLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonEmpty(value: Boolean): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
