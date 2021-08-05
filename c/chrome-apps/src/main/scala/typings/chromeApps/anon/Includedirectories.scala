package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Includedirectories extends StObject {
  
  var include_directories: Boolean
}
object Includedirectories {
  
  inline def apply(include_directories: Boolean): Includedirectories = {
    val __obj = js.Dynamic.literal(include_directories = include_directories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Includedirectories]
  }
  
  extension [Self <: Includedirectories](x: Self) {
    
    inline def setInclude_directories(value: Boolean): Self = StObject.set(x, "include_directories", value.asInstanceOf[js.Any])
  }
}
