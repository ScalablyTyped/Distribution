package typings.awsSdkStreamCollectorNode

import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/stream-collector-node/build/collector", JSImport.Namespace)
@js.native
object collectorMod extends js.Object {
  
  @js.native
  class Collector () extends Writable {
    
    def _write(chunk: Buffer, encoding: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    val bufferedBytes: js.Array[Buffer] = js.native
  }
}
