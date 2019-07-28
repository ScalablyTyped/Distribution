package typings.cacheDashManager.cacheDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def del(key: String): js.Promise[_] = js.native
  def del(key: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def get[T](key: String): js.Promise[_] = js.native
  def get[T](key: String, callback: js.Function2[/* error */ js.Any, /* result */ T, Unit]): Unit = js.native
  def set[T](key: String, value: T, options: CachingConfig): js.Promise[_] = js.native
  def set[T](key: String, value: T, options: CachingConfig, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def set[T](key: String, value: T, ttl: Double): js.Promise[_] = js.native
  def set[T](key: String, value: T, ttl: Double, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  @JSName("set")
  def set_T_Unit[T](key: String, value: T, options: CachingConfig): Unit = js.native
  @JSName("set")
  def set_T_Unit[T](key: String, value: T, ttl: Double): Unit = js.native
  def wrap[T](
    key: String,
    wrapper: js.Function1[/* callback */ js.Function2[/* error */ js.Any, /* result */ T, Unit], Unit]
  ): js.Promise[_] = js.native
  def wrap[T](
    key: String,
    wrapper: js.Function1[/* callback */ js.Function2[/* error */ js.Any, /* result */ T, Unit], Unit],
    callback: js.Function2[/* error */ js.Any, /* result */ T, Unit]
  ): Unit = js.native
  def wrap[T](
    key: String,
    wrapper: js.Function1[/* callback */ js.Function2[/* error */ js.Any, /* result */ T, Unit], _],
    options: CachingConfig
  ): js.Promise[_] = js.native
  def wrap[T](
    key: String,
    wrapper: js.Function1[/* callback */ js.Function2[/* error */ js.Any, /* result */ T, Unit], Unit],
    options: CachingConfig,
    callback: js.Function2[/* error */ js.Any, /* result */ T, Unit]
  ): Unit = js.native
}

