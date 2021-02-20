package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends StObject {
  
  var size: Double = js.native
  
  var unclampedSize: Double = js.native
}
object Size {
  
  @scala.inline
  def apply(size: Double, unclampedSize: Double): Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], unclampedSize = unclampedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnclampedSize(value: Double): Self = StObject.set(x, "unclampedSize", value.asInstanceOf[js.Any])
  }
}
