package typings.browserfsH4gEcI12.zipFSDTsMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZipFSOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var zipData: Buffer
}
object ZipFSOptions {
  
  inline def apply(zipData: Buffer): ZipFSOptions = {
    val __obj = js.Dynamic.literal(zipData = zipData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipFSOptions]
  }
  
  extension [Self <: ZipFSOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setZipData(value: Buffer): Self = StObject.set(x, "zipData", value.asInstanceOf[js.Any])
  }
}
