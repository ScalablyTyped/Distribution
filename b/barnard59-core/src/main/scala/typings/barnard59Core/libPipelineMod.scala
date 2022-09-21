package typings.barnard59Core

import typings.barnard59Core.anon.FnCall
import typings.readableStream.mod.Readable
import typings.readableStream.mod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPipelineMod {
  
  @JSImport("barnard59-core/lib/Pipeline", JSImport.Default)
  @js.native
  open class default () extends Pipeline
  
  @js.native
  trait Pipeline
    extends typings.barnard59Core.streamObjectMod.default {
    
    def destroy(err: js.Error): Unit = js.native
    
    def finish(): FnCall = js.native
    
    def firstChild: typings.barnard59Core.streamObjectMod.default = js.native
    
    def init(): Unit = js.native
    
    def lastChild: typings.barnard59Core.streamObjectMod.default = js.native
    
    def onInit(): Unit = js.native
    
    var readable: Boolean = js.native
    
    var readableObjectMode: Boolean = js.native
    
    @JSName("stream")
    var stream_Pipeline: Readable | Writable = js.native
    
    var writable: Boolean = js.native
    
    var writableObjectMode: Boolean = js.native
  }
}
