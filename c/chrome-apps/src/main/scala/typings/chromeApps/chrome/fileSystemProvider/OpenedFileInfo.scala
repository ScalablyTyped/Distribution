package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.anon.READ
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.WRITE
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
    /* import warning: importer.ImportType#apply Failed type conversion: keyof {  READ :'READ',   WRITE :'WRITE'} extends keyof {  READ :'READ',   WRITE :'WRITE'} ? std.Exclude<keyof {  READ :'READ',   WRITE :'WRITE'}, 'READ' | 'WRITE'> : never */ js.Any
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
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  READ :'READ',   WRITE :'WRITE'} extends keyof {  READ :'READ',   WRITE :'WRITE'} ? std.Exclude<keyof {  READ :'READ',   WRITE :'WRITE'}, 'READ' | 'WRITE'> : never */ js.Any
    ],
    openRequestId: integer
  ): OpenedFileInfo = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenedFileInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenedFileInfo] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setMode(
      value: ToStringLiteral[
          READ, 
          /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  READ :'READ',   WRITE :'WRITE'} extends keyof {  READ :'READ',   WRITE :'WRITE'} ? std.Exclude<keyof {  READ :'READ',   WRITE :'WRITE'}, 'READ' | 'WRITE'> : never */ js.Any
        ]
    ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOpenRequestId(value: integer): Self = StObject.set(x, "openRequestId", value.asInstanceOf[js.Any])
  }
}
