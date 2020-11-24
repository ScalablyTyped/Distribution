package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.anon.READ
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.WRITE
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenedFileInfo extends js.Object {
  
  /** The path of the opened file. */
  var filePath: String = js.native
  
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
  ] = js.native
  
  /** A request ID to be be used by consecutive read/write and close requests. */
  var openRequestId: integer = js.native
}
object OpenedFileInfo {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class OpenedFileInfoOps[Self <: OpenedFileInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(
      value: ToStringLiteral[
          READ, 
          /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
          Exclude[
            /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
            typings.chromeApps.chromeAppsStrings.READ | WRITE
          ]
        ]
    ): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenRequestId(value: integer): Self = this.set("openRequestId", value.asInstanceOf[js.Any])
  }
}
