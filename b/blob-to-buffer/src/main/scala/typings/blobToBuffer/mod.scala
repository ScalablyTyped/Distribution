package typings.blobToBuffer

import typings.node.bufferMod.global.Buffer
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(blob: Blob, callback: js.Function2[/* error */ Any, /* buffer */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(blob.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("blob-to-buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
