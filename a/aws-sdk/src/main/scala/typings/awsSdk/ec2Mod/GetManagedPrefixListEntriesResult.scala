package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManagedPrefixListEntriesResult extends StObject {
  
  /**
    * Information about the prefix list entries.
    */
  var Entries: js.UndefOr[PrefixListEntrySet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object GetManagedPrefixListEntriesResult {
  
  inline def apply(): GetManagedPrefixListEntriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetManagedPrefixListEntriesResult]
  }
  
  extension [Self <: GetManagedPrefixListEntriesResult](x: Self) {
    
    inline def setEntries(value: PrefixListEntrySet): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    inline def setEntriesVarargs(value: PrefixListEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
