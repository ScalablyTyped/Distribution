package typings.bip174.srcLibInterfacesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapLeaf
  extends StObject
     with TapScript {
  
  var depth: Double
}
object TapLeaf {
  
  inline def apply(depth: Double, leafVersion: Double, script: Buffer): TapLeaf = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], leafVersion = leafVersion.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapLeaf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TapLeaf] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
  }
}
