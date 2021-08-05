package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCommandsResult extends StObject {
  
  /**
    * An array of Command objects that describe each of the specified commands.
    */
  var Commands: js.UndefOr[typings.awsSdk.opsworksMod.Commands] = js.undefined
}
object DescribeCommandsResult {
  
  inline def apply(): DescribeCommandsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommandsResult]
  }
  
  extension [Self <: DescribeCommandsResult](x: Self) {
    
    inline def setCommands(value: Commands): Self = StObject.set(x, "Commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "Commands", js.undefined)
    
    inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "Commands", js.Array(value :_*))
  }
}
