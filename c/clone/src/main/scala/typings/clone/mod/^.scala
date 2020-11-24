package typings.clone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("clone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[T](`val`: T): T = js.native
  def apply[T](
    `val`: T,
    circular: js.UndefOr[scala.Nothing],
    depth: js.UndefOr[scala.Nothing],
    prototype: js.UndefOr[scala.Nothing],
    includeNonEnumerable: Boolean
  ): T = js.native
  def apply[T](`val`: T, circular: js.UndefOr[scala.Nothing], depth: js.UndefOr[scala.Nothing], prototype: js.Any): T = js.native
  def apply[T](
    `val`: T,
    circular: js.UndefOr[scala.Nothing],
    depth: js.UndefOr[scala.Nothing],
    prototype: js.Any,
    includeNonEnumerable: Boolean
  ): T = js.native
  def apply[T](`val`: T, circular: js.UndefOr[scala.Nothing], depth: Double): T = js.native
  def apply[T](
    `val`: T,
    circular: js.UndefOr[scala.Nothing],
    depth: Double,
    prototype: js.UndefOr[scala.Nothing],
    includeNonEnumerable: Boolean
  ): T = js.native
  def apply[T](`val`: T, circular: js.UndefOr[scala.Nothing], depth: Double, prototype: js.Any): T = js.native
  def apply[T](
    `val`: T,
    circular: js.UndefOr[scala.Nothing],
    depth: Double,
    prototype: js.Any,
    includeNonEnumerable: Boolean
  ): T = js.native
  def apply[T](`val`: T, circular: Boolean): T = js.native
  def apply[T](
    `val`: T,
    circular: Boolean,
    depth: js.UndefOr[scala.Nothing],
    prototype: js.UndefOr[scala.Nothing],
    includeNonEnumerable: Boolean
  ): T = js.native
  def apply[T](`val`: T, circular: Boolean, depth: js.UndefOr[scala.Nothing], prototype: js.Any): T = js.native
  def apply[T](
    `val`: T,
    circular: Boolean,
    depth: js.UndefOr[scala.Nothing],
    prototype: js.Any,
    includeNonEnumerable: Boolean
  ): T = js.native
  def apply[T](`val`: T, circular: Boolean, depth: Double): T = js.native
  def apply[T](
    `val`: T,
    circular: Boolean,
    depth: Double,
    prototype: js.UndefOr[scala.Nothing],
    includeNonEnumerable: Boolean
  ): T = js.native
  def apply[T](`val`: T, circular: Boolean, depth: Double, prototype: js.Any): T = js.native
  def apply[T](`val`: T, circular: Boolean, depth: Double, prototype: js.Any, includeNonEnumerable: Boolean): T = js.native
  /**
    * @param val the value that you want to clone, any type allowed
    * @param opts a single object that specifies circular, depth, prototype and includeNonEnumerable.
    * @param opts.circular Call clone with circular set to false if you are certain that obj contains no circular references. This will give better performance if needed. There is no error if undefined or null is passed as obj.
    * @param opts.depth Sets depth to which the object is to be cloned (optional, defaults to infinity)
    * @param opts.prototype Sets the prototype to be used when cloning an Object (optional, defaults to __proto__)
    * @param opts.includeNonEnumerable Set to true if the non-enumerable properties should be cloned as well (optional, defaults to false)
    */
  def apply[T](`val`: T, opts: CloneOpts): T = js.native
}
