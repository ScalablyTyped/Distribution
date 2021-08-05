package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesServerSideEncryptionByDefaultMod.ServerSideEncryptionByDefault
import typings.awsSdkClientS3Browser.typesServerSideEncryptionByDefaultMod.UnmarshalledServerSideEncryptionByDefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServerSideEncryptionRuleMod {
  
  trait ServerSideEncryptionRule extends StObject {
    
    /**
      * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
      */
    var ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault] = js.undefined
  }
  object ServerSideEncryptionRule {
    
    inline def apply(): ServerSideEncryptionRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerSideEncryptionRule]
    }
    
    extension [Self <: ServerSideEncryptionRule](x: Self) {
      
      inline def setApplyServerSideEncryptionByDefault(value: ServerSideEncryptionByDefault): Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", value.asInstanceOf[js.Any])
      
      inline def setApplyServerSideEncryptionByDefaultUndefined: Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", js.undefined)
    }
  }
  
  trait UnmarshalledServerSideEncryptionRule
    extends StObject
       with ServerSideEncryptionRule {
    
    /**
      * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
      */
    @JSName("ApplyServerSideEncryptionByDefault")
    var ApplyServerSideEncryptionByDefault_UnmarshalledServerSideEncryptionRule: js.UndefOr[UnmarshalledServerSideEncryptionByDefault] = js.undefined
  }
  object UnmarshalledServerSideEncryptionRule {
    
    inline def apply(): UnmarshalledServerSideEncryptionRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledServerSideEncryptionRule]
    }
    
    extension [Self <: UnmarshalledServerSideEncryptionRule](x: Self) {
      
      inline def setApplyServerSideEncryptionByDefault(value: UnmarshalledServerSideEncryptionByDefault): Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", value.asInstanceOf[js.Any])
      
      inline def setApplyServerSideEncryptionByDefaultUndefined: Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", js.undefined)
    }
  }
}
