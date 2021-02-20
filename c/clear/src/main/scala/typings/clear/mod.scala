package typings.clear

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Clear the terminal screen if possible.
    */
  @JSImport("clear", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("clear", JSImport.Namespace)
  @js.native
  def apply(opts: ClearOptions): Unit = js.native
  
  @js.native
  trait ClearOptions extends StObject {
    
    /**
      * Setting this to false will prevent this module from clearing the screen.
      * This will not remove anything from the screen, but instead move your cursor
      * to position 0,0. Much like printing a \r instead of a \n to reset the current line of output.
      *
      * @default true
      */
    var fullClear: js.UndefOr[Boolean] = js.native
  }
  object ClearOptions {
    
    @scala.inline
    def apply(): ClearOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearOptions]
    }
    
    @scala.inline
    implicit class ClearOptionsMutableBuilder[Self <: ClearOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullClear(value: Boolean): Self = StObject.set(x, "fullClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullClearUndefined: Self = StObject.set(x, "fullClear", js.undefined)
    }
  }
}
