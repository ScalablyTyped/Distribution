package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait Clipboard
  extends StObject
     with EventTarget {
  
  def read(): Promise[ClipboardItems] = js.native
  
  def readText(): Promise[java.lang.String] = js.native
  
  def write(data: ClipboardItems): Promise[Unit] = js.native
  
  def writeText(data: java.lang.String): Promise[Unit] = js.native
}
