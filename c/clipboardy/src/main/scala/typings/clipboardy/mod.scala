package typings.clipboardy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clipboardy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def read(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")().asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def readSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readSync")().asInstanceOf[String]
  
  @scala.inline
  def write(text: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def writeSync(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
