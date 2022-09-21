package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVocabularyResponse extends StObject {
  
  /**
    * The current state of the custom vocabulary.
    */
  var State: VocabularyState
  
  /**
    * The Amazon Resource Name (ARN) of the custom vocabulary.
    */
  var VocabularyArn: ARN
  
  /**
    * The identifier of the custom vocabulary.
    */
  var VocabularyId: typings.awsSdk.connectMod.VocabularyId
}
object CreateVocabularyResponse {
  
  inline def apply(State: VocabularyState, VocabularyArn: ARN, VocabularyId: VocabularyId): CreateVocabularyResponse = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], VocabularyArn = VocabularyArn.asInstanceOf[js.Any], VocabularyId = VocabularyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVocabularyResponse]
  }
  
  extension [Self <: CreateVocabularyResponse](x: Self) {
    
    inline def setState(value: VocabularyState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setVocabularyArn(value: ARN): Self = StObject.set(x, "VocabularyArn", value.asInstanceOf[js.Any])
    
    inline def setVocabularyId(value: VocabularyId): Self = StObject.set(x, "VocabularyId", value.asInstanceOf[js.Any])
  }
}
