package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDedicatedIpPoolRequest extends StObject {
  
  /**
    * The name of the dedicated IP pool.
    */
  var PoolName: typings.awsSdk.pinpointemailMod.PoolName
  
  /**
    * An object that defines the tags (keys and values) that you want to associate with the pool.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDedicatedIpPoolRequest {
  
  inline def apply(PoolName: PoolName): CreateDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDedicatedIpPoolRequest]
  }
  
  extension [Self <: CreateDedicatedIpPoolRequest](x: Self) {
    
    inline def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
