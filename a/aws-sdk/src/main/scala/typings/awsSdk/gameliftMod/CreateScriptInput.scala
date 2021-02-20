package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScriptInput extends StObject {
  
  /**
    * A descriptive label that is associated with a script. Script names do not need to be unique. You can use UpdateScript to change this value later. 
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to create a new script. By default, Amazon GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on, you can use the ObjectVersion parameter to specify an earlier version. 
    */
  var StorageLocation: js.UndefOr[S3Location] = js.native
  
  /**
    * A list of labels to assign to the new script resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The version that is associated with a build or script. Version strings do not need to be unique. You can use UpdateScript to change this value later. 
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one or multiple files. Maximum size of a zip file is 5 MB. When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be prepended with the string "fileb://" to indicate that the file data is a binary object. For example: --zip-file fileb://myRealtimeScript.zip.
    */
  var ZipFile: js.UndefOr[ZipBlob] = js.native
}
object CreateScriptInput {
  
  @scala.inline
  def apply(): CreateScriptInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateScriptInput]
  }
  
  @scala.inline
  implicit class CreateScriptInputMutableBuilder[Self <: CreateScriptInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStorageLocation(value: S3Location): Self = StObject.set(x, "StorageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLocationUndefined: Self = StObject.set(x, "StorageLocation", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: NonZeroAndMaxString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    
    @scala.inline
    def setZipFile(value: ZipBlob): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
  }
}
