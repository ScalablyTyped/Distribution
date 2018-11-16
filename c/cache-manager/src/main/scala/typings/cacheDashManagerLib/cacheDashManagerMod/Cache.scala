package typings
package cacheDashManagerLib.cacheDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def del(key: java.lang.String): stdLib.Promise[_] = js.native
  def del(key: java.lang.String, callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def get[T](key: java.lang.String): stdLib.Promise[_] = js.native
  def get[T](key: java.lang.String, callback: js.Function2[/* error */ js.Any, /* result */ T, scala.Unit]): scala.Unit = js.native
  def set[T](key: java.lang.String, value: T, options: CachingConfig): scala.Unit = js.native
  def set[T](
    key: java.lang.String,
    value: T,
    options: CachingConfig,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def set[T](key: java.lang.String, value: T, ttl: scala.Double): scala.Unit = js.native
  def set[T](
    key: java.lang.String,
    value: T,
    ttl: scala.Double,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("set")
  def set_TPromise[T](key: java.lang.String, value: T, options: CachingConfig): stdLib.Promise[_] = js.native
  @JSName("set")
  def set_TPromise[T](key: java.lang.String, value: T, ttl: scala.Double): stdLib.Promise[_] = js.native
  def wrap[T](
    key: java.lang.String,
    wrapper: js.Function1[
      /* callback */ js.Function2[/* error */ js.Any, /* result */ T, scala.Unit], 
      scala.Unit
    ]
  ): stdLib.Promise[_] = js.native
  def wrap[T](
    key: java.lang.String,
    wrapper: js.Function1[
      /* callback */ js.Function2[/* error */ js.Any, /* result */ T, scala.Unit], 
      scala.Unit
    ],
    callback: js.Function2[/* error */ js.Any, /* result */ T, scala.Unit]
  ): scala.Unit = js.native
  def wrap[T](
    key: java.lang.String,
    wrapper: js.Function1[/* callback */ js.Function2[/* error */ js.Any, /* result */ T, scala.Unit], _],
    options: CachingConfig
  ): stdLib.Promise[_] = js.native
  def wrap[T](
    key: java.lang.String,
    wrapper: js.Function1[
      /* callback */ js.Function2[/* error */ js.Any, /* result */ T, scala.Unit], 
      scala.Unit
    ],
    options: CachingConfig,
    callback: js.Function2[/* error */ js.Any, /* result */ T, scala.Unit]
  ): scala.Unit = js.native
}

