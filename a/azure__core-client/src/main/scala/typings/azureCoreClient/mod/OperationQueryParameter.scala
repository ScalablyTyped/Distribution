package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationQueryParameter
  extends StObject
     with OperationParameter {
  
  /**
    * If this query parameter's value is a collection, what type of format should the value be
    * converted to.
    */
  var collectionFormat: js.UndefOr[QueryCollectionFormat] = js.undefined
  
  /**
    * Whether or not to skip encoding the query parameter's value before adding it to the URL.
    */
  var skipEncoding: js.UndefOr[Boolean] = js.undefined
}
object OperationQueryParameter {
  
  inline def apply(mapper: Mapper, parameterPath: ParameterPath): OperationQueryParameter = {
    val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any], parameterPath = parameterPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationQueryParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationQueryParameter] (val x: Self) extends AnyVal {
    
    inline def setCollectionFormat(value: QueryCollectionFormat): Self = StObject.set(x, "collectionFormat", value.asInstanceOf[js.Any])
    
    inline def setCollectionFormatUndefined: Self = StObject.set(x, "collectionFormat", js.undefined)
    
    inline def setSkipEncoding(value: Boolean): Self = StObject.set(x, "skipEncoding", value.asInstanceOf[js.Any])
    
    inline def setSkipEncodingUndefined: Self = StObject.set(x, "skipEncoding", js.undefined)
  }
}
