package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheSubnetGroup extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the cache subnet group.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the cache subnet group.
    */
  var CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cache subnet group.
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of subnets associated with the cache subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object CacheSubnetGroup {
  
  inline def apply(): CacheSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSubnetGroup]
  }
  
  extension [Self <: CacheSubnetGroup](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setCacheSubnetGroupDescription(value: String): Self = StObject.set(x, "CacheSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setCacheSubnetGroupDescriptionUndefined: Self = StObject.set(x, "CacheSubnetGroupDescription", js.undefined)
    
    inline def setCacheSubnetGroupName(value: String): Self = StObject.set(x, "CacheSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setCacheSubnetGroupNameUndefined: Self = StObject.set(x, "CacheSubnetGroupName", js.undefined)
    
    inline def setSubnets(value: SubnetList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
