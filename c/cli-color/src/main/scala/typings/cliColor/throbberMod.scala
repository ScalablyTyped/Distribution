package typings.cliColor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throbberMod {
  
  /**
    * Writes throbber string to *write* function at given *interval*. Optionally throbber output can be formatted with given *format* function
    */
  @JSImport("cli-color/throbber", JSImport.Namespace)
  @js.native
  def apply(write: js.Function1[/* str */ String, Unit], interval: Double): Throbber = js.native
  @JSImport("cli-color/throbber", JSImport.Namespace)
  @js.native
  def apply(
    write: js.Function1[/* str */ String, Unit],
    interval: Double,
    format: js.Function1[/* throbber */ String, String]
  ): Throbber = js.native
  
  @JSImport("cli-color/throbber", "Iterator")
  @js.native
  class Iterator () extends StObject {
    
    val index: Double = js.native
    
    def next(): String = js.native
    
    def reset(): String = js.native
    
    val running: Boolean = js.native
  }
  
  @js.native
  trait Throbber extends StObject {
    
    def restart(): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  object Throbber {
    
    @scala.inline
    def apply(restart: () => Unit, start: () => Unit, stop: () => Unit): Throbber = {
      val __obj = js.Dynamic.literal(restart = js.Any.fromFunction0(restart), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Throbber]
    }
    
    @scala.inline
    implicit class ThrobberMutableBuilder[Self <: Throbber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
