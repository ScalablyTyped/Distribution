package typings.cacheManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  var store: Store = js.native
  def del(key: String): js.Promise[_] = js.native
  def del(key: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def get[T](key: String): js.Promise[_] = js.native
  def get[T](key: String, callback: js.Function2[/* error */ js.Any, /* result */ T, Unit]): Unit = js.native
  def set[T](key: String, value: T, options: CachingConfig): js.Promise[_] = js.native
  def set[T](key: String, value: T, options: CachingConfig, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def set[T](key: String, value: T, ttl: Double): js.Promise[_] = js.native
  def set[T](key: String, value: T, ttl: Double, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  // Because the library accepts multiple keys as arguments but not as an array and rather as individual parameters
  // of the function, the type definition had to be changed to this rather than specific ones
  // actual definitions would looks like this (impossible in typescript):
  // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, options: CachingConfig, callback: (error: any, result: T) => void): void
  // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, callback: (error: any, result: T) => void): void
  // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, options: CachingConfig): void
  // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void): Promise<any>;
  def wrap[T](args: WrapArgsType[T]*): js.Promise[_] = js.native
}

