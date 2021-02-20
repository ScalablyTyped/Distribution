package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterMapEntry extends StObject {
  
  /**
    *  The QuestionID from the HIT that is used to identify which question requires Mechanical Turk to score as part of the ScoreMyKnownAnswers/2011-09-01 Review Policy. 
    */
  var Key: js.UndefOr[String] = js.native
  
  /**
    *  The list of answers to the question specified in the MapEntry Key element. The Worker must match all values in order for the answer to be scored correctly. 
    */
  var Values: js.UndefOr[StringList] = js.native
}
object ParameterMapEntry {
  
  @scala.inline
  def apply(): ParameterMapEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterMapEntry]
  }
  
  @scala.inline
  implicit class ParameterMapEntryMutableBuilder[Self <: ParameterMapEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValues(value: StringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
