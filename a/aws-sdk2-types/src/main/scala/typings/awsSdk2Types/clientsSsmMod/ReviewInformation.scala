package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewInformation extends StObject {
  
  /**
    * The time that the reviewer took action on the document review request.
    */
  var ReviewedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The reviewer assigned to take action on the document review request.
    */
  var Reviewer: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.Reviewer] = js.undefined
  
  /**
    * The current status of the document review request.
    */
  var Status: js.UndefOr[ReviewStatus] = js.undefined
}
object ReviewInformation {
  
  inline def apply(): ReviewInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReviewInformation] (val x: Self) extends AnyVal {
    
    inline def setReviewedTime(value: js.Date): Self = StObject.set(x, "ReviewedTime", value.asInstanceOf[js.Any])
    
    inline def setReviewedTimeUndefined: Self = StObject.set(x, "ReviewedTime", js.undefined)
    
    inline def setReviewer(value: Reviewer): Self = StObject.set(x, "Reviewer", value.asInstanceOf[js.Any])
    
    inline def setReviewerUndefined: Self = StObject.set(x, "Reviewer", js.undefined)
    
    inline def setStatus(value: ReviewStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
