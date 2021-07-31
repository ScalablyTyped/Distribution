package typings.bmapgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  var bounds: js.Array[typings.bmapgl.BMapGL.Bounds]
  
  var target: js.Any
  
  var `type`: String
}
object Bounds {
  
  @scala.inline
  def apply(bounds: js.Array[typings.bmapgl.BMapGL.Bounds], target: js.Any, `type`: String): Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: js.Array[typings.bmapgl.BMapGL.Bounds]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsVarargs(value: typings.bmapgl.BMapGL.Bounds*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
