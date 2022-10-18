package typings.cassandraDriver.anon

import typings.cassandraDriver.libTypesMod.types.dataTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: dataTypes
  
  var info: Any
}
object Code {
  
  inline def apply(code: dataTypes, info: Any): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: dataTypes): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
