package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstancePatchesResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * Each entry in the array is a structure containing: Title (string) KBId (string) Classification (string) Severity (string) State (string, such as "INSTALLED" or "FAILED") InstalledTime (DateTime) InstalledBy (string)
    */
  var Patches: js.UndefOr[PatchComplianceDataList] = js.native
}
object DescribeInstancePatchesResult {
  
  @scala.inline
  def apply(): DescribeInstancePatchesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancePatchesResult]
  }
  
  @scala.inline
  implicit class DescribeInstancePatchesResultMutableBuilder[Self <: DescribeInstancePatchesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPatches(value: PatchComplianceDataList): Self = StObject.set(x, "Patches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchesUndefined: Self = StObject.set(x, "Patches", js.undefined)
    
    @scala.inline
    def setPatchesVarargs(value: PatchComplianceData*): Self = StObject.set(x, "Patches", js.Array(value :_*))
  }
}
