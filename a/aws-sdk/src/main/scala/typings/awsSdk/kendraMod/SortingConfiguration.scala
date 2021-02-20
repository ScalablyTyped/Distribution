package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortingConfiguration extends StObject {
  
  /**
    * The name of the document attribute used to sort the response. You can use any field that has the Sortable flag set to true. You can also sort by any of the following built-in attributes:   _category   _created_at   _last_updated_at   _version   _view_count  
    */
  var DocumentAttributeKey: typings.awsSdk.kendraMod.DocumentAttributeKey = js.native
  
  /**
    * The order that the results should be returned in. In case of ties, the relevance assigned to the result by Amazon Kendra is used as the tie-breaker.
    */
  var SortOrder: typings.awsSdk.kendraMod.SortOrder = js.native
}
object SortingConfiguration {
  
  @scala.inline
  def apply(DocumentAttributeKey: DocumentAttributeKey, SortOrder: SortOrder): SortingConfiguration = {
    val __obj = js.Dynamic.literal(DocumentAttributeKey = DocumentAttributeKey.asInstanceOf[js.Any], SortOrder = SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortingConfiguration]
  }
  
  @scala.inline
  implicit class SortingConfigurationMutableBuilder[Self <: SortingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentAttributeKey(value: DocumentAttributeKey): Self = StObject.set(x, "DocumentAttributeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
  }
}
