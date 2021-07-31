package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSourceVersion extends StObject {
  
  /**
    * An identifier for a source in the build project.
    */
  var sourceIdentifier: String
  
  /**
    * The source version for the corresponding source identifier. If specified, must be one of:   For AWS CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example, pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.    For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: String
}
object ProjectSourceVersion {
  
  @scala.inline
  def apply(sourceIdentifier: String, sourceVersion: String): ProjectSourceVersion = {
    val __obj = js.Dynamic.literal(sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any], sourceVersion = sourceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSourceVersion]
  }
  
  @scala.inline
  implicit class ProjectSourceVersionMutableBuilder[Self <: ProjectSourceVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceIdentifier(value: String): Self = StObject.set(x, "sourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
  }
}
