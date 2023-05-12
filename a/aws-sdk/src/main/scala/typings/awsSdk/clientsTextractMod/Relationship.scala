package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relationship extends StObject {
  
  /**
    * An array of IDs for related blocks. You can get the type of the relationship from the Type element.
    */
  var Ids: js.UndefOr[IdList] = js.undefined
  
  /**
    * The type of relationship between the blocks in the IDs array and the current block. The following list describes the relationship types that can be returned.     VALUE - A list that contains the ID of the VALUE block that's associated with the KEY of a key-value pair.    CHILD - A list of IDs that identify blocks found within the current block object. For example, WORD blocks have a CHILD relationship to the LINE block type.    MERGED_CELL - A list of IDs that identify each of the MERGED_CELL block types in a table.    ANSWER - A list that contains the ID of the QUERY_RESULT block that’s associated with the corresponding QUERY block.     TABLE - A list of IDs that identify associated TABLE block types.     TABLE_TITLE - A list that contains the ID for the TABLE_TITLE block type in a table.     TABLE_FOOTER - A list of IDs that identify the TABLE_FOOTER block types in a table.   
    */
  var Type: js.UndefOr[RelationshipType] = js.undefined
}
object Relationship {
  
  inline def apply(): Relationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relationship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Relationship] (val x: Self) extends AnyVal {
    
    inline def setIds(value: IdList): Self = StObject.set(x, "Ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "Ids", js.undefined)
    
    inline def setIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Ids", js.Array(value*))
    
    inline def setType(value: RelationshipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
