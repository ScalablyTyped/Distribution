package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineIndexFieldRequest extends StObject {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
  
  /**
    * The index field and field options you want to configure. 
    */
  var IndexField: typings.awsSdk.cloudsearchMod.IndexField
}
object DefineIndexFieldRequest {
  
  inline def apply(DomainName: DomainName, IndexField: IndexField): DefineIndexFieldRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], IndexField = IndexField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineIndexFieldRequest]
  }
  
  extension [Self <: DefineIndexFieldRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setIndexField(value: IndexField): Self = StObject.set(x, "IndexField", value.asInstanceOf[js.Any])
  }
}
