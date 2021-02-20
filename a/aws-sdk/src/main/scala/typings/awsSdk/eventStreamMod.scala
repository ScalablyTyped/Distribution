package typings.awsSdk

import typings.awsSdk.awsSdkStrings.data_
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventStreamMod {
  
  type EventStream[Events] = StreamingEventStream[Events] | js.Array[Events]
  
  @js.native
  trait StreamingEventStream[Events] extends ReadableStream {
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_data(event: data_, listener: js.Function1[/* event */ Events, Unit]): this.type = js.native
  }
}
