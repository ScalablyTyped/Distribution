package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDocumentClassificationJobResponse extends StObject {
  
  /**
    * An object that describes the properties associated with the document classification job.
    */
  var DocumentClassificationJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.DocumentClassificationJobProperties] = js.native
}
object DescribeDocumentClassificationJobResponse {
  
  @scala.inline
  def apply(): DescribeDocumentClassificationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentClassificationJobResponse]
  }
  
  @scala.inline
  implicit class DescribeDocumentClassificationJobResponseMutableBuilder[Self <: DescribeDocumentClassificationJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentClassificationJobProperties(value: DocumentClassificationJobProperties): Self = StObject.set(x, "DocumentClassificationJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentClassificationJobPropertiesUndefined: Self = StObject.set(x, "DocumentClassificationJobProperties", js.undefined)
  }
}
