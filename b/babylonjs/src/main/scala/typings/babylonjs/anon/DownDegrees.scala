package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownDegrees extends StObject {
  
  var downDegrees: Double = js.native
  
  var leftDegrees: Double = js.native
  
  var rightDegrees: Double = js.native
  
  var upDegrees: Double = js.native
}
object DownDegrees {
  
  @scala.inline
  def apply(downDegrees: Double, leftDegrees: Double, rightDegrees: Double, upDegrees: Double): DownDegrees = {
    val __obj = js.Dynamic.literal(downDegrees = downDegrees.asInstanceOf[js.Any], leftDegrees = leftDegrees.asInstanceOf[js.Any], rightDegrees = rightDegrees.asInstanceOf[js.Any], upDegrees = upDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownDegrees]
  }
  
  @scala.inline
  implicit class DownDegreesMutableBuilder[Self <: DownDegrees] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownDegrees(value: Double): Self = StObject.set(x, "downDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftDegrees(value: Double): Self = StObject.set(x, "leftDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightDegrees(value: Double): Self = StObject.set(x, "rightDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpDegrees(value: Double): Self = StObject.set(x, "upDegrees", value.asInstanceOf[js.Any])
  }
}
