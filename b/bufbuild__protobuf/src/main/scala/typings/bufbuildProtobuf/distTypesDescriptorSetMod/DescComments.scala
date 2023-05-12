package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescComments extends StObject {
  
  val leading: js.UndefOr[String] = js.undefined
  
  val leadingDetached: js.Array[String]
  
  val sourcePath: js.Array[Double]
  
  val trailing: js.UndefOr[String] = js.undefined
}
object DescComments {
  
  inline def apply(leadingDetached: js.Array[String], sourcePath: js.Array[Double]): DescComments = {
    val __obj = js.Dynamic.literal(leadingDetached = leadingDetached.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescComments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescComments] (val x: Self) extends AnyVal {
    
    inline def setLeading(value: String): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    inline def setLeadingDetached(value: js.Array[String]): Self = StObject.set(x, "leadingDetached", value.asInstanceOf[js.Any])
    
    inline def setLeadingDetachedVarargs(value: String*): Self = StObject.set(x, "leadingDetached", js.Array(value*))
    
    inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    
    inline def setSourcePath(value: js.Array[Double]): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    
    inline def setSourcePathVarargs(value: Double*): Self = StObject.set(x, "sourcePath", js.Array(value*))
    
    inline def setTrailing(value: String): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    
    inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
  }
}
