package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RxNormTrait extends StObject {
  
  /**
    * Provides a name or contextual description about the trait.
    */
  var Name: js.UndefOr[RxNormTraitName] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detected trait.
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object RxNormTrait {
  
  @scala.inline
  def apply(): RxNormTrait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormTrait]
  }
  
  @scala.inline
  implicit class RxNormTraitMutableBuilder[Self <: RxNormTrait] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RxNormTraitName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
