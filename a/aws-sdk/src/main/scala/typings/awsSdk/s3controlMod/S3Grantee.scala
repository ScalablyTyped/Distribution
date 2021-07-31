package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Grantee extends StObject {
  
  /**
    * 
    */
  var DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var Identifier: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var TypeIdentifier: js.UndefOr[S3GranteeTypeIdentifier] = js.undefined
}
object S3Grantee {
  
  @scala.inline
  def apply(): S3Grantee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Grantee]
  }
  
  @scala.inline
  implicit class S3GranteeMutableBuilder[Self <: S3Grantee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setIdentifier(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    @scala.inline
    def setTypeIdentifier(value: S3GranteeTypeIdentifier): Self = StObject.set(x, "TypeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeIdentifierUndefined: Self = StObject.set(x, "TypeIdentifier", js.undefined)
  }
}
