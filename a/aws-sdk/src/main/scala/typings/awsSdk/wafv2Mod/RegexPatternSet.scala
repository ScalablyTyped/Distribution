package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexPatternSet extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: js.UndefOr[ResourceArn] = js.native
  
  /**
    * A description of the set that helps with identification. You cannot change the description of a set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  
  /**
    * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: js.UndefOr[EntityId] = js.native
  
  /**
    * The name of the set. You cannot change the name after you create the set.
    */
  var Name: js.UndefOr[EntityName] = js.native
  
  /**
    * The regular expression patterns in the set.
    */
  var RegularExpressionList: js.UndefOr[typings.awsSdk.wafv2Mod.RegularExpressionList] = js.native
}
object RegexPatternSet {
  
  @scala.inline
  def apply(): RegexPatternSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexPatternSet]
  }
  
  @scala.inline
  implicit class RegexPatternSetMutableBuilder[Self <: RegexPatternSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRegularExpressionList(value: RegularExpressionList): Self = StObject.set(x, "RegularExpressionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularExpressionListUndefined: Self = StObject.set(x, "RegularExpressionList", js.undefined)
    
    @scala.inline
    def setRegularExpressionListVarargs(value: Regex*): Self = StObject.set(x, "RegularExpressionList", js.Array(value :_*))
  }
}
