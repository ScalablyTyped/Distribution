package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("benchmark", JSImport.Namespace)
@js.native
class ^ protected () extends Benchmark {
  def this(fn: String) = this()
  def this(fn: js.Function) = this()
  def this(options: Options) = this()
  def this(fn: String, options: Options) = this()
  def this(fn: js.Function, options: Options) = this()
  def this(name: String, fn: String) = this()
  def this(name: String, fn: js.Function) = this()
  def this(name: String, fn: String, options: Options) = this()
  def this(name: String, fn: js.Function, options: Options) = this()
}
@JSImport("benchmark", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def each(obj: js.Array[_], callback: js.Function): Unit = js.native
  def each(obj: js.Array[_], callback: js.Function, thisArg: js.Any): Unit = js.native
  def each(obj: js.Object, callback: js.Function): Unit = js.native
  def each(obj: js.Object, callback: js.Function, thisArg: js.Any): Unit = js.native
  
  def filter[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _]): js.Array[T] = js.native
  def filter[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _], thisArg: js.Any): js.Array[T] = js.native
  def filter[T](arr: js.Array[T], filter: String): js.Array[T] = js.native
  def filter[T](arr: js.Array[T], filter: String, thisArg: js.Any): js.Array[T] = js.native
  
  def forEach[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _]): Unit = js.native
  def forEach[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _], thisArg: js.Any): Unit = js.native
  
  def forOwn(obj: js.Object, callback: js.Function): Unit = js.native
  def forOwn(obj: js.Object, callback: js.Function, thisArg: js.Any): Unit = js.native
  
  def formatNumber(num: Double): String = js.native
  
  def has(obj: js.Object, path: String): Boolean = js.native
  def has(obj: js.Object, path: js.Array[_]): Boolean = js.native
  
  def indexOf[T](arr: js.Array[T], value: T): Double = js.native
  def indexOf[T](arr: js.Array[T], value: T, fromIndex: Double): Double = js.native
  
  def invoke(benches: js.Array[Benchmark], name: String, args: js.Any*): js.Array[_] = js.native
  def invoke(benches: js.Array[Benchmark], name: js.Object, args: js.Any*): js.Array[_] = js.native
  
  def join(obj: js.Object): String = js.native
  def join(obj: js.Object, separator1: js.UndefOr[scala.Nothing], separator2: String): String = js.native
  def join(obj: js.Object, separator1: String): String = js.native
  def join(obj: js.Object, separator1: String, separator2: String): String = js.native
  
  def map[T, K](arr: js.Array[T], callback: js.Function1[/* value */ T, K]): js.Array[K] = js.native
  def map[T, K](arr: js.Array[T], callback: js.Function1[/* value */ T, K], thisArg: js.Any): js.Array[K] = js.native
  
  var options: Options = js.native
  
  var platform: Platform = js.native
  
  def reduce[T, K](arr: js.Array[T], callback: js.Function2[/* accumulator */ K, /* value */ T, K]): K = js.native
  def reduce[T, K](arr: js.Array[T], callback: js.Function2[/* accumulator */ K, /* value */ T, K], thisArg: js.Any): K = js.native
  
  def runInContext(context: js.Object): js.Function = js.native
  
  var support: Support = js.native
  
  var version: String = js.native
}
