package typings.awsSdkClientSqsNode.typesOverLimitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_OverLimitDetails> * / any */ @js.native
trait OverLimit extends js.Object {
  
  var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.OverLimit = js.native
}
object OverLimit {
  
  @scala.inline
  def apply(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.OverLimit): OverLimit = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverLimit]
  }
  
  @scala.inline
  implicit class OverLimitOps[Self <: OverLimit] (val x: Self) extends AnyVal {
    
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
    def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.OverLimit): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
