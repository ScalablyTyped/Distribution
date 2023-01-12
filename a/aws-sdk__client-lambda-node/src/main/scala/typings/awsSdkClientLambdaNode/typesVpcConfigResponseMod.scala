package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesVpcConfigResponseMod {
  
  trait UnmarshalledVpcConfigResponse
    extends StObject
       with VpcConfigResponse {
    
    /**
      * <p>A list of VPC security groups IDs.</p>
      */
    @JSName("SecurityGroupIds")
    var SecurityGroupIds_UnmarshalledVpcConfigResponse: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * <p>A list of VPC subnet IDs.</p>
      */
    @JSName("SubnetIds")
    var SubnetIds_UnmarshalledVpcConfigResponse: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledVpcConfigResponse {
    
    inline def apply(): UnmarshalledVpcConfigResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledVpcConfigResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledVpcConfigResponse] (val x: Self) extends AnyVal {
      
      inline def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
      
      inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
      
      inline def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    }
  }
  
  trait VpcConfigResponse extends StObject {
    
    /**
      * <p>A list of VPC security groups IDs.</p>
      */
    var SecurityGroupIds: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
    /**
      * <p>A list of VPC subnet IDs.</p>
      */
    var SubnetIds: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
    /**
      * <p>The ID of the VPC.</p>
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  object VpcConfigResponse {
    
    inline def apply(): VpcConfigResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcConfigResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VpcConfigResponse] (val x: Self) extends AnyVal {
      
      inline def setSecurityGroupIds(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
      
      inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
      
      inline def setSubnetIds(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
      
      inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    }
  }
}
