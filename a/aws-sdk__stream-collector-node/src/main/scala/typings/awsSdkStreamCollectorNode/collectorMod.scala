package typings.awsSdkStreamCollectorNode

import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectorMod {
  
  @JSImport("@aws-sdk/stream-collector-node/build/collector", "Collector")
  @js.native
  class Collector () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def _write(chunk: Buffer, encoding: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    val bufferedBytes: js.Array[Buffer] = js.native
  }
}
