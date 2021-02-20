package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICD10CMTrait extends StObject {
  
  /**
    * Provides a name or contextual description about the trait.
    */
  var Name: js.UndefOr[ICD10CMTraitName] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly recognized as a trait.
    */
  var Score: js.UndefOr[Float] = js.native
}
object ICD10CMTrait {
  
  @scala.inline
  def apply(): ICD10CMTrait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICD10CMTrait]
  }
  
  @scala.inline
  implicit class ICD10CMTraitMutableBuilder[Self <: ICD10CMTrait] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ICD10CMTraitName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
