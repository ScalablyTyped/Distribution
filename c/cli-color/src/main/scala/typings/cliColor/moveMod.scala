package typings.cliColor

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveMod extends Shortcut {
  
  @JSImport("cli-color/move", JSImport.Namespace)
  @js.native
  val ^ : Move = js.native
  
  /**
    * Move around functions
    */
  @js.native
  trait Move extends StObject {
    
    /**
      * Move cursor x columns and y rows away. Values can be positive or negative
      */
    def apply(): String = js.native
    def apply(x: js.UndefOr[scala.Nothing], y: Double): String = js.native
    def apply(x: Double): String = js.native
    def apply(x: Double, y: Double): String = js.native
    
    /**
      * Move cursor to bottom of a screen
      */
    val bottom: String = js.native
    
    /**
      * Move cursor down n rows
      */
    def down(): String = js.native
    def down(n: Double): String = js.native
    
    /**
      * Move cursor left n columns
      */
    def left(): String = js.native
    def left(n: Double): String = js.native
    
    /**
      * Move cursor to begin of a line
      */
    val lineBegin: String = js.native
    
    /**
      * Move cursor to end of a line
      */
    val lineEnd: String = js.native
    
    /**
      * Move cursor n lines forward if n is positive, otherwise n lines backward, and place it at line beginning
      */
    def lines(): String = js.native
    def lines(n: Double): String = js.native
    
    /**
      * Move cursor right n columns
      */
    def right(): String = js.native
    def right(n: Double): String = js.native
    
    /**
      * Absolute move. Sets cursor position at x column and y row
      */
    def to(): String = js.native
    def to(x: js.UndefOr[scala.Nothing], y: Double): String = js.native
    def to(x: Double): String = js.native
    def to(x: Double, y: Double): String = js.native
    
    /**
      * Move cursor to top of a screen
      */
    val top: String = js.native
    
    /**
      * Move cursor up n rows
      */
    def up(): String = js.native
    def up(n: Double): String = js.native
  }
  
  type MoveFunction1 = js.Function1[/* n */ js.UndefOr[Double], String]
  
  type MoveFunction2 = js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], String]
  
  type _To = Move
  
  /* This means you don't have to write `^`, but can instead just say `moveMod.foo` */
  override def _to: Move = ^
}
