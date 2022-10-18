package typings.browserfs

import typings.browserfs.browserfsStrings.buffer
import typings.browserfs.browserfsStrings.json
import typings.browserfs.distNodeCoreApiErrorMod.ApiError
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeGenericXhrMod {
  
  @JSImport("browserfs/dist/node/generic/xhr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncDownloadFile(p: String, `type`: String, cb: BFSCallback[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncDownloadFile")(p.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def asyncDownloadFile(p: String, `type`: buffer, cb: BFSCallback[Buffer]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncDownloadFile")(p.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def asyncDownloadFile(p: String, `type`: json, cb: BFSCallback[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncDownloadFile")(p.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFileSizeAsync(p: String, cb: js.Function2[/* err */ ApiError, /* size */ js.UndefOr[Double], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileSizeAsync")(p.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFileSizeSync(p: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSizeSync")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def syncDownloadFile(p: String, `type`: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("syncDownloadFile")(p.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def syncDownloadFile(p: String, `type`: buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("syncDownloadFile")(p.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def syncDownloadFile(p: String, `type`: json): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("syncDownloadFile")(p.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
}
