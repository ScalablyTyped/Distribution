package typings.chrome.anon

import typings.chrome.chrome.system.memory.MemoryInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofmemory extends StObject {
  
  def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit
}
object Typeofmemory {
  
  @scala.inline
  def apply(getInfo: js.Function1[/* info */ MemoryInfo, Unit] => Unit): Typeofmemory = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo))
    __obj.asInstanceOf[Typeofmemory]
  }
  
  @scala.inline
  implicit class TypeofmemoryMutableBuilder[Self <: Typeofmemory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInfo(value: js.Function1[/* info */ MemoryInfo, Unit] => Unit): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
  }
}
