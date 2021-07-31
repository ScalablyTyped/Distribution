package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRunner extends StObject {
  
  var name: String
}
object TestRunner {
  
  @scala.inline
  def apply(name: String): TestRunner = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunner]
  }
  
  @scala.inline
  implicit class TestRunnerMutableBuilder[Self <: TestRunner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
