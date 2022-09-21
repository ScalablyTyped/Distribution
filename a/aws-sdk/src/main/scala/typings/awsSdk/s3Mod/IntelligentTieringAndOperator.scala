package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntelligentTieringAndOperator extends StObject {
  
  /**
    * An object key name prefix that identifies the subset of objects to which the configuration applies.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.undefined
  
  /**
    * All of these tags must exist in the object's tag set in order for the configuration to apply.
    */
  var Tags: js.UndefOr[TagSet] = js.undefined
}
object IntelligentTieringAndOperator {
  
  inline def apply(): IntelligentTieringAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntelligentTieringAndOperator]
  }
  
  extension [Self <: IntelligentTieringAndOperator](x: Self) {
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTags(value: TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
