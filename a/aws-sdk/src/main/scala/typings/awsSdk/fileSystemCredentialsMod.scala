package typings.awsSdk

import typings.awsSdk.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/credentials/file_system_credentials", JSImport.Namespace)
@js.native
object fileSystemCredentialsMod extends js.Object {
  
  @js.native
  class FileSystemCredentials protected () extends Credentials {
    /**
      * Creates a new FileSystemCredentials object from a filename.
      * @param {string} filename - The path on disk to the JSON file to load.
      */
    def this(filename: String) = this()
    
    /**
      * The path to the JSON file on disk containing the credentials.
      */
    var filename: String = js.native
  }
}
