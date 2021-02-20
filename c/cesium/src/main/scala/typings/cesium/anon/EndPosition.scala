package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndPosition extends StObject {
  
  var endPosition: Cartesian2 = js.native
  
  var startPosition: Cartesian2 = js.native
}
object EndPosition {
  
  @scala.inline
  def apply(endPosition: Cartesian2, startPosition: Cartesian2): EndPosition = {
    val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPosition]
  }
  
  @scala.inline
  implicit class EndPositionMutableBuilder[Self <: EndPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPosition(value: Cartesian2): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPosition(value: Cartesian2): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
