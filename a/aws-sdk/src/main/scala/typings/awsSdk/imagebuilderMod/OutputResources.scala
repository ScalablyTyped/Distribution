package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputResources extends StObject {
  
  /**
    * The EC2 AMIs created by this image. 
    */
  var amis: js.UndefOr[AmiList] = js.undefined
}
object OutputResources {
  
  inline def apply(): OutputResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputResources]
  }
  
  extension [Self <: OutputResources](x: Self) {
    
    inline def setAmis(value: AmiList): Self = StObject.set(x, "amis", value.asInstanceOf[js.Any])
    
    inline def setAmisUndefined: Self = StObject.set(x, "amis", js.undefined)
    
    inline def setAmisVarargs(value: Ami*): Self = StObject.set(x, "amis", js.Array(value :_*))
  }
}
