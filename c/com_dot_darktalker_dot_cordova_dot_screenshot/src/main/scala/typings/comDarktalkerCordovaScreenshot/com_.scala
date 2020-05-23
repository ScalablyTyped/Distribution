package typings.comDarktalkerCordovaScreenshot

import typings.comDarktalkerCordovaScreenshot.anon.FilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("com")
@js.native
object com_ extends js.Object {
  @js.native
  object darktalker extends js.Object {
    @js.native
    object cordova extends js.Object {
      @js.native
      object screenshot extends js.Object {
        @js.native
        trait Plugin extends js.Object {
          /**
            * Takes a screenshot and provides it trough data URI as JPG. No data are saved in the device.
            *
            * @param uriCallback callback function, holds results
            * @param quality custom quality of to be taken image in percentage (100 is default)
            */
          def URI(
            uriCallback: js.Function2[
                      /* errorMessage */ String, 
                      /* successObject */ typings.comDarktalkerCordovaScreenshot.anon.URI, 
                      Unit
                    ]
          ): Unit = js.native
          def URI(
            uriCallback: js.Function2[
                      /* errorMessage */ String, 
                      /* successObject */ typings.comDarktalkerCordovaScreenshot.anon.URI, 
                      Unit
                    ],
            quality: Double
          ): Unit = js.native
          /**
            * Takes a screenshot, saves it to device as JPG and provides a path to the file.
            *
            * @param saveCallback callback function, holds results
            * @param format format of to be taken image, possible values are 'jpg' and 'png' ('jpg' is default)
            * @param quality custom quality of to be taken image in percentage (100 is default)
            * @param filename custom filename of to be taken image, ('screenshot_<milliSecondsSince1970>.<format>' is default)
            */
          def save(saveCallback: js.Function2[/* errorMessage */ String, /* successObject */ FilePath, Unit]): Unit = js.native
          def save(
            saveCallback: js.Function2[/* errorMessage */ String, /* successObject */ FilePath, Unit],
            format: String
          ): Unit = js.native
          def save(
            saveCallback: js.Function2[/* errorMessage */ String, /* successObject */ FilePath, Unit],
            format: String,
            quality: Double
          ): Unit = js.native
          def save(
            saveCallback: js.Function2[/* errorMessage */ String, /* successObject */ FilePath, Unit],
            format: String,
            quality: Double,
            filename: String
          ): Unit = js.native
        }
        
      }
      
    }
    
  }
  
}

