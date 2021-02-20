package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relationship extends StObject {
  
  /**
    * An array of IDs for related blocks. You can get the type of the relationship from the Type element.
    */
  var Ids: js.UndefOr[IdList] = js.native
  
  /**
    * The type of relationship that the blocks in the IDs array have with the current block. The relationship can be VALUE or CHILD. A relationship of type VALUE is a list that contains the ID of the VALUE block that's associated with the KEY of a key-value pair. A relationship of type CHILD is a list of IDs that identify WORD blocks in the case of lines Cell blocks in the case of Tables, and WORD blocks in the case of Selection Elements.
    */
  var Type: js.UndefOr[RelationshipType] = js.native
}
object Relationship {
  
  @scala.inline
  def apply(): Relationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relationship]
  }
  
  @scala.inline
  implicit class RelationshipMutableBuilder[Self <: Relationship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: IdList): Self = StObject.set(x, "Ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "Ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Ids", js.Array(value :_*))
    
    @scala.inline
    def setType(value: RelationshipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
