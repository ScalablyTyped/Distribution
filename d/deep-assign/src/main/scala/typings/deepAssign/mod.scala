package typings.deepAssign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-assign", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Deeply assigns all the properties of the source objects to the
    * target object
    * @param target Base object
    * @param sources Extending objects
    */
  def apply(target: js.Any, sources: js.Any*): js.Any = js.native
  def apply[T](target: T): T = js.native
  /**
    * Deeply assigns all the properties of the source object to the
    * target object
    * @param target Base object
    * @param source Extending object
    */
  def apply[T, U](target: T, source: U): T with U = js.native
  /**
    * Deeply assigns all the properties of the source objects to the
    * target object
    * @param target Base object
    * @param source1 First extending object
    * @param source2 Second extending object
    */
  def apply[T, U, V](target: T, source1: U, source2: V): T with U with V = js.native
  /**
    * Deeply assigns all the properties of the source objects to the
    * target object
    * @param target Base object
    * @param source1 First extending object
    * @param source2 Second extending object
    * @param source3 Third extending object
    */
  def apply[T, U, V, W](target: T, source1: U, source2: V, source3: W): T with U with V with W = js.native
  /**
    * Deeply assigns all the properties of the source objects to the
    * target object
    * @param target Base object
    * @param source1 First extending object
    * @param source2 Second extending object
    * @param source3 Third extending object
    * @param source4 Fourth extending object
    */
  def apply[T, U, V, W, X](target: T, source1: U, source2: V, source3: W, source4: X): T with U with V with W with X = js.native
  /**
    * Deeply assigns all the properties of the source objects to the
    * target object
    * @param target Base object
    * @param source1 First extending object
    * @param source2 Second extending object
    * @param source3 Third extending object
    * @param source4 Fourth extending object
    * @param source5 Fifth extending object
    */
  def apply[T, U, V, W, X, Y](target: T, source1: U, source2: V, source3: W, source4: X, source5: Y): T with U with V with W with X with Y = js.native
  /**
    * Deeply assigns all the properties of the source objects to the
    * target object
    * @param target Base object
    * @param source1 First extending object
    * @param source2 Second extending object
    * @param source3 Third extending object
    * @param source4 Fourth extending object
    * @param source5 Fifth extending object
    * @param source6 Sixth extending object
    */
  def apply[T, U, V, W, X, Y, Z](target: T, source1: U, source2: V, source3: W, source4: X, source5: Y, source6: Z): T with U with V with W with X with Y with Z = js.native
}

