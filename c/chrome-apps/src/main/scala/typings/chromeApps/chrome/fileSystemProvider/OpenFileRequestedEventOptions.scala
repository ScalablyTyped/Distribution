package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.anon.READ
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.fileSystemProvider.internal.FilePathRequestedEventOptions
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.WRITE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenFileRequestedEventOptions
  extends StObject
     with FilePathRequestedEventOptions {
  
  /**
    * Whether the file will be used for reading or writing.
    * @see ChangeType
    */
  var mode: ToStringLiteral[
    READ, 
    /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
    /* import warning: importer.ImportType#apply Failed type conversion: keyof {  READ :'READ',   WRITE :'WRITE'} extends keyof {  READ :'READ',   WRITE :'WRITE'} ? std.Exclude<keyof {  READ :'READ',   WRITE :'WRITE'}, 'READ' | 'WRITE'> : never */ js.Any
  ]
}
object OpenFileRequestedEventOptions {
  
  inline def apply(
    filePath: String,
    fileSystemId: String,
    mode: ToStringLiteral[
      READ, 
      /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  READ :'READ',   WRITE :'WRITE'} extends keyof {  READ :'READ',   WRITE :'WRITE'} ? std.Exclude<keyof {  READ :'READ',   WRITE :'WRITE'}, 'READ' | 'WRITE'> : never */ js.Any
    ],
    requestId: integer
  ): OpenFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFileRequestedEventOptions]
  }
  
  extension [Self <: OpenFileRequestedEventOptions](x: Self) {
    
    inline def setMode(
      value: ToStringLiteral[
          READ, 
          /* keyof chrome-apps.anon.READ */ typings.chromeApps.chromeAppsStrings.READ | WRITE, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  READ :'READ',   WRITE :'WRITE'} extends keyof {  READ :'READ',   WRITE :'WRITE'} ? std.Exclude<keyof {  READ :'READ',   WRITE :'WRITE'}, 'READ' | 'WRITE'> : never */ js.Any
        ]
    ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
