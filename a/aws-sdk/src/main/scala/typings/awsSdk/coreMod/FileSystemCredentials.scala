package typings.awsSdk.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/core", "FileSystemCredentials")
@js.native
class FileSystemCredentials protected ()
  extends typings.awsSdk.fileSystemCredentialsMod.FileSystemCredentials {
  /**
    * Creates a new FileSystemCredentials object from a filename.
    * @param {string} filename - The path on disk to the JSON file to load.
    */
  def this(filename: String) = this()
}
