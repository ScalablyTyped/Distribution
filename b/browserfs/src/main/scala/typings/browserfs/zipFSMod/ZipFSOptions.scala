package typings.browserfs.zipFSMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZipFSOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var zipData: Buffer = js.native
}
object ZipFSOptions {
  
  @scala.inline
  def apply(zipData: Buffer): ZipFSOptions = {
    val __obj = js.Dynamic.literal(zipData = zipData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipFSOptions]
  }
  
  @scala.inline
  implicit class ZipFSOptionsMutableBuilder[Self <: ZipFSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setZipData(value: Buffer): Self = StObject.set(x, "zipData", value.asInstanceOf[js.Any])
  }
}
