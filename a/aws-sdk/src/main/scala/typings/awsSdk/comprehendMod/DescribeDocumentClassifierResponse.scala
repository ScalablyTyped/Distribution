package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDocumentClassifierResponse extends js.Object {
  
  /**
    * An object that contains the properties associated with a document classifier.
    */
  var DocumentClassifierProperties: js.UndefOr[typings.awsSdk.comprehendMod.DocumentClassifierProperties] = js.native
}
object DescribeDocumentClassifierResponse {
  
  @scala.inline
  def apply(): DescribeDocumentClassifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentClassifierResponse]
  }
  
  @scala.inline
  implicit class DescribeDocumentClassifierResponseOps[Self <: DescribeDocumentClassifierResponse] (val x: Self) extends AnyVal {
    
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
    def setDocumentClassifierProperties(value: DocumentClassifierProperties): Self = this.set("DocumentClassifierProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentClassifierProperties: Self = this.set("DocumentClassifierProperties", js.undefined)
  }
}
