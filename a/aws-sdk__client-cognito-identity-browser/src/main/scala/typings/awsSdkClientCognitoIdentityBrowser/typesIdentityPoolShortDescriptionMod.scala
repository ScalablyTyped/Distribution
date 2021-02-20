package typings.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIdentityPoolShortDescriptionMod {
  
  @js.native
  trait IdentityPoolShortDescription extends StObject {
    
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: js.UndefOr[String] = js.native
    
    /**
      * <p>A string that you provide.</p>
      */
    var IdentityPoolName: js.UndefOr[String] = js.native
  }
  object IdentityPoolShortDescription {
    
    @scala.inline
    def apply(): IdentityPoolShortDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityPoolShortDescription]
    }
    
    @scala.inline
    implicit class IdentityPoolShortDescriptionMutableBuilder[Self <: IdentityPoolShortDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
      
      @scala.inline
      def setIdentityPoolName(value: String): Self = StObject.set(x, "IdentityPoolName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityPoolNameUndefined: Self = StObject.set(x, "IdentityPoolName", js.undefined)
    }
  }
  
  type UnmarshalledIdentityPoolShortDescription = IdentityPoolShortDescription
}
