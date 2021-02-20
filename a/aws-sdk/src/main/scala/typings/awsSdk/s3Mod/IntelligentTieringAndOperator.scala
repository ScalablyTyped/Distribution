package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntelligentTieringAndOperator extends StObject {
  
  /**
    * An object key name prefix that identifies the subset of objects to which the configuration applies.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  
  /**
    * All of these tags must exist in the object's tag set in order for the configuration to apply.
    */
  var Tags: js.UndefOr[TagSet] = js.native
}
object IntelligentTieringAndOperator {
  
  @scala.inline
  def apply(): IntelligentTieringAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntelligentTieringAndOperator]
  }
  
  @scala.inline
  implicit class IntelligentTieringAndOperatorMutableBuilder[Self <: IntelligentTieringAndOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setTags(value: TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
