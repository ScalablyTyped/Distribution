package typings.awsSdkBuildTypes.smokeTestModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmokeTestModel extends js.Object {
  
  /**
    * The region to use should no alternative be supplied via the test runner's execution environment.
    */
  var defaultRegion: String = js.native
  
  var testCases: js.Array[SmokeTestCase] = js.native
  
  /**
    * The version of smoke test document.
    */
  var version: Double = js.native
}
object SmokeTestModel {
  
  @scala.inline
  def apply(defaultRegion: String, testCases: js.Array[SmokeTestCase], version: Double): SmokeTestModel = {
    val __obj = js.Dynamic.literal(defaultRegion = defaultRegion.asInstanceOf[js.Any], testCases = testCases.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmokeTestModel]
  }
  
  @scala.inline
  implicit class SmokeTestModelOps[Self <: SmokeTestModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultRegion(value: String): Self = this.set("defaultRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasesVarargs(value: SmokeTestCase*): Self = this.set("testCases", js.Array(value :_*))
    
    @scala.inline
    def setTestCases(value: js.Array[SmokeTestCase]): Self = this.set("testCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
