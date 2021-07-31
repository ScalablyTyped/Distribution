package typings.d3InterpolatePath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-interpolate-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def interpolatePath(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolatePath")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  @scala.inline
  def interpolatePath(
    a: String,
    b: String,
    excludeSegment: js.Function2[/* a */ PathCommandObject, /* b */ PathCommandObject, Boolean]
  ): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolatePath")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], excludeSegment.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  trait PathCommandObject extends StObject {
    
    var `type`: String
    
    var x: Double
    
    var y: Double
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
