package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumanLoopDataAttributes extends StObject {
  
  /**
    * Sets whether the input image is free of personally identifiable information or adult content.
    */
  var ContentClassifiers: js.UndefOr[typings.awsSdk.textractMod.ContentClassifiers] = js.native
}
object HumanLoopDataAttributes {
  
  @scala.inline
  def apply(): HumanLoopDataAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanLoopDataAttributes]
  }
  
  @scala.inline
  implicit class HumanLoopDataAttributesMutableBuilder[Self <: HumanLoopDataAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentClassifiers(value: ContentClassifiers): Self = StObject.set(x, "ContentClassifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentClassifiersUndefined: Self = StObject.set(x, "ContentClassifiers", js.undefined)
    
    @scala.inline
    def setContentClassifiersVarargs(value: ContentClassifier*): Self = StObject.set(x, "ContentClassifiers", js.Array(value :_*))
  }
}
