package typings.cloudinaryUploadwidgetBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudinaryUploadWidgetOptions
  extends StObject
     with RequiredParameters
     with WidgetParameters
     with CroppingParameters
     with SourcesParameters
     with UploadParameters
     with ClientParameters
     with PageParameters
     with CustomizationParameters
     with AdvancedParameters
object CloudinaryUploadWidgetOptions {
  
  inline def apply(cloudName: String): CloudinaryUploadWidgetOptions = {
    val __obj = js.Dynamic.literal(cloudName = cloudName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudinaryUploadWidgetOptions]
  }
}
