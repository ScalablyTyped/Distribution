package typings.chrome.anon

import typings.chrome.chrome.system.cpu.CpuInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcpu extends StObject {
  
  def getInfo(): js.Promise[CpuInfo] = js.native
  def getInfo(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit = js.native
}
