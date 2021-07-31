package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICodeMirrorMode extends StObject {
  
  var name: String
  
  var version: String
}
object ICodeMirrorMode {
  
  @scala.inline
  def apply(name: String, version: String): ICodeMirrorMode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeMirrorMode]
  }
  
  @scala.inline
  implicit class ICodeMirrorModeMutableBuilder[Self <: ICodeMirrorMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
