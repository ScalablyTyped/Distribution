package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBuildInput extends js.Object {
  
  /**
    * A descriptive label that is associated with a build. Build names do not need to be unique. You can use UpdateBuild to change this value later. 
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * The operating system that the game server binaries are built to run on. This value determines the type of fleet resources that you can use for this build. If your game build contains multiple executables, they all must run on the same operating system. If an operating system is not specified when creating a build, Amazon GameLift uses the default value (WINDOWS_2012). This value cannot be changed later.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.gameliftMod.OperatingSystem] = js.native
  
  /**
    * Information indicating where your game build files are stored. Use this parameter only when creating a build with files stored in an S3 bucket that you own. The storage location must specify an S3 bucket name and key. The location must also specify a role ARN that you set up to allow Amazon GameLift to access your S3 bucket. The S3 bucket and your new build must be in the same Region.
    */
  var StorageLocation: js.UndefOr[S3Location] = js.native
  
  /**
    * A list of labels to assign to the new build resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Version information that is associated with a build or script. Version strings do not need to be unique. You can use UpdateBuild to change this value later. 
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.native
}
object CreateBuildInput {
  
  @scala.inline
  def apply(): CreateBuildInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBuildInput]
  }
  
  @scala.inline
  implicit class CreateBuildInputOps[Self <: CreateBuildInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = this.set("OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystem: Self = this.set("OperatingSystem", js.undefined)
    
    @scala.inline
    def setStorageLocation(value: S3Location): Self = this.set("StorageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageLocation: Self = this.set("StorageLocation", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVersion(value: NonZeroAndMaxString): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
