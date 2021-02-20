package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesServerSideEncryptionByDefaultMod.ServerSideEncryptionByDefault
import typings.awsSdkClientS3Browser.typesServerSideEncryptionByDefaultMod.UnmarshalledServerSideEncryptionByDefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServerSideEncryptionRuleMod {
  
  @js.native
  trait ServerSideEncryptionRule extends StObject {
    
    /**
      * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
      */
    var ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault] = js.native
  }
  object ServerSideEncryptionRule {
    
    @scala.inline
    def apply(): ServerSideEncryptionRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerSideEncryptionRule]
    }
    
    @scala.inline
    implicit class ServerSideEncryptionRuleMutableBuilder[Self <: ServerSideEncryptionRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyServerSideEncryptionByDefault(value: ServerSideEncryptionByDefault): Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyServerSideEncryptionByDefaultUndefined: Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledServerSideEncryptionRule extends ServerSideEncryptionRule {
    
    /**
      * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
      */
    @JSName("ApplyServerSideEncryptionByDefault")
    var ApplyServerSideEncryptionByDefault_UnmarshalledServerSideEncryptionRule: js.UndefOr[UnmarshalledServerSideEncryptionByDefault] = js.native
  }
  object UnmarshalledServerSideEncryptionRule {
    
    @scala.inline
    def apply(): UnmarshalledServerSideEncryptionRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledServerSideEncryptionRule]
    }
    
    @scala.inline
    implicit class UnmarshalledServerSideEncryptionRuleMutableBuilder[Self <: UnmarshalledServerSideEncryptionRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyServerSideEncryptionByDefault(value: UnmarshalledServerSideEncryptionByDefault): Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyServerSideEncryptionByDefaultUndefined: Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", js.undefined)
    }
  }
}
