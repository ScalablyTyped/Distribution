package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ami extends StObject {
  
  /**
    *  The account ID of the owner of the AMI. 
    */
  var accountId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The description of the EC2 AMI. Minimum and maximum length are in characters.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The AMI ID of the EC2 AMI. 
    */
  var image: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the EC2 AMI. 
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The AWS Region of the EC2 AMI. 
    */
  var region: js.UndefOr[NonEmptyString] = js.native
  
  var state: js.UndefOr[ImageState] = js.native
}
object Ami {
  
  @scala.inline
  def apply(): Ami = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ami]
  }
  
  @scala.inline
  implicit class AmiMutableBuilder[Self <: Ami] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setImage(value: NonEmptyString): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRegion(value: NonEmptyString): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setState(value: ImageState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
