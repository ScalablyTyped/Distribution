package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentClassifierResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a document classifier.
    */
  var DocumentClassifierProperties: js.UndefOr[typings.awsSdk.comprehendMod.DocumentClassifierProperties] = js.undefined
}
object DescribeDocumentClassifierResponse {
  
  inline def apply(): DescribeDocumentClassifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentClassifierResponse]
  }
  
  extension [Self <: DescribeDocumentClassifierResponse](x: Self) {
    
    inline def setDocumentClassifierProperties(value: DocumentClassifierProperties): Self = StObject.set(x, "DocumentClassifierProperties", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassifierPropertiesUndefined: Self = StObject.set(x, "DocumentClassifierProperties", js.undefined)
  }
}
