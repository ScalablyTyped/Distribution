package typings.clamavJs

import typings.clamavJs.clamavJsNumbers.`3310`
import typings.clamavJs.clamavJsStrings.localhost
import typings.node.fsMod.ReadStream
import typings.node.streamMod.Stream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clamav.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("clamav.js", "ClamAVChannel")
  @js.native
  class ClamAVChannel () extends StObject {
    
    def _flush(callback: js.Function0[js.Any]): Unit = js.native
    
    def _transform(chunk: Double, encoding: js.Any, callback: js.Function0[js.Any]): Unit = js.native
  }
  
  @scala.inline
  def clamavfilescan(
    port: Double,
    host: String,
    filename: String,
    callback: js.Function3[/* error */ Error, /* object */ js.Any, /* result */ String, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clamavfilescan")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def clamavpathscan(
    port: Double,
    host: String,
    pathname: String,
    callback: js.Function3[/* error */ Error, /* object */ js.Any, /* result */ String, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clamavpathscan")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def clamavstreamscan(
    port: Double,
    host: String,
    stream: ReadStream,
    complete: js.Function1[/* stream */ Stream | ReadStream, js.Any],
    `object`: js.Any,
    callback: js.Function3[/* error */ Error, /* object */ js.Any, /* result */ String, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clamavstreamscan")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def clamavstreamscan(
    port: Double,
    host: String,
    stream: Stream,
    complete: js.Function1[/* stream */ Stream | ReadStream, js.Any],
    `object`: js.Any,
    callback: js.Function3[/* error */ Error, /* object */ js.Any, /* result */ String, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clamavstreamscan")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createScanner(port: Double, host: String): ClamScanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ClamScanner]
  
  @scala.inline
  def ping(
    port: Double,
    host: String,
    timeout: Double,
    callback: js.Function1[/* error */ js.UndefOr[Error], js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ping")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def version(
    port: Double,
    host: String,
    timeout: Double,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* status */ js.UndefOr[String], js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("version")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait ClamScanner extends StObject {
    
    var host: String | localhost = js.native
    
    var port: `3310` | Double = js.native
    
    def scan(
      `object`: String,
      callback: js.Function3[/* error */ Error, /* object */ js.Any, /* result */ String, js.Any]
    ): Unit = js.native
    def scan(
      `object`: ReadStream,
      callback: js.Function3[/* error */ Error, /* object */ js.Any, /* result */ String, js.Any]
    ): Unit = js.native
    def scan(
      `object`: Stream,
      callback: js.Function3[/* error */ Error, /* object */ js.Any, /* result */ String, js.Any]
    ): Unit = js.native
  }
}
