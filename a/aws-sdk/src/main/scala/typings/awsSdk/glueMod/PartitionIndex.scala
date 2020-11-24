package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionIndex extends js.Object {
  
  /**
    * The name of the partition index.
    */
  var IndexName: NameString = js.native
  
  /**
    * The keys for the partition index.
    */
  var Keys: KeyList = js.native
}
object PartitionIndex {
  
  @scala.inline
  def apply(IndexName: NameString, Keys: KeyList): PartitionIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionIndex]
  }
  
  @scala.inline
  implicit class PartitionIndexOps[Self <: PartitionIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndexName(value: NameString): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: NameString*): Self = this.set("Keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: KeyList): Self = this.set("Keys", value.asInstanceOf[js.Any])
  }
}
