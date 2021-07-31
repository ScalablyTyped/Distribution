package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trait extends StObject {
  
  /**
    *  Provides a name or contextual description about the trait. 
    */
  var Name: js.UndefOr[AttributeName] = js.undefined
  
  /**
    *  The level of confidence that Amazon Comprehend Medical has in the accuracy of this trait.
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object Trait {
  
  @scala.inline
  def apply(): Trait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trait]
  }
  
  @scala.inline
  implicit class TraitMutableBuilder[Self <: Trait] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: AttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
