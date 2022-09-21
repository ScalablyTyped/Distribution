package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.anon.PartialOmitCloudinaryUplo
import typings.cloudinaryUploadwidgetBrowser.anon.Quiet
import typings.cloudinaryUploadwidgetBrowser.anon.RemoveThumbnails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudinaryUploadWidget extends StObject {
  
  def close(): Unit = js.native
  def close(options: Quiet): Unit = js.native
  
  def destroy(): Unit = js.native
  def destroy(options: RemoveThumbnails): Unit = js.native
  
  def hide(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  def isMinimized(): Boolean = js.native
  
  def isShowing(): Boolean = js.native
  
  def minimize(): Unit = js.native
  
  def open(): Unit = js.native
  def open(files: String): Unit = js.native
  
  def show(): Unit = js.native
  
  def update(options: PartialOmitCloudinaryUplo): Unit = js.native
}
