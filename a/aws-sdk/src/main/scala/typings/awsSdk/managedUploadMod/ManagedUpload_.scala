package typings.awsSdk.managedUploadMod

import typings.awsSdk.awsSdkStrings.httpUploadProgress
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.managedUploadMod.ManagedUpload.ManagedUploadOptions
import typings.awsSdk.managedUploadMod.ManagedUpload.Progress
import typings.awsSdk.managedUploadMod.ManagedUpload.SendData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/s3/managed_upload", "ManagedUpload")
@js.native
class ManagedUpload_ protected () extends js.Object {
  /**
    * Creates a managed upload object with a set of configuration options.
    */
  def this(options: ManagedUploadOptions) = this()
  
  /**
    * Aborts a managed upload, including all concurrent upload requests.
    */
  def abort(): Unit = js.native
  
  /**
    * Adds a listener that is triggered when theuploader has uploaded more data.
    *
    * @param {string} event - httpUploadProgress: triggered when the uploader has uploaded more data.
    * @param {function} listener - Callback to run when the uploader has uploaded more data.
    */
  @JSName("on")
  def on_httpUploadProgress(event: httpUploadProgress, listener: js.Function1[/* progress */ Progress, Unit]): js.Any = js.native
  
  /**
    * Returns a 'thenable' promise.
    */
  def promise(): js.Promise[SendData] = js.native
  
  /**
    * Initiates the managed upload for the payload.
    */
  def send(): Unit = js.native
  def send(callback: js.Function2[/* err */ AWSError, /* data */ SendData, Unit]): Unit = js.native
}
