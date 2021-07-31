package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaqSummary extends StObject {
  
  /**
    * The UNIX datetime that the FAQ was added to the index.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The file type used to create the FAQ. 
    */
  var FileFormat: js.UndefOr[FaqFileFormat] = js.undefined
  
  /**
    * The unique identifier of the FAQ.
    */
  var Id: js.UndefOr[FaqId] = js.undefined
  
  /**
    * The name that you assigned the FAQ when you created or updated the FAQ.
    */
  var Name: js.UndefOr[FaqName] = js.undefined
  
  /**
    * The current status of the FAQ. When the status is ACTIVE the FAQ is ready for use.
    */
  var Status: js.UndefOr[FaqStatus] = js.undefined
  
  /**
    * The UNIX datetime that the FAQ was last updated.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.undefined
}
object FaqSummary {
  
  @scala.inline
  def apply(): FaqSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaqSummary]
  }
  
  @scala.inline
  implicit class FaqSummaryMutableBuilder[Self <: FaqSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setFileFormat(value: FaqFileFormat): Self = StObject.set(x, "FileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileFormatUndefined: Self = StObject.set(x, "FileFormat", js.undefined)
    
    @scala.inline
    def setId(value: FaqId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: FaqName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: FaqStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
