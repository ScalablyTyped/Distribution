package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumerationValue extends StObject {
  
  /**
    * Additional values related to the slot type value.
    */
  var synonyms: js.UndefOr[SynonymList] = js.native
  
  /**
    * The value of the slot type.
    */
  var value: Value = js.native
}
object EnumerationValue {
  
  @scala.inline
  def apply(value: Value): EnumerationValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerationValue]
  }
  
  @scala.inline
  implicit class EnumerationValueMutableBuilder[Self <: EnumerationValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSynonyms(value: SynonymList): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: Value*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
