package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in c3.c3.AxisName ]: number} */
@js.native
trait keyinAxisNamenumber extends StObject {
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var y2: Double = js.native
}
object keyinAxisNamenumber {
  
  @scala.inline
  def apply(x: Double, y: Double, y2: Double): keyinAxisNamenumber = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinAxisNamenumber]
  }
  
  @scala.inline
  implicit class keyinAxisNamenumberMutableBuilder[Self <: keyinAxisNamenumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
