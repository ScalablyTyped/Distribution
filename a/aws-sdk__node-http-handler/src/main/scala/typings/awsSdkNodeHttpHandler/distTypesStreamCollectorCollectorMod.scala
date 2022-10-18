package typings.awsSdkNodeHttpHandler

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStreamCollectorCollectorMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/stream-collector/collector", "Collector")
  @js.native
  open class Collector () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def _write(chunk: Buffer, encoding: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    val bufferedBytes: js.Array[Buffer] = js.native
  }
}
