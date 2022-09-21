package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexPatternSet extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * A description of the set that helps with identification. 
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The name of the set. You cannot change the name after you create the set.
    */
  var Name: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The regular expression patterns in the set.
    */
  var RegularExpressionList: js.UndefOr[typings.awsSdk.wafv2Mod.RegularExpressionList] = js.undefined
}
object RegexPatternSet {
  
  inline def apply(): RegexPatternSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexPatternSet]
  }
  
  extension [Self <: RegexPatternSet](x: Self) {
    
    inline def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRegularExpressionList(value: RegularExpressionList): Self = StObject.set(x, "RegularExpressionList", value.asInstanceOf[js.Any])
    
    inline def setRegularExpressionListUndefined: Self = StObject.set(x, "RegularExpressionList", js.undefined)
    
    inline def setRegularExpressionListVarargs(value: Regex*): Self = StObject.set(x, "RegularExpressionList", js.Array(value*))
  }
}
