package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCaseFilter extends StObject {
  
  /**
    * A keyword that is used to filter on the name or the prefix of the test cases. Only test cases where the keyword is a substring of the name or the prefix will be returned.
    */
  var keyword: js.UndefOr[String] = js.native
  
  /**
    * The status used to filter test cases. A TestCaseFilter can have one status. Valid values are:    SUCCEEDED     FAILED     ERROR     SKIPPED     UNKNOWN   
    */
  var status: js.UndefOr[String] = js.native
}
object TestCaseFilter {
  
  @scala.inline
  def apply(): TestCaseFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCaseFilter]
  }
  
  @scala.inline
  implicit class TestCaseFilterMutableBuilder[Self <: TestCaseFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
