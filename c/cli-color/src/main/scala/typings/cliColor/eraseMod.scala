package typings.cliColor

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eraseMod extends Shortcut {
  
  @JSImport("cli-color/erase", JSImport.Namespace)
  @js.native
  val ^ : Erase = js.native
  
  @js.native
  trait Erase extends StObject {
    
    /**
      * Current line
      */
    val line: String = js.native
    
    /**
      * Right portion of current line
      */
    val lineLeft: String = js.native
    
    /**
      * Left portion of current line
      */
    val lineRight: String = js.native
    
    /**
      * Entire screen
      */
    val screen: String = js.native
    
    /**
      * Left portion of a screen
      */
    val screenLeft: String = js.native
    
    /**
      * Right portion of a screen
      */
    val screenRight: String = js.native
  }
  object Erase {
    
    @scala.inline
    def apply(
      line: String,
      lineLeft: String,
      lineRight: String,
      screen: String,
      screenLeft: String,
      screenRight: String
    ): Erase = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], lineLeft = lineLeft.asInstanceOf[js.Any], lineRight = lineRight.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], screenLeft = screenLeft.asInstanceOf[js.Any], screenRight = screenRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Erase]
    }
    
    @scala.inline
    implicit class EraseMutableBuilder[Self <: Erase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineLeft(value: String): Self = StObject.set(x, "lineLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineRight(value: String): Self = StObject.set(x, "lineRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenLeft(value: String): Self = StObject.set(x, "screenLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenRight(value: String): Self = StObject.set(x, "screenRight", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Erase
  
  /* This means you don't have to write `^`, but can instead just say `eraseMod.foo` */
  override def _to: Erase = ^
}
