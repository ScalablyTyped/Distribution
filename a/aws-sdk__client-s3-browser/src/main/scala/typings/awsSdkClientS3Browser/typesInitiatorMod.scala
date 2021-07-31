package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInitiatorMod {
  
  trait Initiator extends StObject {
    
    /**
      * <p>Name of the Principal.</p>
      */
    var DisplayName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>If the principal is an AWS account, it provides the Canonical User ID. If the principal is an IAM User, it provides a user ARN value.</p>
      */
    var ID: js.UndefOr[String] = js.undefined
  }
  object Initiator {
    
    @scala.inline
    def apply(): Initiator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Initiator]
    }
    
    @scala.inline
    implicit class InitiatorMutableBuilder[Self <: Initiator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    }
  }
  
  type UnmarshalledInitiator = Initiator
}
