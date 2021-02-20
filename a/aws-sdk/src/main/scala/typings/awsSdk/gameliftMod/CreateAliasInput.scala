package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAliasInput extends StObject {
  
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
  implicit class CreateAliasInputMutableBuilder[Self <: CreateAliasInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NonZeroAndMaxString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: NonBlankAndLengthConstraintString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingStrategy(value: RoutingStrategy): Self = StObject.set(x, "RoutingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
