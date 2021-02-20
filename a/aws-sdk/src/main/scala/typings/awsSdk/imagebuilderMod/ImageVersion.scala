package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageVersion extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image semantic version.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  
  /**
    * The date at which this image semantic version was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  
  /**
    * The name of the image semantic version.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    *  The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server 2019. 
    */
  var osVersion: js.UndefOr[OsVersion] = js.native
  
  /**
    * The owner of the image semantic version.
    */
  var owner: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The platform of the image semantic version.
    */
  var platform: js.UndefOr[Platform] = js.native
  
  /**
    * The semantic version of the image semantic version.
    */
  var version: js.UndefOr[VersionNumber] = js.native
}
object ImageVersion {
  
  @scala.inline
  def apply(): ImageVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageVersion]
  }
  
  @scala.inline
  implicit class ImageVersionMutableBuilder[Self <: ImageVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOsVersion(value: OsVersion): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    @scala.inline
    def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
