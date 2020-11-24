package typings.box2d.global.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Collision.b2RayCastInput")
@js.native
/**
  * Creates a new ray cast input.
  * @param p1 Start point of the ray, default = null.
  * @param p2 End point of the ray, default = null.
  * @param maxFraction Truncate the ray to reach up to this fraction from p1 to p2.
  **/
class b2RayCastInput ()
  extends typings.box2d.Box2D.Collision.b2RayCastInput {
  def this(p1: b2Vec2) = this()
  def this(p1: js.UndefOr[scala.Nothing], p2: b2Vec2) = this()
  def this(p1: b2Vec2, p2: b2Vec2) = this()
  def this(p1: js.UndefOr[scala.Nothing], p2: js.UndefOr[scala.Nothing], maxFraction: Double) = this()
  def this(p1: js.UndefOr[scala.Nothing], p2: b2Vec2, maxFraction: Double) = this()
  def this(p1: b2Vec2, p2: js.UndefOr[scala.Nothing], maxFraction: Double) = this()
  def this(p1: b2Vec2, p2: b2Vec2, maxFraction: Double) = this()
}
