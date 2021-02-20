package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filename extends StObject {
  
  var filename: String = js.native
  
  var path: String = js.native
}
object Filename {
  
  @scala.inline
  def apply(filename: String, path: String): Filename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
  
  @scala.inline
  implicit class FilenameMutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
