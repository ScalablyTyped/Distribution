package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceBuildInformation extends StObject {
  
  /**
    * The location of the source code, as a formatted string, depending on the value of SourceRepository    For CodeCommit, the format is the repository name and commit ID, separated by a forward slash. For example, my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a.   For S3, the format is the S3 bucket name and object key, separated by a forward slash. For example, my-s3-bucket/Folders/my-source-file.  
    */
  var SourceLocation: typings.awsSdk.elasticbeanstalkMod.SourceLocation
  
  /**
    * Location where the repository is stored.    CodeCommit     S3   
    */
  var SourceRepository: typings.awsSdk.elasticbeanstalkMod.SourceRepository
  
  /**
    * The type of repository.    Git     Zip   
    */
  var SourceType: typings.awsSdk.elasticbeanstalkMod.SourceType
}
object SourceBuildInformation {
  
  @scala.inline
  def apply(SourceLocation: SourceLocation, SourceRepository: SourceRepository, SourceType: SourceType): SourceBuildInformation = {
    val __obj = js.Dynamic.literal(SourceLocation = SourceLocation.asInstanceOf[js.Any], SourceRepository = SourceRepository.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBuildInformation]
  }
  
  @scala.inline
  implicit class SourceBuildInformationMutableBuilder[Self <: SourceBuildInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceLocation(value: SourceLocation): Self = StObject.set(x, "SourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRepository(value: SourceRepository): Self = StObject.set(x, "SourceRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
  }
}
