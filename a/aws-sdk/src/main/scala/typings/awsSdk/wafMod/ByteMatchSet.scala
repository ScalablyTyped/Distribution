package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteMatchSet extends StObject {
  
  /**
    * The ByteMatchSetId for a ByteMatchSet. You use ByteMatchSetId to get information about a ByteMatchSet (see GetByteMatchSet), update a ByteMatchSet (see UpdateByteMatchSet), insert a ByteMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a ByteMatchSet from AWS WAF (see DeleteByteMatchSet).  ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId
  
  /**
    * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings.
    */
  var ByteMatchTuples: typings.awsSdk.wafMod.ByteMatchTuples
  
  /**
    * A friendly name or description of the ByteMatchSet. You can't change Name after you create a ByteMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
}
object ByteMatchSet {
  
  @scala.inline
  def apply(ByteMatchSetId: ResourceId, ByteMatchTuples: ByteMatchTuples): ByteMatchSet = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId.asInstanceOf[js.Any], ByteMatchTuples = ByteMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSet]
  }
  
  @scala.inline
  implicit class ByteMatchSetMutableBuilder[Self <: ByteMatchSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteMatchSetId(value: ResourceId): Self = StObject.set(x, "ByteMatchSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteMatchTuples(value: ByteMatchTuples): Self = StObject.set(x, "ByteMatchTuples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteMatchTuplesVarargs(value: ByteMatchTuple*): Self = StObject.set(x, "ByteMatchTuples", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
