package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleUtterance extends StObject {
  
  /**
    * The sample utterance that Amazon Lex uses to build its machine-learning model to recognize intents.
    */
  var utterance: Utterance
}
object SampleUtterance {
  
  inline def apply(utterance: Utterance): SampleUtterance = {
    val __obj = js.Dynamic.literal(utterance = utterance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleUtterance]
  }
  
  extension [Self <: SampleUtterance](x: Self) {
    
    inline def setUtterance(value: Utterance): Self = StObject.set(x, "utterance", value.asInstanceOf[js.Any])
  }
}
