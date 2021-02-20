package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionFunction extends StObject {
  
  var positionFunction: js.UndefOr[js.Any] = js.native
  
  var storage: js.UndefOr[js.Array[js.Any]] = js.native
  
  var vertexFunction: js.UndefOr[js.Any] = js.native
}
object PositionFunction {
  
  @scala.inline
  def apply(): PositionFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionFunction]
  }
  
  @scala.inline
  implicit class PositionFunctionMutableBuilder[Self <: PositionFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPositionFunction(value: js.Any): Self = StObject.set(x, "positionFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionFunctionUndefined: Self = StObject.set(x, "positionFunction", js.undefined)
    
    @scala.inline
    def setStorage(value: js.Array[js.Any]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    @scala.inline
    def setStorageVarargs(value: js.Any*): Self = StObject.set(x, "storage", js.Array(value :_*))
    
    @scala.inline
    def setVertexFunction(value: js.Any): Self = StObject.set(x, "vertexFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexFunctionUndefined: Self = StObject.set(x, "vertexFunction", js.undefined)
  }
}
