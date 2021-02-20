package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagValues extends StObject {
  
  /**
    * The key for the tag.
    */
  var Key: js.UndefOr[TagKey] = js.native
  
  /**
    * The match options that you can use to filter your results. MatchOptions is only applicable for actions related to Cost Category. The default values for MatchOptions are EQUALS and CASE_SENSITIVE.
    */
  var MatchOptions: js.UndefOr[typings.awsSdk.costexplorerMod.MatchOptions] = js.native
  
  /**
    * The specific value of the tag.
    */
  var Values: js.UndefOr[typings.awsSdk.costexplorerMod.Values] = js.native
}
object TagValues {
  
  @scala.inline
  def apply(): TagValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagValues]
  }
  
  @scala.inline
  implicit class TagValuesMutableBuilder[Self <: TagValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setMatchOptions(value: MatchOptions): Self = StObject.set(x, "MatchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchOptionsUndefined: Self = StObject.set(x, "MatchOptions", js.undefined)
    
    @scala.inline
    def setMatchOptionsVarargs(value: MatchOption*): Self = StObject.set(x, "MatchOptions", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Value*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
