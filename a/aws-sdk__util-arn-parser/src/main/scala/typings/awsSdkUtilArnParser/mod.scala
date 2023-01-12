package typings.awsSdkUtilArnParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-arn-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(arnObject: buildOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(arnObject.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(arn: String): ARN = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(arn.asInstanceOf[js.Any]).asInstanceOf[ARN]
  
  inline def validate(str: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ARN extends StObject {
    
    var accountId: String
    
    var partition: String
    
    var region: String
    
    var resource: String
    
    var service: String
  }
  object ARN {
    
    inline def apply(accountId: String, partition: String, region: String, resource: String, service: String): ARN = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARN]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ARN] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/util-arn-parser.@aws-sdk/util-arn-parser.ARN, 'partition'> & {  partition :string | undefined} */
  trait buildOptions extends StObject {
    
    var accountId: String
    
    var partition: js.UndefOr[String] = js.undefined
    
    var region: String
    
    var resource: String
    
    var service: String
  }
  object buildOptions {
    
    inline def apply(accountId: String, region: String, resource: String, service: String): buildOptions = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[buildOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: buildOptions] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
}
