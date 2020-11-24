package typings.awsSdkBuildTypes.treeModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Structure * / any */ @js.native
trait TreeModelStructure
  extends Documented
     with Named {
  
  var exception: js.UndefOr[Boolean] = js.native
  
  var members: StringDictionary[TreeModelMember] = js.native
  
  var topLevel: js.UndefOr[input | output] = js.native
}
object TreeModelStructure {
  
  @scala.inline
  def apply(documentation: String, members: StringDictionary[TreeModelMember], name: String): TreeModelStructure = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelStructure]
  }
  
  @scala.inline
  implicit class TreeModelStructureOps[Self <: TreeModelStructure] (val x: Self) extends AnyVal {
    
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
    def setMembers(value: StringDictionary[TreeModelMember]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setException(value: Boolean): Self = this.set("exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
    
    @scala.inline
    def setTopLevel(value: input | output): Self = this.set("topLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopLevel: Self = this.set("topLevel", js.undefined)
  }
}
