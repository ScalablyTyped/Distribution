package typings
package cancanLib.cancanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanCan extends js.Object {
  def allow[T](model: js.Any, actions: java.lang.String, targets: T): scala.Unit = js.native
  def allow[T](
    model: js.Any,
    actions: java.lang.String,
    targets: T,
    condition: js.Function3[
      /* performer */ js.Any, 
      /* target */ js.Any, 
      /* options */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def allow[T](model: js.Any, actions: java.lang.String, targets: T, condition: js.Object): scala.Unit = js.native
  def allow[T](model: js.Any, actions: java.lang.String, targets: java.lang.String): scala.Unit = js.native
  def allow[T](
    model: js.Any,
    actions: java.lang.String,
    targets: java.lang.String,
    condition: js.Function3[
      /* performer */ js.Any, 
      /* target */ js.Any, 
      /* options */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def allow[T](model: js.Any, actions: java.lang.String, targets: java.lang.String, condition: js.Object): scala.Unit = js.native
  def allow[T](model: js.Any, actions: java.lang.String, targets: js.Array[java.lang.String | T]): scala.Unit = js.native
  def allow[T](
    model: js.Any,
    actions: java.lang.String,
    targets: js.Array[java.lang.String | T],
    condition: js.Function3[
      /* performer */ js.Any, 
      /* target */ js.Any, 
      /* options */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def allow[T](
    model: js.Any,
    actions: java.lang.String,
    targets: js.Array[java.lang.String | T],
    condition: js.Object
  ): scala.Unit = js.native
  def allow[T](model: js.Any, actions: js.Array[java.lang.String], targets: T): scala.Unit = js.native
  def allow[T](
    model: js.Any,
    actions: js.Array[java.lang.String],
    targets: T,
    condition: js.Function3[
      /* performer */ js.Any, 
      /* target */ js.Any, 
      /* options */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def allow[T](model: js.Any, actions: js.Array[java.lang.String], targets: T, condition: js.Object): scala.Unit = js.native
  def allow[T](model: js.Any, actions: js.Array[java.lang.String], targets: java.lang.String): scala.Unit = js.native
  def allow[T](
    model: js.Any,
    actions: js.Array[java.lang.String],
    targets: java.lang.String,
    condition: js.Function3[
      /* performer */ js.Any, 
      /* target */ js.Any, 
      /* options */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def allow[T](
    model: js.Any,
    actions: js.Array[java.lang.String],
    targets: java.lang.String,
    condition: js.Object
  ): scala.Unit = js.native
  def allow[T](model: js.Any, actions: js.Array[java.lang.String], targets: js.Array[java.lang.String | T]): scala.Unit = js.native
  def allow[T](
    model: js.Any,
    actions: js.Array[java.lang.String],
    targets: js.Array[java.lang.String | T],
    condition: js.Function3[
      /* performer */ js.Any, 
      /* target */ js.Any, 
      /* options */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def allow[T](
    model: js.Any,
    actions: js.Array[java.lang.String],
    targets: js.Array[java.lang.String | T],
    condition: js.Object
  ): scala.Unit = js.native
  def authorize(performer: js.Any, action: java.lang.String, target: js.Any): scala.Unit = js.native
  def authorize(performer: js.Any, action: java.lang.String, target: js.Any, options: js.Any): scala.Unit = js.native
  def can(performer: js.Any, action: java.lang.String, target: js.Any): scala.Boolean = js.native
  def can(performer: js.Any, action: java.lang.String, target: js.Any, options: js.Any): scala.Boolean = js.native
  def cannot(performer: js.Any, action: java.lang.String, target: js.Any): scala.Boolean = js.native
  def cannot(performer: js.Any, action: java.lang.String, target: js.Any, options: js.Any): scala.Boolean = js.native
}

