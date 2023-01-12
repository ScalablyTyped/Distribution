package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xaxis extends StObject {
  
  var `x-axis`: RootNodeNameString
  
  var `y-axis`: RootNodeNameString
}
object Xaxis {
  
  inline def apply(`x-axis`: RootNodeNameString, `y-axis`: RootNodeNameString): Xaxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-axis")(`x-axis`.asInstanceOf[js.Any])
    __obj.updateDynamic("y-axis")(`y-axis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xaxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xaxis] (val x: Self) extends AnyVal {
    
    inline def `setX-axis`(value: RootNodeNameString): Self = StObject.set(x, "x-axis", value.asInstanceOf[js.Any])
    
    inline def `setY-axis`(value: RootNodeNameString): Self = StObject.set(x, "y-axis", value.asInstanceOf[js.Any])
  }
}
