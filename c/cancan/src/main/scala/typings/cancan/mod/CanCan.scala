package typings.cancan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanCan extends js.Object {
  
  def allow[T](model: js.Any, actions: String, targets: T): Unit = js.native
  def allow[T](
    model: js.Any,
    actions: String,
    targets: T,
    condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, /* options */ js.UndefOr[js.Any], Boolean]
  ): Unit = js.native
  def allow[T](model: js.Any, actions: String, targets: T, condition: js.Object): Unit = js.native
  def allow[T](model: js.Any, actions: String, targets: String): Unit = js.native
  def allow[T](
    model: js.Any,
    actions: String,
    targets: String,
    condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, /* options */ js.UndefOr[js.Any], Boolean]
  ): Unit = js.native
  def allow[T](model: js.Any, actions: String, targets: String, condition: js.Object): Unit = js.native
  def allow[T](model: js.Any, actions: String, targets: js.Array[String | T]): Unit = js.native
  def allow[T](
    model: js.Any,
    actions: String,
    targets: js.Array[String | T],
    condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, js.UndefOr[js.Any], Boolean]
  ): Unit = js.native
  def allow[T](model: js.Any, actions: String, targets: js.Array[String | T], condition: js.Object): Unit = js.native
  def allow[T](model: js.Any, actions: js.Array[String], targets: T): Unit = js.native
  def allow[T](
    model: js.Any,
    actions: js.Array[String],
    targets: T,
    condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, /* options */ js.UndefOr[js.Any], Boolean]
  ): Unit = js.native
  def allow[T](model: js.Any, actions: js.Array[String], targets: T, condition: js.Object): Unit = js.native
  def allow[T](model: js.Any, actions: js.Array[String], targets: String): Unit = js.native
  def allow[T](
    model: js.Any,
    actions: js.Array[String],
    targets: String,
    condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, /* options */ js.UndefOr[js.Any], Boolean]
  ): Unit = js.native
  def allow[T](model: js.Any, actions: js.Array[String], targets: String, condition: js.Object): Unit = js.native
  def allow[T](model: js.Any, actions: js.Array[String], targets: js.Array[String | T]): Unit = js.native
  def allow[T](
    model: js.Any,
    actions: js.Array[String],
    targets: js.Array[String | T],
    condition: js.Function3[/* performer */ js.Any, /* target */ js.Any, js.UndefOr[js.Any], Boolean]
  ): Unit = js.native
  def allow[T](model: js.Any, actions: js.Array[String], targets: js.Array[String | T], condition: js.Object): Unit = js.native
  
  def authorize(performer: js.Any, action: String, target: js.Any): Unit = js.native
  def authorize(performer: js.Any, action: String, target: js.Any, options: js.Any): Unit = js.native
  
  def can(performer: js.Any, action: String, target: js.Any): Boolean = js.native
  def can(performer: js.Any, action: String, target: js.Any, options: js.Any): Boolean = js.native
  
  def cannot(performer: js.Any, action: String, target: js.Any): Boolean = js.native
  def cannot(performer: js.Any, action: String, target: js.Any, options: js.Any): Boolean = js.native
}
