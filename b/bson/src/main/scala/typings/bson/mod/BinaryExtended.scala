package typings.bson.mod

import typings.bson.anon.Base64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryExtended extends StObject {
  
  @JSName("$binary")
  var $binary: Base64
}
object BinaryExtended {
  
  inline def apply($binary: Base64): BinaryExtended = {
    val __obj = js.Dynamic.literal($binary = $binary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExtended]
  }
  
  extension [Self <: BinaryExtended](x: Self) {
    
    inline def set$binary(value: Base64): Self = StObject.set(x, "$binary", value.asInstanceOf[js.Any])
  }
}
