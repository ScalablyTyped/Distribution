package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementAnimateOptionPos extends ElementAnimateOptionsBase {
  
  /** A position to which the elements will be animated. */
  var position: js.UndefOr[Position] = js.native
}
object ElementAnimateOptionPos {
  
  @scala.inline
  def apply(): ElementAnimateOptionPos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementAnimateOptionPos]
  }
  
  @scala.inline
  implicit class ElementAnimateOptionPosMutableBuilder[Self <: ElementAnimateOptionPos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
