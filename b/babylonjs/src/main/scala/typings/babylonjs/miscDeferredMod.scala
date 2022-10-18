package typings.babylonjs

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscDeferredMod {
  
  @JSImport("babylonjs/Misc/deferred", "Deferred")
  @js.native
  /**
    * Constructor for this deferred object.
    */
  open class Deferred[T] () extends StObject {
    
    /* private */ var _reject: Any = js.native
    
    /* private */ var _resolve: Any = js.native
    
    /**
      * The promise associated with this deferred object.
      */
    val promise: js.Promise[T] = js.native
    
    /**
      * The reject method of the promise associated with this deferred object.
      */
    def reject: js.Function1[/* reason */ js.UndefOr[Any], Unit] = js.native
    
    /**
      * The resolve method of the promise associated with this deferred object.
      */
    def resolve: js.Function1[/* value */ T | PromiseLike[T], Unit] = js.native
  }
}
