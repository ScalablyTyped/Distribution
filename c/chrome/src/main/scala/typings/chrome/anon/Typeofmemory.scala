package typings.chrome.anon

import typings.chrome.chrome.system.memory.MemoryInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmemory extends StObject {
  
  def getInfo(): js.Promise[MemoryInfo] = js.native
  def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit = js.native
}
