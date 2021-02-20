package typings.d3InterpolatePath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-interpolate-path", "interpolatePath")
  @js.native
  def interpolatePath(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  @JSImport("d3-interpolate-path", "interpolatePath")
  @js.native
  def interpolatePath(
    a: String,
    b: String,
    excludeSegment: js.Function2[/* a */ PathCommandObject, /* b */ PathCommandObject, Boolean]
  ): js.Function1[/* t */ Double, String] = js.native
  
  @js.native
  trait PathCommandObject extends StObject {
    
    var `type`: String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object PathCommandObject {
    
    @scala.inline
    def apply(`type`: String, x: Double, y: Double): PathCommandObject = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathCommandObject]
    }
    
    @scala.inline
    implicit class PathCommandObjectMutableBuilder[Self <: PathCommandObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
