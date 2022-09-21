package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "MetricsList")
@js.native
open class MetricsList () extends StObject {
  
  var BufferLevel: js.Array[IBufferLevel] = js.native
  
  var BufferState: js.Array[IBufferState] = js.native
  
  var DVBErrors: js.Array[Any] = js.native
  
  var DVRInfo: js.Array[IDVRInfo] = js.native
  
  var DroppedFrames: js.Array[IDroppedFrames] = js.native
  
  var HttpList: js.Array[Any] = js.native
  
  var ManifestUpdate: js.Array[Any] = js.native
  
  var PlayList: js.Array[Any] = js.native
  
  var RepSwitchList: js.Array[Any] = js.native
  
  var RequestsQueue: typings.dashjs.mod.RequestsQueue | Null = js.native
  
  var SchedulingInfo: js.Array[Any] = js.native
  
  var TcpList: js.Array[Any] = js.native
}
