package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
    */
  var Arn: FileSystemArn
  
  /**
    * The path where the function can access the file system, starting with /mnt/.
    */
  var LocalMountPath: typings.awsSdk.lambdaMod.LocalMountPath
}
object FileSystemConfig {
  
  inline def apply(Arn: FileSystemArn, LocalMountPath: LocalMountPath): FileSystemConfig = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], LocalMountPath = LocalMountPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemConfig]
  }
  
  extension [Self <: FileSystemConfig](x: Self) {
    
    inline def setArn(value: FileSystemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setLocalMountPath(value: LocalMountPath): Self = StObject.set(x, "LocalMountPath", value.asInstanceOf[js.Any])
  }
}
