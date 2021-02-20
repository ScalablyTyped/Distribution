package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Destination
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAccessControlTranslationMod {
  
  @js.native
  trait AccessControlTranslation extends StObject {
    
    /**
      * <p>The override value for the owner of the replica object.</p>
      */
    var Owner: Destination | String = js.native
  }
  object AccessControlTranslation {
    
    @scala.inline
    def apply(Owner: Destination | String): AccessControlTranslation = {
      val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessControlTranslation]
    }
    
    @scala.inline
    implicit class AccessControlTranslationMutableBuilder[Self <: AccessControlTranslation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwner(value: Destination | String): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledAccessControlTranslation = AccessControlTranslation
}
