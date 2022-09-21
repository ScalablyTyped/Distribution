package typings.crossroads

import org.scalablytyped.runtime.Shortcut
import typings.crossroads.mod.CrossroadsJs.CrossRoadsStatic
import typings.signals.mod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object crossroads extends Shortcut {
    
    @JSGlobal("crossroads")
    @js.native
    val ^ : CrossRoadsStatic = js.native
    
    /**
      * Signal dispatched every time that crossroads.parse can't find a Route that matches the request. Useful for debuging and error handling.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("crossroads.bypassed")
    @js.native
    /**
      * Custom event broadcaster
      * <br />- inspired by Robert Penner's AS3 Signals.
      * @author Miller Medeiros
      */
    open class bypassed ()
      extends StObject
         with Signal[Any]
    
    /**
      * Signal dispatched every time that crossroads.parse find a Route that matches the request. Useful for debuging and for executing tasks that should happen at each routing.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("crossroads.routed")
    @js.native
    /**
      * Custom event broadcaster
      * <br />- inspired by Robert Penner's AS3 Signals.
      * @author Miller Medeiros
      */
    open class routed ()
      extends StObject
         with Signal[Any]
    
    type _To = CrossRoadsStatic
    
    /* This means you don't have to write `^`, but can instead just say `crossroads.foo` */
    override def _to: CrossRoadsStatic = ^
  }
}
