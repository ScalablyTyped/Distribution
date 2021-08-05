package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageVersion extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image semantic version.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * The date at which this image semantic version was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The name of the image semantic version.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    *  The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server 2019. 
    */
  var osVersion: js.UndefOr[OsVersion] = js.undefined
  
  /**
    * The owner of the image semantic version.
    */
  var owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The platform of the image semantic version.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * The semantic version of the image semantic version.
    */
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object ImageVersion {
  
  inline def apply(): ImageVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageVersion]
  }
  
  extension [Self <: ImageVersion](x: Self) {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOsVersion(value: OsVersion): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
