package typings.copyPaste

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("copy-paste", "copy")
  @js.native
  def copy[T](content: T): T = js.native
  @JSImport("copy-paste", "copy")
  @js.native
  def copy[T](content: T, callback: CopyCallback): T = js.native
  
  @JSImport("copy-paste", "paste")
  @js.native
  def paste(): String = js.native
  @JSImport("copy-paste", "paste")
  @js.native
  def paste(callback: PasteCallback): Unit = js.native
  
  type CopyCallback = js.Function1[/* err */ Error, Unit]
  
  type PasteCallback = js.Function2[/* err */ Error, /* content */ String, Unit]
}
