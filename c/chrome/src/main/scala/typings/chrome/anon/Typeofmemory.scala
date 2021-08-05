package typings.chrome.anon

import typings.chrome.chrome.system.memory.MemoryInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofmemory extends StObject {
  
  def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit
}
object Typeofmemory {
  
  inline def apply(getInfo: js.Function1[/* info */ MemoryInfo, Unit] => Unit): Typeofmemory = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo))
    __obj.asInstanceOf[Typeofmemory]
  }
  
  extension [Self <: Typeofmemory](x: Self) {
    
    inline def setGetInfo(value: js.Function1[/* info */ MemoryInfo, Unit] => Unit): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
  }
}
