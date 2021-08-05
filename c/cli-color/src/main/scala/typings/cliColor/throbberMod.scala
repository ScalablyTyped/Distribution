package typings.cliColor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throbberMod {
  
  /**
    * Writes throbber string to *write* function at given *interval*. Optionally throbber output can be formatted with given *format* function
    */
  inline def apply(write: js.Function1[/* str */ String, Unit], interval: Double): Throbber = (^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Throbber]
  inline def apply(
    write: js.Function1[/* str */ String, Unit],
    interval: Double,
    format: js.Function1[/* throbber */ String, String]
  ): Throbber = (^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Throbber]
  
  @JSImport("cli-color/throbber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cli-color/throbber", "Iterator")
  @js.native
  class Iterator () extends StObject {
    
    val index: Double = js.native
    
    def next(): String = js.native
    
    def reset(): String = js.native
    
    val running: Boolean = js.native
  }
  
  trait Throbber extends StObject {
    
    def restart(): Unit
    
    def start(): Unit
    
    def stop(): Unit
  }
  object Throbber {
    
    inline def apply(restart: () => Unit, start: () => Unit, stop: () => Unit): Throbber = {
      val __obj = js.Dynamic.literal(restart = js.Any.fromFunction0(restart), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Throbber]
    }
    
    extension [Self <: Throbber](x: Self) {
      
      inline def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
