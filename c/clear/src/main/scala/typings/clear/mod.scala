package typings.clear

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Clear the terminal screen if possible.
    */
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opts: ClearOptions): Unit = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("clear", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ClearOptions extends StObject {
    
    /**
      * Setting this to false will prevent this module from clearing the screen.
      * This will not remove anything from the screen, but instead move your cursor
      * to position 0,0. Much like printing a \r instead of a \n to reset the current line of output.
      *
      * @default true
      */
    var fullClear: js.UndefOr[Boolean] = js.undefined
  }
  object ClearOptions {
    
    inline def apply(): ClearOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearOptions]
    }
    
    extension [Self <: ClearOptions](x: Self) {
      
      inline def setFullClear(value: Boolean): Self = StObject.set(x, "fullClear", value.asInstanceOf[js.Any])
      
      inline def setFullClearUndefined: Self = StObject.set(x, "fullClear", js.undefined)
    }
  }
}
