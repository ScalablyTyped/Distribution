package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBucketOptions extends StObject {
  
  var authType: js.UndefOr[String] = js.native
  
  var bucketType: js.UndefOr[String] = js.native
  
  /**
    * The bucket name
    */
  var name: js.UndefOr[String] = js.native
  
  var ramQuotaMB: js.UndefOr[Double] = js.native
  
  var replicaNumber: js.UndefOr[Double] = js.native
}
object CreateBucketOptions {
  
  @scala.inline
  def apply(): CreateBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketOptions]
  }
  
  @scala.inline
  implicit class CreateBucketOptionsMutableBuilder[Self <: CreateBucketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    @scala.inline
    def setBucketType(value: String): Self = StObject.set(x, "bucketType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketTypeUndefined: Self = StObject.set(x, "bucketType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRamQuotaMB(value: Double): Self = StObject.set(x, "ramQuotaMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamQuotaMBUndefined: Self = StObject.set(x, "ramQuotaMB", js.undefined)
    
    @scala.inline
    def setReplicaNumber(value: Double): Self = StObject.set(x, "replicaNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaNumberUndefined: Self = StObject.set(x, "replicaNumber", js.undefined)
  }
}
