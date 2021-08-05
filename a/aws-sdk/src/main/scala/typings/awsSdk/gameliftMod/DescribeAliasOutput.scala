package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAliasOutput extends StObject {
  
  /**
    * The requested alias resource.
    */
  var Alias: js.UndefOr[typings.awsSdk.gameliftMod.Alias] = js.undefined
}
object DescribeAliasOutput {
  
  inline def apply(): DescribeAliasOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAliasOutput]
  }
  
  extension [Self <: DescribeAliasOutput](x: Self) {
    
    inline def setAlias(value: Alias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
  }
}
