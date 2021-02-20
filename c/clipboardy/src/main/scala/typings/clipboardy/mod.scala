package typings.clipboardy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clipboardy", "read")
  @js.native
  def read(): js.Promise[String] = js.native
  
  @JSImport("clipboardy", "readSync")
  @js.native
  def readSync(): String = js.native
  
  @JSImport("clipboardy", "write")
  @js.native
  def write(text: String): js.Promise[Unit] = js.native
  
  @JSImport("clipboardy", "writeSync")
  @js.native
  def writeSync(text: String): Unit = js.native
}
