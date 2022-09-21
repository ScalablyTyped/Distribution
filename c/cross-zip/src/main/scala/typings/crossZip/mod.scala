package typings.crossZip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cross-zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unzip(inPath: String, outPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(inPath.asInstanceOf[js.Any], outPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unzip(inPath: String, outPath: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(inPath.asInstanceOf[js.Any], outPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unzipSync(inPath: String, outPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(inPath.asInstanceOf[js.Any], outPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def zip(inPath: String, outPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(inPath.asInstanceOf[js.Any], outPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zip(inPath: String, outPath: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(inPath.asInstanceOf[js.Any], outPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def zipSync(inPath: String, outPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zipSync")(inPath.asInstanceOf[js.Any], outPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
