package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAlgorithmInput extends js.Object {
  
  /**
    * The name of the algorithm to delete.
    */
  var AlgorithmName: EntityName = js.native
}
object DeleteAlgorithmInput {
  
  @scala.inline
  def apply(AlgorithmName: EntityName): DeleteAlgorithmInput = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlgorithmInput]
  }
  
  @scala.inline
  implicit class DeleteAlgorithmInputOps[Self <: DeleteAlgorithmInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithmName(value: EntityName): Self = this.set("AlgorithmName", value.asInstanceOf[js.Any])
  }
}
