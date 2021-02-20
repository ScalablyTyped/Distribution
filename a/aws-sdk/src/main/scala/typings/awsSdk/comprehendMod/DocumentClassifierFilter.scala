package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentClassifierFilter extends StObject {
  
  /**
    * Filters the list of classifiers based on status.
    */
  var Status: js.UndefOr[ModelStatus] = js.native
  
  /**
    * Filters the list of classifiers based on the time that the classifier was submitted for processing. Returns only classifiers submitted after the specified time. Classifiers are returned in descending order, newest to oldest.
    */
  var SubmitTimeAfter: js.UndefOr[Timestamp] = js.native
  
  /**
    * Filters the list of classifiers based on the time that the classifier was submitted for processing. Returns only classifiers submitted before the specified time. Classifiers are returned in ascending order, oldest to newest.
    */
  var SubmitTimeBefore: js.UndefOr[Timestamp] = js.native
}
object DocumentClassifierFilter {
  
  @scala.inline
  def apply(): DocumentClassifierFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClassifierFilter]
  }
  
  @scala.inline
  implicit class DocumentClassifierFilterMutableBuilder[Self <: DocumentClassifierFilter] (val x: Self) extends AnyVal {
    
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
