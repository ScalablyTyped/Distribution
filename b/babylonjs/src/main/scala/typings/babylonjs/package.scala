package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object babylonjs {
  
  type XRAnchorSet = typings.std.Set[typings.babylonjs.XRAnchor]
  
  type XREventHandler = js.Function1[/* callback */ js.Any, scala.Unit]
  
  type XRFrameRequestCallback = js.Function2[
    /* time */ typings.std.DOMHighResTimeStamp, 
    /* frame */ typings.babylonjs.XRFrame, 
    scala.Unit
  ]
  
  type XRInputSourceArray = js.Array[typings.babylonjs.XRInputSource]
  
  type XRJointSpace = typings.babylonjs.XRSpace
  
  type XRLayer = typings.std.EventTarget
  
  type XRPlaneSet = typings.std.Set[typings.babylonjs.XRPlane]
  
  // tslint:disable-next-line no-empty-interface
  type XRSpace = typings.std.EventTarget
}
