package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIndexFieldRequest extends StObject {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
  
  /**
    * The name of the index field your want to remove from the domain's indexing options.
    */
  var IndexFieldName: DynamicFieldName
}
object DeleteIndexFieldRequest {
  
  inline def apply(DomainName: DomainName, IndexFieldName: DynamicFieldName): DeleteIndexFieldRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], IndexFieldName = IndexFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIndexFieldRequest]
  }
  
  extension [Self <: DeleteIndexFieldRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setIndexFieldName(value: DynamicFieldName): Self = StObject.set(x, "IndexFieldName", value.asInstanceOf[js.Any])
  }
}
