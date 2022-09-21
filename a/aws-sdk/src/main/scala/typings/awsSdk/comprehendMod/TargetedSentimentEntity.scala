package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetedSentimentEntity extends StObject {
  
  /**
    * One or more index into the Mentions array that provides the best name for the entity group.
    */
  var DescriptiveMentionIndex: js.UndefOr[ListOfDescriptiveMentionIndices] = js.undefined
  
  /**
    * An array of mentions of the entity in the document. The array represents a co-reference group. See  Co-reference group for an example. 
    */
  var Mentions: js.UndefOr[ListOfMentions] = js.undefined
}
object TargetedSentimentEntity {
  
  inline def apply(): TargetedSentimentEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedSentimentEntity]
  }
  
  extension [Self <: TargetedSentimentEntity](x: Self) {
    
    inline def setDescriptiveMentionIndex(value: ListOfDescriptiveMentionIndices): Self = StObject.set(x, "DescriptiveMentionIndex", value.asInstanceOf[js.Any])
    
    inline def setDescriptiveMentionIndexUndefined: Self = StObject.set(x, "DescriptiveMentionIndex", js.undefined)
    
    inline def setDescriptiveMentionIndexVarargs(value: Integer*): Self = StObject.set(x, "DescriptiveMentionIndex", js.Array(value*))
    
    inline def setMentions(value: ListOfMentions): Self = StObject.set(x, "Mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "Mentions", js.undefined)
    
    inline def setMentionsVarargs(value: TargetedSentimentMention*): Self = StObject.set(x, "Mentions", js.Array(value*))
  }
}
