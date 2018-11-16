package typings
package box2dLib.Box2DNs.DynamicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.b2FilterData")
@js.native
class b2FilterData () extends js.Object {
  /**
  		* The collision category bits. Normally you would just set one bit.
  		**/
  var categoryBits: scala.Double = js.native
  /**
  		* Collision groups allow a certain group of objects to never collide (negative) or always collide (positive). Zero means no collision group. Non-zero group filtering always wins against the mask bits.
  		**/
  var groupIndex: scala.Double = js.native
  /**
  		* The collision mask bits. This states the categories that this shape would accept for collision.
  		**/
  var maskBits: scala.Double = js.native
  /**
  		* Creates a copy of the filter data.
  		* @return Copy of this filter data.
  		**/
  def Copy(): b2FilterData = js.native
}

