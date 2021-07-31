package typings.copyPaste

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("copy-paste", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def copy[T](content: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(content.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def copy[T](content: T, callback: CopyCallback): T = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def paste(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")().asInstanceOf[String]
  @scala.inline
  def paste(callback: PasteCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type CopyCallback = js.Function1[/* err */ Error, Unit]
  
  type PasteCallback = js.Function2[/* err */ Error, /* content */ String, Unit]
}
