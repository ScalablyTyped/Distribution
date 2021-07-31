package typings.blessed.mod.Widgets

import typings.blessed.mod.Widgets.Types.TMouseAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Events {
  
  trait IKeyEventArg extends StObject {
    
    var ctrl: Boolean
    
    var full: String
    
    var meta: Boolean
    
    var name: String
    
    var sequence: String
    
    var shift: Boolean
  }
  object IKeyEventArg {
    
    @scala.inline
    def apply(ctrl: Boolean, full: String, meta: Boolean, name: String, sequence: String, shift: Boolean): IKeyEventArg = {
      val __obj = js.Dynamic.literal(ctrl = ctrl.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyEventArg]
    }
    
    @scala.inline
    implicit class IKeyEventArgMutableBuilder[Self <: IKeyEventArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMouseEventArg extends StObject {
    
    var action: TMouseAction
    
    var x: Double
    
    var y: Double
  }
  object IMouseEventArg {
    
    @scala.inline
    def apply(action: TMouseAction, x: Double, y: Double): IMouseEventArg = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMouseEventArg]
    }
    
    @scala.inline
    implicit class IMouseEventArgMutableBuilder[Self <: IMouseEventArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: TMouseAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
