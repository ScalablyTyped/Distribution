package typings.beanstalkd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArgsType[T] = js.Any
  
  type FunctionsNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with java.lang.String
  
  type MergePromise[T] = js.Promise[typings.beanstalkd.mod.UnPromise[T]]
  
  type UnPromise[T] = T
}
