package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngleAndHeight extends StObject {
  
  var angleAndHeight: EndPosition = js.native
  
  var distance: EndPosition = js.native
}
object AngleAndHeight {
  
  @scala.inline
  def apply(angleAndHeight: EndPosition, distance: EndPosition): AngleAndHeight = {
    val __obj = js.Dynamic.literal(angleAndHeight = angleAndHeight.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleAndHeight]
  }
  
  @scala.inline
  implicit class AngleAndHeightMutableBuilder[Self <: AngleAndHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngleAndHeight(value: EndPosition): Self = StObject.set(x, "angleAndHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: EndPosition): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
  }
}
