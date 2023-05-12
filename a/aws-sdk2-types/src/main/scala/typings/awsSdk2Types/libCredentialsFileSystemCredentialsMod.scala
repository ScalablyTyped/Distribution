package typings.awsSdk2Types

import typings.awsSdk2Types.libCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsFileSystemCredentialsMod {
  
  @JSImport("aws-sdk2-types/lib/credentials/file_system_credentials", "FileSystemCredentials")
  @js.native
  open class FileSystemCredentials protected () extends Credentials {
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
