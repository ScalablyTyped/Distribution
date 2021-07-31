package typings.awsSdkClientLambdaNode

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesVpcConfigMod {
  
  trait UnmarshalledVpcConfig
    extends StObject
       with VpcConfig {
    
    /**
      * <p>A list of VPC security groups IDs.</p>
      */
    @JSName("SecurityGroupIds")
    var SecurityGroupIds_UnmarshalledVpcConfig: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * <p>A list of VPC subnet IDs.</p>
      */
    @JSName("SubnetIds")
    var SubnetIds_UnmarshalledVpcConfig: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledVpcConfig {
    
    @scala.inline
    def apply(): UnmarshalledVpcConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledVpcConfig]
    }
    
    @scala.inline
    implicit class UnmarshalledVpcConfigMutableBuilder[Self <: UnmarshalledVpcConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    }
  }
  
  trait VpcConfig extends StObject {
    
    /**
      * <p>A list of VPC security groups IDs.</p>
      */
    var SecurityGroupIds: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
    
    /**
      * <p>A list of VPC subnet IDs.</p>
      */
    var SubnetIds: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  }
  object VpcConfig {
    
    @scala.inline
    def apply(): VpcConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcConfig]
    }
    
    @scala.inline
    implicit class VpcConfigMutableBuilder[Self <: VpcConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurityGroupIds(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    }
  }
}
