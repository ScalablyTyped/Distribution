package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xaxis extends StObject {
  
  var `x-axis`: RootNodeNameString = js.native
  
  var `y-axis`: RootNodeNameString = js.native
}
object Xaxis {
  
  @scala.inline
  def apply(`x-axis`: RootNodeNameString, `y-axis`: RootNodeNameString): Xaxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-axis")(`x-axis`.asInstanceOf[js.Any])
    __obj.updateDynamic("y-axis")(`y-axis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xaxis]
  }
  
  @scala.inline
  implicit class XaxisMutableBuilder[Self <: Xaxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setX-axis`(value: RootNodeNameString): Self = StObject.set(x, "x-axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-axis`(value: RootNodeNameString): Self = StObject.set(x, "y-axis", value.asInstanceOf[js.Any])
  }
}
