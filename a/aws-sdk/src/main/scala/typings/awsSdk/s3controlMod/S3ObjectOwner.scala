package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ObjectOwner extends StObject {
  
  /**
    * 
    */
  var DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * 
    */
  var ID: js.UndefOr[NonEmptyMaxLength1024String] = js.native
}
object S3ObjectOwner {
  
  @scala.inline
  def apply(): S3ObjectOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ObjectOwner]
  }
  
  @scala.inline
  implicit class S3ObjectOwnerMutableBuilder[Self <: S3ObjectOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setID(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
  }
}
