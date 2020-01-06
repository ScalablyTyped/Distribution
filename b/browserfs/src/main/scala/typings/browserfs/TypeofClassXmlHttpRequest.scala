package typings.browserfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.browserfs.distNodeBackendXmlHttpRequestMod.XmlHttpRequest
import typings.browserfs.distNodeBackendXmlHttpRequestMod.XmlHttpRequestOptions
import typings.browserfs.distNodeBackendXmlHttpRequestMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassXmlHttpRequest
  extends Instantiable1[(/* listingUrlOrObj */ js.Object) | (/* listingUrlOrObj */ String), default]
     with Instantiable2[
      (/* listingUrlOrObj */ js.Object) | (/* listingUrlOrObj */ String), 
      /* prefixUrl */ String, 
      default
    ]
     with Instantiable3[
      (/* listingUrlOrObj */ js.Object) | (/* listingUrlOrObj */ String), 
      /* prefixUrl */ String, 
      /* deprecateMsg */ Boolean, 
      default
    ] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Construct an XmlHttpRequest file system backend with the given options.
    */
  def Create(opts: XmlHttpRequestOptions, cb: BFSCallback[XmlHttpRequest]): Unit = js.native
  /**
    * **Deprecated. Please use XmlHttpRequest.Create() method instead to construct XmlHttpRequest objects.**
    *
    * Constructs an XmlHttpRequest object using the directory listing at the given URL.
    * Uses the base URL as the URL prefix for fetched files.
    * @param cb Called when the file system has been instantiated, or if an error occurs.
    */
  def FromURL(url: String, cb: BFSCallback[XmlHttpRequest]): Unit = js.native
  def FromURL(url: String, cb: BFSCallback[XmlHttpRequest], baseUrl: String): Unit = js.native
  def FromURL(url: String, cb: BFSCallback[XmlHttpRequest], baseUrl: String, deprecateMsg: Boolean): Unit = js.native
  def isAvailable(): Boolean = js.native
}

