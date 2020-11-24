package typings.dataloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dataloader", JSImport.Namespace)
@js.native
class ^[K, V, C] protected () extends DataLoader[K, V, C] {
  def this(batchLoadFn: BatchLoadFn[K, V]) = this()
  def this(batchLoadFn: BatchLoadFn[K, V], options: Options[K, V, C]) = this()
}
