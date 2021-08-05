package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.anon.READ
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.WRITE
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenedFileInfo extends StObject {
  
  /** The path of the opened file. */
  var filePath: String
  
  /**
    * Whether the file was opened for reading or writing.
    * @see OpenFileMode
    */
  var mode: ToStringLiteral[
    READ, 
    /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
    Exclude[
      /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
      typings.chromeApps.chromeAppsStrings.READ | WRITE
    ]
  ]
  
  /** A request ID to be be used by consecutive read/write and close requests. */
  var openRequestId: integer
}
object OpenedFileInfo {
  
  inline def apply(
    filePath: String,
    mode: ToStringLiteral[
      READ, 
      /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
      Exclude[
        /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
        typings.chromeApps.chromeAppsStrings.READ | WRITE
      ]
    ],
    openRequestId: integer
  ): OpenedFileInfo = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenedFileInfo]
  }
  
  extension [Self <: OpenedFileInfo](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setMode(
      value: ToStringLiteral[
          READ, 
          /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
          Exclude[
            /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
            typings.chromeApps.chromeAppsStrings.READ | WRITE
          ]
        ]
    ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOpenRequestId(value: integer): Self = StObject.set(x, "openRequestId", value.asInstanceOf[js.Any])
  }
}
