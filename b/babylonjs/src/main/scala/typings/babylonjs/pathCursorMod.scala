package typings.babylonjs

import typings.babylonjs.mathPathMod.Path2
import typings.babylonjs.mathVectorMod.Vector3
import typings.std.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathCursorMod {
  
  @JSImport("babylonjs/Animations/pathCursor", "PathCursor")
  @js.native
  class PathCursor protected () extends StObject {
    /**
      * Initializes the path cursor
      * @param path The path to track
      */
    def this(path: Path2) = this()
    
    /**
      * Stores path cursor callbacks for when an onchange event is triggered
      */
    var _onchange: js.Any = js.native
    
    /**
      * The animation array of the path cursor
      */
    var animations: js.Array[Animation] = js.native
    
    /**
      * Ensures that the value is limited between zero and one
      * @returns This path cursor
      */
    var ensureLimits: js.Any = js.native
    
    /**
      * Gets the cursor point on the path
      * @returns A point on the path cursor at the cursor location
      */
    def getPoint(): Vector3 = js.native
    
    /**
      * Moves the cursor by the step amount
      * If the step amount is greater than one, an exception is thrown
      * @param step The amount to move the cursor
      * @returns This path cursor
      */
    def move(step: Double): PathCursor = js.native
    
    /**
      * Moves the cursor ahead by the step amount
      * @param step The amount to move the cursor forward
      * @returns This path cursor
      */
    def moveAhead(): PathCursor = js.native
    def moveAhead(step: Double): PathCursor = js.native
    
    /**
      * Moves the cursor behind by the step amount
      * @param step The amount to move the cursor back
      * @returns This path cursor
      */
    def moveBack(): PathCursor = js.native
    def moveBack(step: Double): PathCursor = js.native
    
    /**
      * Executes a function on change
      * @param f A path cursor onchange callback
      * @returns This path cursor
      */
    def onchange(f: js.Function1[/* cursor */ this.type, Unit]): PathCursor = js.native
    
    var path: js.Any = js.native
    
    /**
      * Runs onchange callbacks on change (used by the animation engine)
      * @returns This path cursor
      */
    var raiseOnChange: js.Any = js.native
    
    /**
      * The value of the path cursor
      */
    var value: Double = js.native
  }
}
