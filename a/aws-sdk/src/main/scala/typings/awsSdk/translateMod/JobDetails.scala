package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDetails extends StObject {
  
  /**
    * The number of documents that could not be processed during a translation job.
    */
  var DocumentsWithErrorsCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of documents used as input in a translation job.
    */
  var InputDocumentsCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of documents successfully processed during a translation job.
    */
  var TranslatedDocumentsCount: js.UndefOr[Integer] = js.undefined
}
object JobDetails {
  
  @scala.inline
  def apply(): JobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDetails]
  }
  
  @scala.inline
  implicit class JobDetailsMutableBuilder[Self <: JobDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentsWithErrorsCount(value: Integer): Self = StObject.set(x, "DocumentsWithErrorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsWithErrorsCountUndefined: Self = StObject.set(x, "DocumentsWithErrorsCount", js.undefined)
    
    @scala.inline
    def setInputDocumentsCount(value: Integer): Self = StObject.set(x, "InputDocumentsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDocumentsCountUndefined: Self = StObject.set(x, "InputDocumentsCount", js.undefined)
    
    @scala.inline
    def setTranslatedDocumentsCount(value: Integer): Self = StObject.set(x, "TranslatedDocumentsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslatedDocumentsCountUndefined: Self = StObject.set(x, "TranslatedDocumentsCount", js.undefined)
  }
}
