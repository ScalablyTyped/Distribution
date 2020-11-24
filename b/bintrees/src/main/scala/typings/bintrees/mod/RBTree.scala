package typings.bintrees.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bintrees", "RBTree")
@js.native
class RBTree[T] protected () extends TreeBase[T] {
  def this(comparator: Comparator[T]) = this()
  
  def insert(item: T): Boolean = js.native
  
  def remove(item: T): Boolean = js.native
}
