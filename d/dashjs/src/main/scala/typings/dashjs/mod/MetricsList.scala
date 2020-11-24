package typings.dashjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "MetricsList")
@js.native
class MetricsList () extends js.Object {
  
  var BufferLevel: js.Array[IBufferLevel] = js.native
  
  var BufferState: js.Array[IBufferState] = js.native
  
  var DVBErrors: js.Array[_] = js.native
  
  var DVRInfo: js.Array[IDVRInfo] = js.native
  
  var DroppedFrames: js.Array[IDroppedFrames] = js.native
  
  var HttpList: js.Array[_] = js.native
  
  var ManifestUpdate: js.Array[_] = js.native
  
  var PlayList: js.Array[_] = js.native
  
  var RepSwitchList: js.Array[_] = js.native
  
  var RequestsQueue: typings.dashjs.mod.RequestsQueue | Null = js.native
  
  var SchedulingInfo: js.Array[_] = js.native
  
  var TcpList: js.Array[_] = js.native
}
