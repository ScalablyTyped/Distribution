package typings.protobufjsEQaYEpP4.indexDotDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileDescriptorSet extends StObject {
  
  var file: js.Array[IFileDescriptorProto]
}
object IFileDescriptorSet {
  
  inline def apply(file: js.Array[IFileDescriptorProto]): IFileDescriptorSet = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDescriptorSet]
  }
  
  extension [Self <: IFileDescriptorSet](x: Self) {
    
    inline def setFile(value: js.Array[IFileDescriptorProto]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileVarargs(value: IFileDescriptorProto*): Self = StObject.set(x, "file", js.Array(value*))
  }
}
