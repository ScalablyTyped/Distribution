package typings.contentfulManagement.anon

import typings.node.streamMod.Stream
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var file: String | ArrayBuffer | Stream
}
object `0` {
  
  inline def apply(file: String | ArrayBuffer | Stream): `0` = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setFile(value: String | ArrayBuffer | Stream): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
