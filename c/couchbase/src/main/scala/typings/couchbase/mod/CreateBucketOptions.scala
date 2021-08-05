package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketOptions extends StObject {
  
  var authType: js.UndefOr[String] = js.undefined
  
  var bucketType: js.UndefOr[String] = js.undefined
  
  /**
    * The bucket name
    */
  var name: js.UndefOr[String] = js.undefined
  
  var ramQuotaMB: js.UndefOr[Double] = js.undefined
  
  var replicaNumber: js.UndefOr[Double] = js.undefined
}
object CreateBucketOptions {
  
  inline def apply(): CreateBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketOptions]
  }
  
  extension [Self <: CreateBucketOptions](x: Self) {
    
    inline def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    inline def setBucketType(value: String): Self = StObject.set(x, "bucketType", value.asInstanceOf[js.Any])
    
    inline def setBucketTypeUndefined: Self = StObject.set(x, "bucketType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRamQuotaMB(value: Double): Self = StObject.set(x, "ramQuotaMB", value.asInstanceOf[js.Any])
    
    inline def setRamQuotaMBUndefined: Self = StObject.set(x, "ramQuotaMB", js.undefined)
    
    inline def setReplicaNumber(value: Double): Self = StObject.set(x, "replicaNumber", value.asInstanceOf[js.Any])
    
    inline def setReplicaNumberUndefined: Self = StObject.set(x, "replicaNumber", js.undefined)
  }
}
