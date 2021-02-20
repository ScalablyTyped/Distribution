package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Includedirectories extends StObject {
  
  var include_directories: Boolean = js.native
}
object Includedirectories {
  
  @scala.inline
  def apply(include_directories: Boolean): Includedirectories = {
    val __obj = js.Dynamic.literal(include_directories = include_directories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Includedirectories]
  }
  
  @scala.inline
  implicit class IncludedirectoriesMutableBuilder[Self <: Includedirectories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude_directories(value: Boolean): Self = StObject.set(x, "include_directories", value.asInstanceOf[js.Any])
  }
}
