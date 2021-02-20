package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Script extends StObject {
  
  /**
    * A time stamp indicating when this data object was created. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A descriptive label that is associated with a script. Script names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift script resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift script ARN, the resource ID matches the ScriptId value.
    */
  var ScriptArn: js.UndefOr[typings.awsSdk.gameliftMod.ScriptArn] = js.native
  
  /**
    * A unique identifier for a Realtime script
    */
  var ScriptId: js.UndefOr[typings.awsSdk.gameliftMod.ScriptId] = js.native
  
  /**
    * The file size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3 location, this value remains at "0".
    */
  var SizeOnDisk: js.UndefOr[PositiveLong] = js.native
  
  var StorageLocation: js.UndefOr[S3Location] = js.native
  
  /**
    * The version that is associated with a build or script. Version strings do not need to be unique.
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.native
}
object Script {
  
  @scala.inline
  def apply(): Script = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Script]
  }
  
  @scala.inline
  implicit class ScriptMutableBuilder[Self <: Script] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setScriptArn(value: ScriptArn): Self = StObject.set(x, "ScriptArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptArnUndefined: Self = StObject.set(x, "ScriptArn", js.undefined)
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "ScriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "ScriptId", js.undefined)
    
    @scala.inline
    def setSizeOnDisk(value: PositiveLong): Self = StObject.set(x, "SizeOnDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeOnDiskUndefined: Self = StObject.set(x, "SizeOnDisk", js.undefined)
    
    @scala.inline
    def setStorageLocation(value: S3Location): Self = StObject.set(x, "StorageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLocationUndefined: Self = StObject.set(x, "StorageLocation", js.undefined)
    
    @scala.inline
    def setVersion(value: NonZeroAndMaxString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
