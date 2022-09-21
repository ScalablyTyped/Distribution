package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICD10CMTrait extends StObject {
  
  /**
    * Provides a name or contextual description about the trait.
    */
  var Name: js.UndefOr[ICD10CMTraitName] = js.undefined
  
  /**
    * The level of confidence that Comprehend Medical; has that the segment of text is correctly recognized as a trait.
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object ICD10CMTrait {
  
  inline def apply(): ICD10CMTrait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICD10CMTrait]
  }
  
  extension [Self <: ICD10CMTrait](x: Self) {
    
    inline def setName(value: ICD10CMTraitName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
