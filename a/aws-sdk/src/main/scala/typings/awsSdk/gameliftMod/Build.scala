package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift build resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift build ARN, the resource ID matches the BuildId value.
    */
  var BuildArn: js.UndefOr[typings.awsSdk.gameliftMod.BuildArn] = js.undefined
  
  /**
    * A unique identifier for a build.
    */
  var BuildId: js.UndefOr[typings.awsSdk.gameliftMod.BuildId] = js.undefined
  
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A descriptive label that is associated with a build. Build names do not need to be unique. It can be set using CreateBuild or UpdateBuild.
    */
  var Name: js.UndefOr[FreeText] = js.undefined
  
  /**
    * Operating system that the game server binaries are built to run on. This value determines the type of fleet resources that you can use for this build.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.gameliftMod.OperatingSystem] = js.undefined
  
  /**
    * File size of the uploaded game build, expressed in bytes. When the build status is INITIALIZED, this value is 0.
    */
  var SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined
  
  /**
    * Current status of the build. Possible build statuses include the following:    INITIALIZED -- A new build has been defined, but no files have been uploaded. You cannot create fleets for builds that are in this status. When a build is successfully created, the build status is set to this value.     READY -- The game build has been successfully uploaded. You can now create new fleets for this build.    FAILED -- The game build upload failed. You cannot create new fleets for this build.   
    */
  var Status: js.UndefOr[BuildStatus] = js.undefined
  
  /**
    * Version information that is associated with a build or script. Version strings do not need to be unique. This value can be set using CreateBuild or UpdateBuild.
    */
  var Version: js.UndefOr[FreeText] = js.undefined
}
object Build {
  
  @scala.inline
  def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit class BuildMutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildArn(value: BuildArn): Self = StObject.set(x, "BuildArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildArnUndefined: Self = StObject.set(x, "BuildArn", js.undefined)
    
    @scala.inline
    def setBuildId(value: BuildId): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildIdUndefined: Self = StObject.set(x, "BuildId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setName(value: FreeText): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    @scala.inline
    def setSizeOnDisk(value: PositiveLong): Self = StObject.set(x, "SizeOnDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeOnDiskUndefined: Self = StObject.set(x, "SizeOnDisk", js.undefined)
    
    @scala.inline
    def setStatus(value: BuildStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVersion(value: FreeText): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
