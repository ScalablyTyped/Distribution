package typings.cloudinaryUploadwidgetBrowser

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudinaryBase extends StObject {
  
  def applyUploadWidget(element: HTMLElement, options: CloudinaryUploadWidgetOptions): CloudinaryUploadWidget = js.native
  def applyUploadWidget(
    element: HTMLElement,
    options: CloudinaryUploadWidgetOptions,
    resultCallback: js.Function2[/* error */ String | Null, /* result */ CloudinaryEvent, Unit]
  ): CloudinaryUploadWidget = js.native
  
  def createUploadWidget(options: CloudinaryUploadWidgetOptions): CloudinaryUploadWidget = js.native
  def createUploadWidget(
    options: CloudinaryUploadWidgetOptions,
    resultCallback: js.Function2[/* error */ String | Null, /* result */ CloudinaryEvent, Unit]
  ): CloudinaryUploadWidget = js.native
  
  def openUploadWidget(options: CloudinaryUploadWidgetOptions): CloudinaryUploadWidget = js.native
  def openUploadWidget(
    options: CloudinaryUploadWidgetOptions,
    resultCallback: js.Function2[/* error */ String | Null, /* result */ CloudinaryEvent, Unit]
  ): CloudinaryUploadWidget = js.native
  
  def setCloudName(name: String): Unit = js.native
}
