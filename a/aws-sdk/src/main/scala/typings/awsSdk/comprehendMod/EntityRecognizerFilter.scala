package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognizerFilter extends StObject {
  
  /**
    * The status of an entity recognizer.
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
  
  /**
    * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
}
object EntityRecognizerFilter {
  
  @scala.inline
  def apply(): EntityRecognizerFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerFilter]
  }
  
  @scala.inline
  implicit class EntityRecognizerFilterMutableBuilder[Self <: EntityRecognizerFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ModelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubmitTimeAfter(value: Timestamp): Self = StObject.set(x, "SubmitTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeAfterUndefined: Self = StObject.set(x, "SubmitTimeAfter", js.undefined)
    
    @scala.inline
    def setSubmitTimeBefore(value: Timestamp): Self = StObject.set(x, "SubmitTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeBeforeUndefined: Self = StObject.set(x, "SubmitTimeBefore", js.undefined)
  }
}
