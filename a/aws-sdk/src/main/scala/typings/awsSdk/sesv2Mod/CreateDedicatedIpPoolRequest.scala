package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDedicatedIpPoolRequest extends StObject {
  
  /**
    * The name of the dedicated IP pool.
    */
  var PoolName: typings.awsSdk.sesv2Mod.PoolName
  
  /**
    * An object that defines the tags (keys and values) that you want to associate with the pool.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDedicatedIpPoolRequest {
  
  @scala.inline
  def apply(PoolName: PoolName): CreateDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDedicatedIpPoolRequest]
  }
  
  @scala.inline
  implicit class CreateDedicatedIpPoolRequestMutableBuilder[Self <: CreateDedicatedIpPoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
