package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterMapEntry extends StObject {
  
  /**
    *  The QuestionID from the HIT that is used to identify which question requires Mechanical Turk to score as part of the ScoreMyKnownAnswers/2011-09-01 Review Policy. 
    */
  var Key: js.UndefOr[String] = js.undefined
  
  /**
    *  The list of answers to the question specified in the MapEntry Key element. The Worker must match all values in order for the answer to be scored correctly. 
    */
  var Values: js.UndefOr[StringList] = js.undefined
}
object ParameterMapEntry {
  
  inline def apply(): ParameterMapEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterMapEntry]
  }
  
  extension [Self <: ParameterMapEntry](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValues(value: StringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
