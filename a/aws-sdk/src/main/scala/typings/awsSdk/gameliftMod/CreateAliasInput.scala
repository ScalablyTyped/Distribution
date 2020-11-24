package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAliasInput extends js.Object {
  
  /**
    * A human-readable description of the alias.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: NonBlankAndLengthConstraintString = js.native
  
  /**
    * The routing configuration, including routing type and fleet target, for the alias. 
    */
  var RoutingStrategy: typings.awsSdk.gameliftMod.RoutingStrategy = js.native
  
  /**
    * A list of labels to assign to the new alias resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateAliasInput {
  
  @scala.inline
  def apply(Name: NonBlankAndLengthConstraintString, RoutingStrategy: RoutingStrategy): CreateAliasInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoutingStrategy = RoutingStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasInput]
  }
  
  @scala.inline
  implicit class CreateAliasInputOps[Self <: CreateAliasInput] (val x: Self) extends AnyVal {
    
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
    def setName(value: NonBlankAndLengthConstraintString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingStrategy(value: RoutingStrategy): Self = this.set("RoutingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: NonZeroAndMaxString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
