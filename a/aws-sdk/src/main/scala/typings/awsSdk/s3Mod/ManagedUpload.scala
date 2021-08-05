package typings.awsSdk.s3Mod

import typings.awsSdk.managedUploadMod.ManagedUpload.ManagedUploadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/s3", "ManagedUpload")
@js.native
class ManagedUpload protected ()
  extends typings.awsSdk.managedUploadMod.ManagedUpload {
  /**
    * Creates a managed upload object with a set of configuration options.
    */
  def this(options: ManagedUploadOptions) = this()
}
/* static members */
object ManagedUpload {
  
  @JSImport("aws-sdk/clients/s3", "ManagedUpload")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default value: 10000
    */
  @JSImport("aws-sdk/clients/s3", "ManagedUpload.maxTotalParts")
  @js.native
  def maxTotalParts: Double = js.native
  inline def maxTotalParts_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxTotalParts")(x.asInstanceOf[js.Any])
  
  /**
    * Returns the minimum number of bytes for an individual part upload.
    * Note: Minimum allowed size is 5 MB.
    * 1024 * 5
    */
  @JSImport("aws-sdk/clients/s3", "ManagedUpload.minPartSize")
  @js.native
  def minPartSize: Double = js.native
  inline def minPartSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPartSize")(x.asInstanceOf[js.Any])
}
