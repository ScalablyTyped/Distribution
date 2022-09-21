package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) specifying the group. For more information about ARNs and how to use them in policies, see IAM identifiers in the IAM User Guide. 
    */
  var Arn: arnType
  
  /**
    * The date and time, in ISO 8601 date-time format, when the group was created.
    */
  var CreateDate: js.Date
  
  /**
    *  The stable and unique string identifying the group. For more information about IDs, see IAM identifiers in the IAM User Guide. 
    */
  var GroupId: idType
  
  /**
    * The friendly name that identifies the group.
    */
  var GroupName: groupNameType
  
  /**
    * The path to the group. For more information about paths, see IAM identifiers in the IAM User Guide. 
    */
  var Path: pathType
}
object Group {
  
  inline def apply(Arn: arnType, CreateDate: js.Date, GroupId: idType, GroupName: groupNameType, Path: pathType): Group = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: idType): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: groupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
  }
}
