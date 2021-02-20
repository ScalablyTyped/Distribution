package typings.cordovaPluginFile

import typings.cordovaPluginFile.anon.ApplicationDirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Constants defined in fileSystemPaths
  */
@js.native
trait Cordova extends StObject {
  
  var file: ApplicationDirectory = js.native
}
object Cordova {
  
  @scala.inline
  def apply(file: ApplicationDirectory): Cordova = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
  
  @scala.inline
  implicit class CordovaMutableBuilder[Self <: Cordova] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: ApplicationDirectory): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
