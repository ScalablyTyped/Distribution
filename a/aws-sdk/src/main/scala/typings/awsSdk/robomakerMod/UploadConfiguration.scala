package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadConfiguration extends StObject {
  
  /**
    * A prefix that specifies where files will be uploaded in Amazon S3. It is appended to the simulation output location to determine the final path.   For example, if your simulation output location is s3://my-bucket and your upload configuration name is robot-test, your files will be uploaded to s3://my-bucket/&lt;simid&gt;/&lt;runid&gt;/robot-test. 
    */
  var name: Name
  
  /**
    *  Specifies the path of the file(s) to upload. Standard Unix glob matching rules are accepted, with the addition of ** as a super asterisk. For example, specifying /var/log/ **.log causes all .log files in the /var/log directory tree to be collected. For more examples, see Glob Library. 
    */
  var path: Path
  
  /**
    * Specifies when to upload the files:  UPLOAD_ON_TERMINATE  Matching files are uploaded once the simulation enters the TERMINATING state. Matching files are not uploaded until all of your code (including tools) have stopped.  If there is a problem uploading a file, the upload is retried. If problems persist, no further upload attempts will be made.  UPLOAD_ROLLING_AUTO_REMOVE  Matching files are uploaded as they are created. They are deleted after they are uploaded. The specified path is checked every 5 seconds. A final check is made when all of your code (including tools) have stopped.   
    */
  var uploadBehavior: UploadBehavior
}
object UploadConfiguration {
  
  inline def apply(name: Name, path: Path, uploadBehavior: UploadBehavior): UploadConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], uploadBehavior = uploadBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadConfiguration]
  }
  
  extension [Self <: UploadConfiguration](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setUploadBehavior(value: UploadBehavior): Self = StObject.set(x, "uploadBehavior", value.asInstanceOf[js.Any])
  }
}
