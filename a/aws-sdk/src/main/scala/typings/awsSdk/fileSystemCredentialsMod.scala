package typings.awsSdk

import typings.awsSdk.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSystemCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/file_system_credentials", "FileSystemCredentials")
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
