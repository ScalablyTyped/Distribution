package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationFsxLustreRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the FSx for Lustre file system.
    */
  var FsxFilesystemArn: typings.awsSdk.datasyncMod.FsxFilesystemArn
  
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for Lustre file system.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList
  
  /**
    * A subdirectory in the location's path. This subdirectory in the FSx for Lustre file system is used to read data from the FSx for Lustre source location or write data to the FSx for Lustre destination.
    */
  var Subdirectory: js.UndefOr[FsxLustreSubdirectory] = js.undefined
  
  /**
    * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for your location.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
}
object CreateLocationFsxLustreRequest {
  
  inline def apply(FsxFilesystemArn: FsxFilesystemArn, SecurityGroupArns: Ec2SecurityGroupArnList): CreateLocationFsxLustreRequest = {
    val __obj = js.Dynamic.literal(FsxFilesystemArn = FsxFilesystemArn.asInstanceOf[js.Any], SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationFsxLustreRequest]
  }
  
  extension [Self <: CreateLocationFsxLustreRequest](x: Self) {
    
    inline def setFsxFilesystemArn(value: FsxFilesystemArn): Self = StObject.set(x, "FsxFilesystemArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = StObject.set(x, "SecurityGroupArns", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = StObject.set(x, "SecurityGroupArns", js.Array(value*))
    
    inline def setSubdirectory(value: FsxLustreSubdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
