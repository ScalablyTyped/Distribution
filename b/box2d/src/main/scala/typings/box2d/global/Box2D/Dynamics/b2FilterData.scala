package typings.box2d.global.Box2D.Dynamics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Dynamics.b2FilterData")
@js.native
open class b2FilterData ()
  extends StObject
     with typings.box2d.Box2D.Dynamics.b2FilterData {
  
  /**
    * Creates a copy of the filter data.
    * @return Copy of this filter data.
    **/
  /* CompleteClass */
  override def Copy(): typings.box2d.Box2D.Dynamics.b2FilterData = js.native
  
  /**
    * The collision category bits. Normally you would just set one bit.
    **/
  /* CompleteClass */
  var categoryBits: Double = js.native
  
  /**
    * Collision groups allow a certain group of objects to never collide (negative) or always collide (positive). Zero means no collision group. Non-zero group filtering always wins against the mask bits.
    **/
  /* CompleteClass */
  var groupIndex: Double = js.native
  
  /**
    * The collision mask bits. This states the categories that this shape would accept for collision.
    **/
  /* CompleteClass */
  var maskBits: Double = js.native
}
