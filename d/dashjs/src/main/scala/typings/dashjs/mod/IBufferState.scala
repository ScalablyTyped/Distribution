package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBufferState extends StObject {
  
  var state: String = js.native
  
  var target: Double = js.native
}
object IBufferState {
  
  @scala.inline
  def apply(state: String, target: Double): IBufferState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferState]
  }
  
  @scala.inline
  implicit class IBufferStateMutableBuilder[Self <: IBufferState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
