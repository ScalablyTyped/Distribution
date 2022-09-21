package typings.chromeApps.anon

import typings.chromeApps.chrome.system.cpu.CpuInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcpu extends StObject {
  
  /**
    * Queries basic CPU information of the system.
    * @returns Promise<CpuInfo> only if callback is not specified
    */
  def getInfo(): js.Promise[CpuInfo] = js.native
  /**
    * Queries basic CPU information of the system.
    * @param callback takes in an argument with CpuInfo
    */
  def getInfo(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit = js.native
}
