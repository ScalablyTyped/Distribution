package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupInformation extends StObject {
  
  /**
    * The ARN of the group.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the group was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the group.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the group was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the latest version associated with the group.
    */
  var LatestVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the latest version associated with the group.
    */
  var LatestVersionArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the group.
    */
  var Name: js.UndefOr[string] = js.undefined
}
object GroupInformation {
  
  @scala.inline
  def apply(): GroupInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupInformation]
  }
  
  @scala.inline
  implicit class GroupInformationMutableBuilder[Self <: GroupInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: string): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: string): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setLatestVersion(value: string): Self = StObject.set(x, "LatestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersionArn(value: string): Self = StObject.set(x, "LatestVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersionArnUndefined: Self = StObject.set(x, "LatestVersionArn", js.undefined)
    
    @scala.inline
    def setLatestVersionUndefined: Self = StObject.set(x, "LatestVersion", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
