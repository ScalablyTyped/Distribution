package typings.beanstalkd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object beanstalkdMod {
  type ArgsType[T] = js.Any
  type FunctionsNames[T] = (/* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with String
  type MergePromise[T] = js.Promise[UnPromise[T]]
  type UnPromise[T] = T
}
