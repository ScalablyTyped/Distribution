package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFaqRequest extends StObject {
  
  /**
    * The identifier of the FAQ you want to get information on.
    */
  var Id: FaqId
  
  /**
    * The identifier of the index for the FAQ.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
}
object DescribeFaqRequest {
  
  inline def apply(Id: FaqId, IndexId: IndexId): DescribeFaqRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFaqRequest]
  }
  
  extension [Self <: DescribeFaqRequest](x: Self) {
    
    inline def setId(value: FaqId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
