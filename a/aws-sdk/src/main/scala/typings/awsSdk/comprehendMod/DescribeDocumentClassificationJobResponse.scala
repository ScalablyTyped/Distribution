package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDocumentClassificationJobResponse extends js.Object {
  
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
  implicit class DescribeDocumentClassificationJobResponseOps[Self <: DescribeDocumentClassificationJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocumentClassificationJobProperties(value: DocumentClassificationJobProperties): Self = this.set("DocumentClassificationJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentClassificationJobProperties: Self = this.set("DocumentClassificationJobProperties", js.undefined)
  }
}
