package typings.cordovaPluginFile

import typings.cordovaPluginFile.anon.ApplicationDirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Constants defined in fileSystemPaths
  */
trait Cordova extends StObject {
  
  var file: ApplicationDirectory
}
object Cordova {
  
  inline def apply(file: ApplicationDirectory): Cordova = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
  
  extension [Self <: Cordova](x: Self) {
    
    inline def setFile(value: ApplicationDirectory): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
