package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScriptOutput extends StObject {
  
  /**
    * A set of properties describing the requested script.
    */
  var Script: js.UndefOr[typings.awsSdk.gameliftMod.Script] = js.native
}
object DescribeScriptOutput {
  
  @scala.inline
  def apply(): DescribeScriptOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScriptOutput]
  }
  
  @scala.inline
  implicit class DescribeScriptOutputMutableBuilder[Self <: DescribeScriptOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScript(value: Script): Self = StObject.set(x, "Script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptUndefined: Self = StObject.set(x, "Script", js.undefined)
  }
}
