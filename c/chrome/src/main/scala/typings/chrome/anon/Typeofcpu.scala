package typings.chrome.anon

import typings.chrome.chrome.system.cpu.CpuInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcpu extends StObject {
  
  def getInfo(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit
}
object Typeofcpu {
  
  @scala.inline
  def apply(getInfo: js.Function1[/* info */ CpuInfo, Unit] => Unit): Typeofcpu = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo))
    __obj.asInstanceOf[Typeofcpu]
  }
  
  @scala.inline
  implicit class TypeofcpuMutableBuilder[Self <: Typeofcpu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInfo(value: js.Function1[/* info */ CpuInfo, Unit] => Unit): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
  }
}
