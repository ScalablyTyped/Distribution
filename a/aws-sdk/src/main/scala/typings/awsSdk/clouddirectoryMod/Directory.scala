package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directory extends StObject {
  
  /**
    * The date and time when the directory was created.
    */
  var CreationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the directory. For more information, see arns.
    */
  var DirectoryArn: js.UndefOr[typings.awsSdk.clouddirectoryMod.DirectoryArn] = js.undefined
  
  /**
    * The name of the directory.
    */
  var Name: js.UndefOr[DirectoryName] = js.undefined
  
  /**
    * The state of the directory. Can be either Enabled, Disabled, or Deleted.
    */
  var State: js.UndefOr[DirectoryState] = js.undefined
}
object Directory {
  
  @scala.inline
  def apply(): Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Directory]
  }
  
  @scala.inline
  implicit class DirectoryMutableBuilder[Self <: Directory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    @scala.inline
    def setDirectoryArn(value: DirectoryArn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryArnUndefined: Self = StObject.set(x, "DirectoryArn", js.undefined)
    
    @scala.inline
    def setName(value: DirectoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setState(value: DirectoryState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
