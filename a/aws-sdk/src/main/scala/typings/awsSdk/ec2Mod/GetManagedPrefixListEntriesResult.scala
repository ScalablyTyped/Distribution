package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetManagedPrefixListEntriesResult extends StObject {
  
  /**
    * Information about the prefix list entries.
    */
  var Entries: js.UndefOr[PrefixListEntrySet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}
object GetManagedPrefixListEntriesResult {
  
  @scala.inline
  def apply(): GetManagedPrefixListEntriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetManagedPrefixListEntriesResult]
  }
  
  @scala.inline
  implicit class GetManagedPrefixListEntriesResultMutableBuilder[Self <: GetManagedPrefixListEntriesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: PrefixListEntrySet): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: PrefixListEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
