package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayToolsMod {
  
  @JSImport("babylonjs/Misc/arrayTools", "ArrayTools")
  @js.native
  class ArrayTools () extends StObject
  /* static members */
  object ArrayTools {
    
    @JSImport("babylonjs/Misc/arrayTools", "ArrayTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an array of the given size filled with element built from the given constructor and the paramters
      * @param size the number of element to construct and put in the array
      * @param itemBuilder a callback responsible for creating new instance of item. Called once per array entry.
      * @returns a new array filled with new objects
      */
    inline def BuildArray[T](size: Double, itemBuilder: js.Function0[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildArray")(size.asInstanceOf[js.Any], itemBuilder.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  }
}
