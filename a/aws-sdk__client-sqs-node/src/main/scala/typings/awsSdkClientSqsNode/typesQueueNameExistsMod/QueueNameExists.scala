package typings.awsSdkClientSqsNode.typesQueueNameExistsMod

import typings.awsSdkClientSqsNode.createQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_QueueNameExistsDetails> * / any */ @js.native
trait QueueNameExists extends CreateQueueExceptionsUnion {
  
  var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists = js.native
}
object QueueNameExists {
  
  @scala.inline
  def apply(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists): QueueNameExists = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueNameExists]
  }
  
  @scala.inline
  implicit class QueueNameExistsOps[Self <: QueueNameExists] (val x: Self) extends AnyVal {
    
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
    def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
