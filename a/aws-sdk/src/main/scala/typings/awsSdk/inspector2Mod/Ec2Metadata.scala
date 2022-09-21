package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ec2Metadata extends StObject {
  
  /**
    * The ID of the Amazon Machine Image (AMI) used to launch the instance.
    */
  var amiId: js.UndefOr[AmiId] = js.undefined
  
  /**
    * The platform of the instance.
    */
  var platform: js.UndefOr[Ec2Platform] = js.undefined
  
  /**
    * The tags attached to the instance.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object Ec2Metadata {
  
  inline def apply(): Ec2Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ec2Metadata]
  }
  
  extension [Self <: Ec2Metadata](x: Self) {
    
    inline def setAmiId(value: AmiId): Self = StObject.set(x, "amiId", value.asInstanceOf[js.Any])
    
    inline def setAmiIdUndefined: Self = StObject.set(x, "amiId", js.undefined)
    
    inline def setPlatform(value: Ec2Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
