package typings.codemirror.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Redo extends StObject {
  
  var redo: Double
  
  var undo: Double
}
object Redo {
  
  @scala.inline
  def apply(redo: Double, undo: Double): Redo = {
    val __obj = js.Dynamic.literal(redo = redo.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redo]
  }
  
  @scala.inline
  implicit class RedoMutableBuilder[Self <: Redo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedo(value: Double): Self = StObject.set(x, "redo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndo(value: Double): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
  }
}
