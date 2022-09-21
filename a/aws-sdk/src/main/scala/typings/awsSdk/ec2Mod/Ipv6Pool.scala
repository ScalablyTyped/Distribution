package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv6Pool extends StObject {
  
  /**
    * The description for the address pool.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The CIDR blocks for the address pool.
    */
  var PoolCidrBlocks: js.UndefOr[PoolCidrBlocksSet] = js.undefined
  
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags for the address pool.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object Ipv6Pool {
  
  inline def apply(): Ipv6Pool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6Pool]
  }
  
  extension [Self <: Ipv6Pool](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setPoolCidrBlocks(value: PoolCidrBlocksSet): Self = StObject.set(x, "PoolCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setPoolCidrBlocksUndefined: Self = StObject.set(x, "PoolCidrBlocks", js.undefined)
    
    inline def setPoolCidrBlocksVarargs(value: PoolCidrBlock*): Self = StObject.set(x, "PoolCidrBlocks", js.Array(value*))
    
    inline def setPoolId(value: String): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
