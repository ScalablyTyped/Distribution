package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketAccessKeyResult extends StObject {
  
  /**
    * An object that describes the access key that is created.
    */
  var accessKey: js.UndefOr[AccessKey] = js.undefined
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}
object CreateBucketAccessKeyResult {
  
  inline def apply(): CreateBucketAccessKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketAccessKeyResult]
  }
  
  extension [Self <: CreateBucketAccessKeyResult](x: Self) {
    
    inline def setAccessKey(value: AccessKey): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setOperations(value: OperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
