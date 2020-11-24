package typings.box2d.global.Box2D.Dynamics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Dynamics.b2DebugDraw")
@js.native
/**
  * Constructor.
  **/
class b2DebugDraw ()
  extends typings.box2d.Box2D.Dynamics.b2DebugDraw
/* static members */
@JSGlobal("Box2D.Dynamics.b2DebugDraw")
@js.native
object b2DebugDraw extends js.Object {
  
  /**
    * Draw axis aligned bounding boxes.
    **/
  var e_aabbBit: Double = js.native
  
  /**
    * Draw center of mass frame.
    **/
  var e_centerOfMassBit: Double = js.native
  
  /**
    * Draw controllers.
    **/
  var e_controllerBit: Double = js.native
  
  /**
    * Draw joint connections.
    **/
  var e_jointBit: Double = js.native
  
  /**
    * Draw broad-phase pairs.
    **/
  var e_pairBit: Double = js.native
  
  /**
    * Draw shapes.
    **/
  var e_shapeBit: Double = js.native
}
