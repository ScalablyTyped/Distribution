package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognizerFilter extends StObject {
  
  /**
    * The name that you assigned the entity recognizer.
    */
  var RecognizerName: js.UndefOr[ComprehendArnName] = js.undefined
  
  /**
    * The status of an entity recognizer.
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
  
  /**
    * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmitTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmitTimeBefore: js.UndefOr[js.Date] = js.undefined
}
object EntityRecognizerFilter {
  
  inline def apply(): EntityRecognizerFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerFilter]
  }
  
  extension [Self <: EntityRecognizerFilter](x: Self) {
    
    inline def setRecognizerName(value: ComprehendArnName): Self = StObject.set(x, "RecognizerName", value.asInstanceOf[js.Any])
    
    inline def setRecognizerNameUndefined: Self = StObject.set(x, "RecognizerName", js.undefined)
    
    inline def setStatus(value: ModelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubmitTimeAfter(value: js.Date): Self = StObject.set(x, "SubmitTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeAfterUndefined: Self = StObject.set(x, "SubmitTimeAfter", js.undefined)
    
    inline def setSubmitTimeBefore(value: js.Date): Self = StObject.set(x, "SubmitTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeBeforeUndefined: Self = StObject.set(x, "SubmitTimeBefore", js.undefined)
  }
}
